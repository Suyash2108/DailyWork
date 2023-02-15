package com.cg.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		       
		        int[][] a = {
		            {1, 2, 3}, 
		            {4, 5, 6, 9}, 
		            {7,2}, 
		        };
		      // calculate the length of each row
		        System.out.println("Length of row 1: " + a[0].length);
		        System.out.println("Length of row 2: " + a[1].length);
		        System.out.println("Length of row 3: " + a[2].length);
		        
		     // first for...each loop access the individual array
		        for (int[] innerArray: a) {
		        	
		        	System.out.println();
		            // second for...each loop access each element inside the row
		            for(int data: innerArray) {
		                System.out.println(data);
		            }
		        }

		    }
		}

