package com.capgemini.inheritancedemo;
//parent class 
public class Vehicle {
	private String name;
	public void display()
	{
		System.out.println("The Vehicle name is "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}