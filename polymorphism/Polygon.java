package com.cg.oops.polymorphism;

public class Polygon {

		  public void render() {
		    System.out.println("Rendering Polygon...");
		  }
		}

		class Square extends Polygon {

		  // renders Square
		  public void render() {
		    System.out.println("Rendering Square...");
		  }
		}

		class Circle extends Polygon {

		  // renders circle
		  public void render() {
		    System.out.println("Rendering Circle...");
		  }
		}

		