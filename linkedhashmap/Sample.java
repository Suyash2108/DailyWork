package com.cg.collection.linkedhashmap;

import java.util.LinkedHashMap;

public class Sample {
	 public static void main(String[] args) {
	     
	        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

	        // Using put()
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);
	        System.out.println("Original LinkedHashMap: " + evenNumbers);

	        // Using putIfAbsent()
	        evenNumbers.putIfAbsent("Six", 6);
	        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

	        //Creating LinkedHashMap of numbers
	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
	        numbers.put("One", 1);

	        // Using putAll()
	        numbers.putAll(evenNumbers);
	        System.out.println("New LinkedHashMap: " + numbers);
	        
	        // Using keySet()
	        System.out.println("Keys: " + numbers.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers.values());
	    
	    }
}
