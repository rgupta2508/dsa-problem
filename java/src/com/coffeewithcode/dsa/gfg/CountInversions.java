package com.coffeewithcode.dsa.gfg;

// Java implementation of the approach
import java.util.Arrays;

public class CountInversions {

	// Function to count the number of inversions
	// during the merge process
	static long inversionCount(long arr[], long N) {
		// Your Code Here
		return mergeSortAndCount(arr, 0, N - 1);
	}

	private static long mergeAndCount(long[] arr, long l, long m, long r) {

	long[] left = Arrays.copyOfRange(arr, (int) l, (int) (m + 1));
	long[] right = Arrays.copyOfRange(arr, (int) (m + 1), (int) (r + 1));

		long i = 0, j = 0, k = l, swaps = 0;

		while (i < left.length && j < right.length) {
			if (left[(int) i] <= right[(int) j])
				arr[(int) k++] = left[(int) i++];
			else {
				arr[(int) k++] = right[(int) j++];
				swaps += (m + 1) - (l + i);
			}
		}
		while (i < left.length)
			arr[(int) k++] = left[(int) i++];
		while (j < right.length)
			arr[(int) k++] = right[(int) j++];
		return swaps;
	}

	private static long mergeSortAndCount(long[] arr, long l, long r) {
		long count = 0;

		if (l < r) {
			long m = (l + r) / 2;
			count += mergeSortAndCount(arr, l, m);
			count += mergeSortAndCount(arr, m + 1, r);
			count += mergeAndCount(arr, l, m, r);
		}

		return count;
	}

	// Driver code
	public static void main(String[] args) {
		long[] arr = { 2, 4, 1, 3, 5 };

		System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
	}
}

// This code is contributed by Pradip Basak