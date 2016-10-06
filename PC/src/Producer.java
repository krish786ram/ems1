
public class Producer implements Runnable{

	Container container;
	private int total=15;
	
	Producer(Container container){
		this.container=container;
	}
	
	@Override
	public void run(){
		while(total-->0)
			try {
				container.put();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
}
