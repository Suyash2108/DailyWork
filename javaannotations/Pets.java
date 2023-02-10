package com.cg.javaannotations;

public class Pets {
	
	public void displayInfo() {
	    System.out.println("I am an animal.");
	  }
	}

	class Dog extends Pets {
	  @Override
	  public void displayInfo() {
	    System.out.println("I am a dog.");
	  }
	}

	