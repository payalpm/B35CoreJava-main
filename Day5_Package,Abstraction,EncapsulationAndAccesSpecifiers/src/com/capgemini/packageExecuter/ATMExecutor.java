package com.capgemini.packageExecuter;

import java.util.Scanner;


import com.capgemini.packageDemo.ATM;

//driver class
public class ATMExecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
		

	}

}
