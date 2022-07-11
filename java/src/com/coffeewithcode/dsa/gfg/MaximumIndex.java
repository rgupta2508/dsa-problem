package com.coffeewithcode.dsa.gfg;

public class MaximumIndex {
	public static void main(String[] args) {
		int n = 9;
		int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };

		// 34,8,8,3,2,2,2,2,1
		// 88,88,88,88,88,88,33,33,1
		System.out.println(maxIndexDiff(a, n));
	}

	static int maxIndexDiff(int arr[], int n) {

		int maxDiff;
		int i, j;

		int RMax[] = new int[n];
		int LMin[] = new int[n];

		/*
		 * Construct LMin[] such that LMin[i] stores the minimum value from (arr[0],
		 * arr[1], ... arr[i])
		 */
		LMin[0] = arr[0];
		for (i = 1; i < n; ++i)
			LMin[i] = Math.min(arr[i], LMin[i - 1]);

		/*
		 * Construct RMax[] such that RMax[j] stores the maximum value from (arr[j],
		 * arr[j+1], ..arr[n-1])
		 */
		RMax[n - 1] = arr[n - 1];
		for (j = n - 2; j >= 0; --j)
			RMax[j] = Math.max(arr[j], RMax[j + 1]);

		/*
		 * Traverse both arrays from left to right to find optimum j - i This process is
		 * similar to merge() of MergeSort
		 */
		i = 0;
		j = 0;
		maxDiff = -1;
		while (j < n && i < n) {
			if (LMin[i] <= RMax[j]) {
				maxDiff = Math.max(maxDiff, j - i);
				j = j + 1;
			} else
				i = i + 1;
		}

		return maxDiff;

	}

}
