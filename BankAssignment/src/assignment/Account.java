package assignment;

public class Account {

	private int account_id;
	private double balance;
	
	Account(int account_id,double balance){
		this.account_id=account_id;
		this.balance=balance;
	}
	
    synchronized
	public void deposit(double amount) throws InterruptedException{
		double temp;
		temp=this.balance+amount;
		Thread.sleep(500);
		this.balance=temp;
	} 
	
	synchronized
	public void withdraw(double amount) throws InterruptedException{
		double temp;
		temp=this.balance-amount;
		//Thread.sleep(2000);
		this.balance=temp;
	}
	
	public double getBalance(){
		return balance;
	}
}
