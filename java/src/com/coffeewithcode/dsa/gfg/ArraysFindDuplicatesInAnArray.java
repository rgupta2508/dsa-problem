package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class ArraysFindDuplicatesInAnArray {
	public static void main(String[] args) {
		int n = 5;
		int a[] = { 2, 3, 1, 2, 3 };
		ArrayList<Integer> result = duplicates(a, n);
		for (int i : result) {
			System.out.println(i);
		}
	}

	/*
	 * Approach: The basic idea is to use a HashMap to solve the problem. But there
	 * is a catch, the numbers in the array are from 0 to n-1, and the input array
	 * has length n. So, the input array can be used as a HashMap. While Traversing
	 * the array, if an element ‘a’ is encountered then increase the value of a%n‘th
	 * element by n. The frequency can be retrieved by dividing the a % n’th element
	 * by n.
	 */
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		// code here
		// First check all the values that are present in an array then go to that
		// values as indexes and increment by the size of array
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int index = arr[i] % n;
			arr[index] = arr[index] + n;
		}

		// Now check which value exists more than once by dividing with the size of
		// array
		for (int i = 0; i < n; i++) {
			// System.out.println("###Index: " + i + " Value " + arr[i]);
			if ((arr[i] / n) >= 2) {
				result.add(i);
			}
		}
		if (result.size() == 0) {
			result.add(-1);
		}
		return result;
	}
}
