package com.cg.collection.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Iterating {

	public static void main(String[] args) {
		ArrayDeque<String> names = new ArrayDeque<>();
		names .add("Yash");
		names .add("Rohan");
		names .add("Omkar");

        System.out.print("ArrayDeque: ");

        // Using iterator()
        Iterator<String> iterate = names .iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = names .descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
    }


}
