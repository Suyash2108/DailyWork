package com.cg.collection.priorityqueue;

import java.util.PriorityQueue;

public class Numbers {

	public static void main(String[] args) {
		PriorityQueue<Integer> number = new PriorityQueue<>();

        // Using the add() method
        number.add(7);
        number.add(5);
        number.add(3);
        System.out.println("PriorityQueue: " + number);

        // Using the offer() method
        number.offer(1);
        System.out.println("Updated PriorityQueue: " + number);
        
        // Using the peek() method
        int numbers = number.peek();
        System.out.println("Accessed Element: " + numbers);
        
     


	}

}
