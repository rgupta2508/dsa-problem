package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraysFindDuplicatesInAnArray {
	public static void main(String[] args) {
		int n = 5;
		int a[] = { 2, 3, 1, 2, 3 };
		ArrayList<Integer> result = duplicates(a, n);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		// code here
		// First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int index = arr[i] % n;
			arr[index] += n;
		}

		// Now check which value exists more
		// than once by dividing with the size
		// of array
		for (int i = 0; i < n; i++) {
			if ((arr[i] / n) >= 2) {
				result.add(i);
			}
		}
		if(result.size()==0) {
			result.add(-1);
		}
		return result;
	}
}
