package com.coffeewithcode.dsa;

import java.util.HashMap;

public class CountPairsWithGivenSum {
	public static void main(String[] args) {
		CountPairsWithGivenSum a = new CountPairsWithGivenSum();
		int n = 4, k = 6;
		int arr[] = { 1, 5, 7, 1 };
		System.out.println(a.getPairsCount(arr, n, k));
	}

	int getPairsCount(int[] arr, int n, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Store counts of all elements in map hm
		for (int i = 0; i < n; i++) {

			// initializing value to 0, if key not found
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);

			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		int twiceCount = 0;

		// iterate through each element and increment the
		// count (Notice that every pair is counted twice)
		for (int i = 0; i < n; i++) {
			if (hm.get(k - arr[i]) != null)
				twiceCount += hm.get(k - arr[i]);

			// if (arr[i], arr[i]) pair satisfies the
			// condition, then we need to ensure that the
			// count is decreased by one such that the
			// (arr[i], arr[i]) pair is not considered
			if (k - arr[i] == arr[i])
				twiceCount--;
		}

		// return the half of twice_count
		return twiceCount / 2;
	}
}
