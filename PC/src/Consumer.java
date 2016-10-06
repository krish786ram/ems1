
public class Consumer implements Runnable {

	Container container;
	private int total=15;
	
	Consumer(Container container){
		this.container=container;
	}
	
	@Override
	public void run(){
		while(total-->0){
			try {
				container.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
