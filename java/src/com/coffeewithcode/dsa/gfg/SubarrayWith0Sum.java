package com.coffeewithcode.dsa.gfg;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWith0Sum {
	public static void main(String[] args) {

		int arr[] = { 3, 2, -3, 1, 6 };
		System.out.println(findsum(arr, arr.length));
	}

	static boolean findsum(int arr[], int n) {
		// Your code here
		Set<Integer> hs = new HashSet<Integer>();
		int sum = 0;
// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}
		return false;
	}

}
