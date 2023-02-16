package com.cg.oops;

public class Methods {
	
	public int addNumbers(int a, int b) {
	    int sum = a + b;
	   
	    return sum;
	}

	public static void main(String[] args) {
		
		int num1 = 25;
	    int num2 = 15;
	    
	    Methods m1 = new Methods();
	    
	    int result = m1.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);



	}

}
