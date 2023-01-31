package com.cg.collection.arraydeque;

import java.util.ArrayDeque;

public class Products {

	public static void main(String[] args) {
		 ArrayDeque<String> products= new ArrayDeque<>();

	        // Using add()
		 products.add("Pen");

	        // Using addFirst()
		 products.addFirst("Soap");

	        // Using addLast()
		 products.addLast("Bottle");
	        System.out.println("ArrayDeque: " + products);
	        
	        // Get the first element
	        String firstElement = products.getFirst();
	        System.out.println("First Element: " + firstElement);

	        // Get the last element
	        String lastElement = products.getLast();
	        System.out.println("Last Element: " + lastElement);
	        
	        // Using remove()
	        String element = products.remove();
	        System.out.println("Removed Element: " + element);

	        System.out.println("New ArrayDeque: " + products);

	        // Using removeFirst()
	        String firstEle = products.removeFirst();
	        System.out.println("Removed First Element: " + firstEle);

	        // Using removeLast()
	        String lastEle = products.removeLast();
	        System.out.println("Removed Last Element: " + lastEle);
	        
	}

	}


