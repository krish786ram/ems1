package com.barclays;

public class Person { // Data Member
	private String name;
	private int age;
	private static int count;

	// Member Methods
	public Person() {
		name = "Not Available";
		age = 18;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    public static int getCount()
    {
    	return Person.count;
    }
}
