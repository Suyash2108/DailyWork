package com.cg.javaannotations;

import java.util.ArrayList;

public class Suppress {
	@SuppressWarnings("unchecked")
	  static void wordsList() {
	    ArrayList wordList = new ArrayList<>();

	    wordList.add("programiz"); 

	    System.out.println("Word list => " + wordList);
	  }

	public static void main(String[] args) {
		wordsList();
	}

}
