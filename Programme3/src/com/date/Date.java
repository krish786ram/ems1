package com.date;

public class Date 
{
	private int dd,mm,yyyy;
	  
	   Date()
	   {}
	   public Date(int dd,int mm,int yyyy)
	    { this.dd=dd;this.mm=mm;this.yyyy=yyyy;
	      
	    }

	   public String toString()
	    { return dd+"-"+mm+"-"+yyyy;
	    }
}
