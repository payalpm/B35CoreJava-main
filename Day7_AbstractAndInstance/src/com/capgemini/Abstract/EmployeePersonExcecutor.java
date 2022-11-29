package com.capgemini.Abstract;

public class EmployeePersonExcecutor {

	public static void main(String[] args) {
		Employees p1=new Employees("Payal","female" , 25);
		Employees p2=new Employees("Shiwani Mam","Female" , -4);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		((Employees) p1).work();
		((Employees) p2).work();
		
	}

}