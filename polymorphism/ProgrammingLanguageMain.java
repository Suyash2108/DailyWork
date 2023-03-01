package com.cg.oops.polymorphism;

public class ProgrammingLanguageMain {

	public static void main(String[] args) {
		
		 // declare an object variable
	    ProgrammingLanguage pl;

	    // create object of ProgrammingLanguage
	    pl = new ProgrammingLanguage();
	    pl.display();

	    // create object of Java class
	    pl = new Ruby();
	    pl.display();
	  }
	}

