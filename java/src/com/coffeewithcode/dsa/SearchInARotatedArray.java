// Refrence GFG
package com.coffeewithcode.dsa;

public class SearchInARotatedArray {
	public static void main(String[] args) {
		int n = 9;
		int A[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int key = 10;
		System.out.println("element found at this index " + search(A, 0, n - 1, key));
	}

	public static int search(int arr[], int l, int h, int key) {
		// Complete this function

		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		/* If arr[l...mid] first subarray is sorted */
		if (arr[l] <= arr[mid]) {
			/*
			 * As this subarray is sorted, we can quickly check if key lies in half or other
			 * half
			 */
			if (key >= arr[l] && key <= arr[mid])
				return search(arr, l, mid - 1, key);
			/*
			 * If key not lies in first half subarray, Divide other half into two subarrays,
			 * such that we can quickly check if key lies in other half
			 */
			return search(arr, mid + 1, h, key);
		}

		/*
		 * If arr[l..mid] first subarray is not sorted, then arr[mid... h] must be
		 * sorted subarray
		 */
		if (key >= arr[mid] && key <= arr[h])
			return search(arr, mid + 1, h, key);

		return search(arr, l, mid - 1, key);

	}

}
