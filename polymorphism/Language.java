package com.cg.oops.polymorphism;


// Polymorphism using method overriding
public class Language {
	 public void displayInfo() {
		    System.out.println("Common English Language");
		  }
		}

		class Java extends Language {
		  @Override
		  public void displayInfo() {
		    System.out.println("Java Programming Language");
		  }
		}

