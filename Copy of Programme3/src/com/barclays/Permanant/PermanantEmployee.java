package com.barclays.Permanant;

import com.barclays.Employee;
import com.date.Date;

public class PermanantEmployee extends Employee
{
  
  public PermanantEmployee() {
		
	}
  public PermanantEmployee(Date d,int salary) {
	super(d,salary);
	permanantemployee++;
}
/*public void setSalary(int salary)
  {
	  this.salary=salary;
  }*/
  public void setData(String FirstName,String LastName,String grade,int salary,int salarydrawn)
  {
     super.setData(FirstName,LastName,grade,salarydrawn);
  //   setSalary(salary);
  }
}
