package com.test;

public class Test4 {

	public static void main(String[] args) 
	{
		int distance=90;
		System.out.println("some logic is being executed");
		assert(distance>0);
		System.out.println("some logic is being executed");
		distance=-90;
		assert(distance>0):"distance is negative value"+distance;
		System.out.println("some logic is executed");
	}

}
