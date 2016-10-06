package mypack;

public class RunnableDemoWithLambda {
	
	public static void main(String[] args) {
	/*	Runnable r = new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
			
		};
		
		Thread t = new Thread(r);
		
		t.start();*/
		
		
		Runnable r1 = () ->System.out.println(Thread.currentThread().getName());
		
		new Thread(r1,"mythread").start();
				
	}

}
