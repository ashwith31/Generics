package com.genericsprograms;

import java.util.Scanner;

/*
 * Program to test the maximum of values.
 * @author Ashwith
 */
public class TestMaximum {
	// creating a scanner object to get the input from user
	static Scanner sc = new Scanner(System.in);

	/*
	 * This method finds the maximum of three Integer objects. There is no return
	 * type or parameters passed.
	 */
	public static void findMaxInt() {
		// Initializing objects.
		Integer x, y, z;
		System.out.println("Enter three Integers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		// assuming x to be the maximum object.
		Integer max = x;
		if (max.compareTo(y) < 0) {
			max = y;
		}
		if (max.compareTo(z) < 0) {
			max = z;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		findMaxInt();

	}
}
