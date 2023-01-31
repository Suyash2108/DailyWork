package com.cg.collection.linkedlistqueue;

import java.util.LinkedList;

public class Languages {

	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();

	    // add elements in the linked list
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);

	    // get the element from the linked list
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);

	    System.out.println("");
	    
	 // change elements at index 3
	    languages.set(2, "Kotlin");
	    System.out.println("Updated LinkedList: " + languages);
	    
	 

	}

}
