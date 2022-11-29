package com.capgemini.Abstract;

public class ATMMachineChild extends ATmmachine {

	//provided the implementation to abstract method of parent class
	@Override
	void withdraw() {
		int balance=5000;
		System.out.println("Withdrawing Amount is: "+balance);
		
	}
	

}