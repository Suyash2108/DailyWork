package com.cg.collection.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Iterating {

	public static void main(String[] args) {
		
	PriorityQueue<String> names = new PriorityQueue<>();
	names.add("Pranav");
	names.add("Akshay");
	names.add("Bhushan");
    System.out.print("PriorityQueue using iterator(): ");

    //Using the iterator() method
    Iterator<String> iterate = names .iterator();
    while(iterate.hasNext()) {
        System.out.print(iterate.next());
        System.out.print(", ");
    }
	}
}
