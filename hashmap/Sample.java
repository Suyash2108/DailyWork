package com.cg.collection.hashmap;

import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
	
		    HashMap<Integer, String> languages = new HashMap<>();
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    System.out.println("HashMap: " + languages);

		    // get() method to get value
		    String value = languages.get(1);
		    System.out.println("Value at index 1: " + value);
		 
		    // using keySet()
		    System.out.println("Keys: " + languages.keySet());

		    // return set view of values
		    // using values()
		    System.out.println("Values: " + languages.values());

		    // return set view of key/value pairs
		    // using entrySet()
		    System.out.println("Key/Value mappings: " + languages.entrySet());
		    
		 // remove element associated with key 2
		    String val = languages.remove(2);
		    System.out.println("Removed value: " + val);

		    System.out.println("Updated HashMap: " + languages);

	}

}