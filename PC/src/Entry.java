
public class Entry {
	public static void main(String[] args) throws InterruptedException {
		Container container=new Container();
		
		Producer p=new Producer(container);
		Consumer c=new Consumer(container);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t1.start();
		t2.start();
		
	}
}
