package com.cg.collection.linkedlist;

import java.util.LinkedList;

public class Products {

	public static void main(String[] args) {
		// create linkedlist
	    LinkedList<String> products = new LinkedList<>();

	    // add() method without the index parameter
	    products.add("Dog");
	    products.add("Cat");
	    products.add("Cow");
	    System.out.println("LinkedList: " + products);

	    // add() method with the index parameter
	    products.add(1, "Horse");
	    System.out.println("Updated LinkedList: " + products);
	  }
	}


