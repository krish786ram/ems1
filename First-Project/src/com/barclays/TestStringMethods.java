package com.barclays;

import static org.junit.Assert.assertSame  ;

import org.junit.Assert;
import org.junit.Test;

public class TestStringMethods {

	@Test
	public void test() {
		String message1=new String("Hello world!");
		String message2="Hello world!";
		String message3="Hello world!";
		String message4=new String("Hello world!");
		
		Assert.assertSame(message2, message3);
		Assert.assertSame(message1, message4);
	}

}
