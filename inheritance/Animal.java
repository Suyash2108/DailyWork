package com.cg.oops.inheritance;

public class Animal {
	
	String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
}
	  class Dog extends Animal {

		  // new method in subclass
		  public void display() {
		    System.out.println("My name is " + name);
		  }
	  }
	  


