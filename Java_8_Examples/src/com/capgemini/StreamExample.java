package com.capgemini;

import java.util.LinkedList;

public class StreamExample {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		
		l.add("a");
		l.add("");
		
		l.add("");
		
		l.add("b");
		
		System.out.println(l);
		
		for(String s:l)
		{
			//business logic
		}
				
		int count = (int)l.stream().filter(string -> string.isEmpty()).count();
		
	}

}
