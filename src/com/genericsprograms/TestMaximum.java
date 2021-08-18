package com.genericsprograms;

import java.util.Scanner;

/*
 * Program to test the maximum of values.
 * @author Ashwith
 */
public class TestMaximum {
	/*
	 * This method uses the concept of Generics and finds the maximum of three of
	 * them.
	 * 
	 * @param first,second and third of any data type.
	 * 
	 * @return returns the maximum object.
	 */
	public static <Z extends Comparable<Z>> Z findMaximum(Z first, Z second, Z third) {
		// assuming first to be maximum
		Z maximum = first;
		if (second.compareTo(maximum) > 0)
			maximum = second;
		if (third.compareTo(maximum) > 0)
			maximum = third;
		return maximum;
	}

	/**
	 * declaring the main method printing the maximum value of Integer printing the
	 * maximum value of Float printing the maximum value of String
	 */
	public static void main(String[] args) {
		
		Integer num1 = 86, num2 = 99, num3 = 101;
		System.out.println("Maximum value of three Integer Variables :" + findMaximum(num1, num2, num3));
		Float f1 = 56.35f, f2 = 102.55f, f3 = 45.96f;
		System.out.println("Maximum value of three Float Variables :" + findMaximum(f1, f2, f3));
		String name1 = "Apple", name2 = "Peach", name3 = "Banana";
		System.out.println("Maximum value of three String Variables :" + findMaximum(name1, name2, name3));
	}
}
