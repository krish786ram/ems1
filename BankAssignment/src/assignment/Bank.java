package assignment;

import java.util.ArrayList;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Account> accounts=new ArrayList<>();
	
		Account acc1=new Account(1,15000);
		accounts.add(acc1);
		Account acc2=new Account(2,80000);
		accounts.add(acc2);
		Account acc3=new Account(3,25000);
		accounts.add(acc3);
		Account acc4=new Account(4,21000);
		accounts.add(acc4);
		Account acc5=new Account(5,7000);
		accounts.add(acc5);
		
		System.out.println("total balance in bank "+totalBalanceInBank(accounts));
		
		TransactionManager tm=new TransactionManager();
		
		Runnable target1=new Runnable(){
			public void run() {
				try {
					tm.transferAmount(acc3, acc2,7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		};
		
		Runnable target2=new Runnable(){
			public void run() {
				try {
					tm.transferAmount(acc2, acc5,2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		};
		
		System.out.println("before transfer 1");
		System.out.println(acc3.getBalance());
		System.out.println(acc2.getBalance());
		
		Thread t1=new Thread(target1);
		t1.start();
					
		System.out.println("before transfer 2");
		System.out.println(acc2.getBalance());
		System.out.println(acc5.getBalance());
		
		new Thread(target2).start();
		t1.sleep(10);
		
		Thread.sleep(1000);
		
		System.out.println("after transfer 1 ");
		System.out.println(acc3.getBalance());
		System.out.println(acc2.getBalance());
		
		System.out.println("after transfer 2");
		System.out.println(acc2.getBalance());
		System.out.println(acc5.getBalance());
		
		System.out.println("total balance in bank "+totalBalanceInBank(accounts));
		
	}
	
	public static double totalBalanceInBank(ArrayList<Account> accounts){
		double balance=0.0;
		for(Account acc:accounts){
			balance+=acc.getBalance();
		}
		return balance;
	}
}
