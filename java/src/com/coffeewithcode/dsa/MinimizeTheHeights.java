package com.coffeewithcode.dsa;

import java.util.Arrays;

public class MinimizeTheHeights {
	public static void main(String[] args) {
		int[] arr = { 8, 1, 5, 4, 7, 5, 7, 9, 4, 6 };// {3, 9, 12, 16, 20};
		// 3 6 0 -1 2 0 2 4 -1 1
		int k = 5;
		int ans = getMinDiffTowerHightPositive(arr, arr.length, k);
		System.out.println("Node Assume that height of the tower can not be negative.");

		System.out.println(ans);
		System.out.println();

		System.out.println("===========");
		System.out.println("Node Assume that height of the tower can be negative.");
		ans = getMinDiffTowerHeightNegative(arr, arr.length, k);
		System.out.println(ans);
	}

	static int getMinDiffTowerHightPositive(int[] arr, int n, int k) {
		Arrays.sort(arr);
		// Maximum possible height difference
		int ans = arr[n - 1] - arr[0];

		int tempmin, tempmax;
		tempmin = arr[0];
		tempmax = arr[n - 1];

		for (int i = 1; i < n; i++) {

			// if on subtracting k we got negative then
			// continue
			if (arr[i] - k < 0)
				continue;

			// Minimum element when we add k to whole array
			tempmin = Math.min(arr[0] + k, arr[i] - k);

			// Maximum element when we subtract k from whole
			// array
			tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
			ans = Math.min(ans, tempmax - tempmin);
		}
		return ans;
	}

	static int getMinDiffTowerHeightNegative(int[] arr, int n, int k) {
		Arrays.sort(arr);
		// Maximum possible height difference
		int ans = arr[n - 1] - arr[0];

		int tempmin, tempmax;
		tempmin = arr[0];
		tempmax = arr[n - 1];

		for (int i = 1; i < n; i++) {
			// height of the tower can be negative so removing this condition.
			// if (arr[i] - k < 0)
			// continue;

			// Minimum element when we add k to whole array
			tempmin = Math.min(arr[0] + k, arr[i] - k);
			// Maximum element when we subtract k from whole
			// array
			tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
			ans = Math.min(ans, tempmax - tempmin);
		}
		return ans;
	}

}
