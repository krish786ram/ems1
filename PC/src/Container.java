
public class Container {
	private int size;
	private int i=1;
	Container(){
		size=0;
	}
	
	public void put() throws InterruptedException{
		synchronized (this) {
			
		while(size==1)
			this.wait();
		
		Thread.sleep(500);
		
		System.out.println("Producing a product "+i);
		
		size=1;
		
		this.notify();
		}
	}
	
	public void get() throws InterruptedException{
	   synchronized (this) {
		   
		while(size!=1)
			this.wait();
		
		Thread.sleep(550);
		
		System.out.println("Consuming a product "+i++);
		
		size=0;
		
		this.notify();
	   }	
	}
}
