package com.coffeewithcode.dsa;

public class FindMissingAndRepeating {
	public static void main(String[] args) {
		int n = 4;
		int arr[] = { 1, 2, 4, 4 };// 22-10
		// 1-2+3-4+5-6+7-8
		FindMissingAndRepeating a = new FindMissingAndRepeating();
		int arr1[] = a.findTwoElement(arr, n);
		for (int i : arr1) {
			System.out.println(i);
		}
	}

	int[] findTwoElement(int arr[], int n) {
		int res[] = new int[2];
		int repeating = 0;
		int missing = 0;

		// code here
		int i = 0;

		// Traverse on the array
		while (i < n) {
			// If the element is on its correct position
			if (arr[i] == arr[arr[i] - 1]) {
				i++;
			} else {
				// If it is not at its correct position then
				// place it to its correct position.
				if (arr[i] != arr[arr[i] - 1]) {
					swap(arr, i, arr[i] - 1);
				}
			}
		}
		for (i = 0; i < n; i++) {
			// If any element is not in its correct position
			if (arr[i] != i + 1) {
				repeating = arr[i];
				missing = i + 1;
				break;
			}
		}

		res[0] = repeating;
		res[1] = missing;

		return res;

	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
