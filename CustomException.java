package com.cg.exceptionhandling;

class InvalidProductException extends Exception {
	  public InvalidProductException(String s) {
	    // Call constructor of parent Exception
	    super(s);
	  }
	}

	public class CustomException {
	  void Check(int weight) throws InvalidProductException {
	    if (weight < 50) {
	      //raises exception is weight is less than 50
	      throw new InvalidProductException("Product Invalid");
	    }
	  }

	  public static void main(String args[]) {
		  CustomException obj = new CustomException();
	    try {
	      obj.Check(35);
	    } catch (InvalidProductException ex) {
	      System.out.println("Caught the exception");
	      System.out.println(ex.getMessage());
	    }
	  }
	}
