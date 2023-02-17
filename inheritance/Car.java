package com.cg.oops.inheritance;



//  Method overriding in Java Inheritance
public class Car {
	
	public void run() {
	    System.out.println("Car is running");
	  }
	}


class BMW extends Car {

	  // overriding the eat() method
	  @Override
	  public void run() {
	    System.out.println("BMW is running");
	  }

	  // new method in subclass
	  public void breaks() {
	    System.out.println("Bmw is stopped");
	  }
	}

