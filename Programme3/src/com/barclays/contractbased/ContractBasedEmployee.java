package com.barclays.contractbased;

import com.barclays.Employee;
import com.date.Date;

public class ContractBasedEmployee extends Employee{
	
	  public ContractBasedEmployee() {
			
		}
	  public ContractBasedEmployee(Date d,int rateperhour,int hour) {
		super(d,rateperhour,hour);
		contractbasedemployee++;
	}
	/*public void setSalary(int rateperhour,int hour)
	  {
		  salary=rateperhour*hour;
	  }*/
	  public void setData(String FirstName,String LastName,String grade,int salarydrawn)
	  {
	     super.setData(FirstName,LastName,grade,salarydrawn);
	     //setSalary(rateperhour,hour);
	  }
}
