package com.cg.string;

public class SbLengthAndCapacity {

	public static void main(String[] args) {
		
				StringBuffer s = new StringBuffer("JustDoIt");

				// Getting the length of the string
				int p = s.length();

				// Getting the capacity of the string
				int q = s.capacity();

				System.out.println("Length of string JustDoIt="
								+ p);
				System.out.println(
					"Capacity of string JustDoIt=" + q);
			

	}

}
