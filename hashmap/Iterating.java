package com.cg.collection.hashmap;

import java.util.Map.Entry;
import java.util.HashMap;

public class Iterating {

	public static void main(String[] args) {
		
		    HashMap<Integer, String> languages = new HashMap<>();
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    System.out.println("HashMap: " + languages);

		    // iterate through keys only
		    System.out.print("Keys: ");
		    for (Integer key : languages.keySet()) {
		      System.out.print(key);
		      System.out.print(", ");
		    }

		    // iterate through values only
		    System.out.print("\nValues: ");
		    for (String value : languages.values()) {
		      System.out.print(value);
		      System.out.print(", ");
		    }
		    
		    // iterate through key/value entries
		    System.out.print("\nEntries: ");
		    for (Entry<Integer, String> entry : languages.entrySet()) {
		      System.out.print(entry);
		      System.out.print(", ");
		    }
		  }
		

	}
