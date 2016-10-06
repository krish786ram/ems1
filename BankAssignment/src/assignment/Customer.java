package assignment;

import java.util.ArrayList;

public class Customer {
	private int customer_id;
	private double balance;
	
	ArrayList<Integer> personalAccounts=new ArrayList<>();
	
	Customer(int id,double balance){
		customer_id=id;
		this.balance=balance;
	}
	
	public void addAccount(int id){
		personalAccounts.add(id);
	}
}
