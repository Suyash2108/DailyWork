package com.cg.oops;

public class Biecycle {
	
	int numberOfWheels;
	String nameOftheCycle;
	
	
	void braking() {
		System.out.println("Cycle is applyed Break");
	}

	public static void main(String[] args) {
		
		Biecycle b1 = new Biecycle();
		b1.numberOfWheels=2;
		b1.nameOftheCycle="racing";
		
		
		System.out.println("number of wheels cycle"+":-"+b1.numberOfWheels);
		System.out.println("name of wheels"+":-"+b1.nameOftheCycle);
		b1.braking();
		

	}

}
