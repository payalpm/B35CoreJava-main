package com.capgemini.Instance;

//abstract class
abstract class Animal
{
	abstract void accept();
}
//implementable child class for the abstract class
class Lion extends Animal
{

	@Override
	void accept() {
		System.out.println("Lion Roars");
	}
	
}
//driver class
public class Instance {

	public static void main(String[] args) {
		//Animal l=new Lion();
		Lion l=new Lion();
		l.accept();
		//instance operator
		System.out.println(l instanceof Lion);
		System.out.println(l instanceof Animal);

	}

}