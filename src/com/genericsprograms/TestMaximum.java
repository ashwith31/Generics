package com.genericsprograms;

import java.util.Scanner;

/*
 * Program to test the maximum of values.
 * @author Ashwith
 */
public class TestMaximum<Z extends Comparable<Z>> {

	Z first, second, third;

	public TestMaximum(Z first, Z second, Z third) {
		this.first = first;
		this.second = second;
		this.third = third;
		// calling the static method inside constructor
		testMaximum(first, second, third);
	}

	/*
	 * This method uses the concept of Generics and finds the maximum of three of
	 * them.
	 * 
	 * @param first,second and third of any data type.
	 * 
	 * @return returns the maximum object.
	 */
	public static <Z extends Comparable<Z>> void testMaximum(Z first, Z second, Z third) {
		// assuming first to be maximum
		Z maximum = first;
		if (second.compareTo(maximum) > 0)
			maximum = second;
		if (third.compareTo(maximum) > 0)
			maximum = third;
		System.out.println(maximum);

	}

	public static void main(String[] args) {

		new TestMaximum(11, 28, 35);
		new TestMaximum("Apple", " Peach", "Banana");
		new TestMaximum(1.3, 11.3, 111.3);
	}
}
