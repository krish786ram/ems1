  package com.test;

import com.barclays.Employee;
import com.barclays.Permanant.PermanantEmployee;
import com.barclays.contractbased.ContractBasedEmployee;
import com.date.Date;

public class Test3 {

	public static void main(String[] args) {
		
	      Date d1=new Date(10,7,2016);
	    // System.out.println(d1);
	      PermanantEmployee e=new PermanantEmployee(d1,20000);
	     e.setData("Pooja","Sharma","developer",500);
	     e.getData();
	     
	   Date d2=new Date(1,8,2015);
	   ContractBasedEmployee e1=new ContractBasedEmployee(d2,1000,8);
	     e1.setData("Neha","Gupta","Designer",500);
	     e1.getData();
	     
	    
	     Employee.getNoOfEmployee();
	     Employee.getNoOfPermanantEmployee();
	     Employee.getNoOfContractBasedEmployee();
	     Integer x=5+new Integer(6);
	       
	}

}
