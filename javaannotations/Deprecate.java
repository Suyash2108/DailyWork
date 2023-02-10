package com.cg.javaannotations;

public class Deprecate {

	@Deprecated
	  public static void deprecatedMethod() { 
	    System.out.println("Deprecated method"); 
	  } 
	
	public static void main(String[] args) {
		deprecatedMethod();
	}

}
