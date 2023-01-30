package com.cg.collection.hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Numbers {

	public static void main(String[] args) {
		  HashSet<Integer> evenNumber = new HashSet<>();

	        // Using add() method
	        evenNumber.add(2);
	        evenNumber.add(4);
	        evenNumber.add(6);
	        System.out.println("HashSet: " + evenNumber);

	        
	     // Calling iterator() method
	        Iterator<Integer> iterate = evenNumber.iterator();
	        System.out.print("HashSet using Iterator: ");
	        // Accessing elements
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");

	        }
	}

}
