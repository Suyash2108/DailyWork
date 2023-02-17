package com.cg.oops.inheritance;

public class Bike {

	 public void run() {
		    System.out.println("Bike is running");
		  }
}
//super Keyword in Inheritance
class R15 extends Bike {

	  // overriding the eat() method
	  @Override
	  public void run() {

	    // call method of superclass
	    super.run();
	    System.out.println("R15 is running");
	  }

	  // new method in subclass
	  public void breaks() {
	    System.out.println("R15 is stpped ");
	  }
	}

	