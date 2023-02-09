package com.cg.exceptionhandling;

public class ThrowKeyword {

	public static void divideByZero() {
	    throw new ArithmeticException("Trying to divide by 0");
	  }

	  public static void main(String[] args) {
	    divideByZero();
	  }
}