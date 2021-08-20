package com.genericsprograms;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Program to test the maximum of values.
 * @author Ashwith
 */
public class TestMaximum<Z extends Comparable<Z>> {
	// initializing array
	Z[] elements;

	public TestMaximum(Z[] elements) {
		this.elements = elements;
		// calling the static method inside constructor
		testMaximum(elements);
	}

	/*
	 * This method uses the concept of Generics and finds the maximum of three of
	 * them.
	 * 
	 * @param array of objects
	 * 
	 */
	public static <Z extends Comparable<Z>> void testMaximum(Z[] elements) {
		/*
		 * Calling the sort method from Arrays class.
		 */
		Arrays.sort(elements);
		
		System.out.println(elements[elements.length - 1] + " is the maximum");

	}

	public static void main(String[] args) {

		Integer[] intelements = { 11, 16, 45, 89, 56 };
		new TestMaximum(intelements);
		Float[] floatelements = {11.22f,14.56f,85.9f,111.23f,45.98f};
		new TestMaximum(floatelements);
		String[] values= {"Apple","Peach","Banana","Mango","Strawberry"};
		new TestMaximum(values);
	}
}
