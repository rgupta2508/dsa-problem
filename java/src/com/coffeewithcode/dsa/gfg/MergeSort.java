
//Refrence https://www.geeksforgeeks.org/quick-sort/

package com.coffeewithcode.dsa.gfg;

class MergeSort {

	void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			left[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			right[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

// Function to print an array
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

// Driver Code
	public static void main(String[] args) {
		int[] arr = { 10, 7, 3, 2 };
		int n = arr.length;
		MergeSort ob = new MergeSort();

		ob.mergeSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr);
	}
}
