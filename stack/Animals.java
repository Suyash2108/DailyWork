package com.cg.collection.stack;

import java.util.Stack;

public class Animals {

	public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
        
     // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        
        // Access element from the top
        String ele = animals.peek();
        System.out.println("Element at top: " + ele);
        
        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    
    }

	}


