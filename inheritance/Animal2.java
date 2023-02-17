package com.cg.oops.inheritance;

public class Animal2 {


		public static void main(String []args) {
			  Dog labrador = new Dog();

			    // access field of superclass
			    labrador.name = "Rohu";
			    labrador.display();

			    // call method of superclass
			    // using object of subclass
			    labrador.eat();
		}
			  }



