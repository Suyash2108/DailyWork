package com.cg.oops.polymorphism;


// Polymorphic Variables
public class ProgrammingLanguage {
	
	public void display() {
	    System.out.println("I am Programming Language.");
	  }
	}

	class Ruby extends ProgrammingLanguage {
	  @Override
	  public void display() {
	    System.out.println("I am Object-Oriented Programming Language.");
	  }
	}


	