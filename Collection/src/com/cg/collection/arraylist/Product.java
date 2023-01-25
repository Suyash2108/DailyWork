package com.cg.collection.arraylist;

import java.util.ArrayList;

public class Product {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();

	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    System.out.println("ArrayList: " + languages);
	    
	    
	 // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	    
	    System.out.println("");
	    
	 // change the element of the array list
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	    
	    // remove element from index 2
	    String st = languages.remove(2);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + st);
	    
	  }

	}

