package com.coffeewithcode.dsa;

public class AllocateMinimumNumberOfPages {
	public static void main(String[] args) {

		int N = 4;
		int arr[] = { 12, 34, 67, 90 };
		int M = 2;
		System.out.println(findPages(arr, N, M));
	}

	public static int findPages(int[] arr, int n, int m) {
		int sum = 0;

		// return -1 if no. of books is less than
		// no. of students
		if (n < m)
			return -1;

		// Count total number of pages
		for (int i = 0; i < n; i++)
			sum += arr[i];

		// initialize start as arr[n-1] pages(minimum answer possible) and end as
		// total pages(maximum answer possible)
		int start = arr[n - 1], end = sum;
		int result = sum;//Integer.MAX_VALUE;

		// traverse until start <= end
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isFeasible(arr, m, mid)) {
				// update result to current distribution
				// as it's the best we have found till now.
				result = mid;

				// as we are finding minimum so,
				end = mid - 1;
			}

			else
				// if not possible, means pages should be
				// increased ,so update start = mid + 1
				start = mid + 1;
	        }
	        
	        // at-last return minimum no. of  pages
	        return result;
	}

	static boolean isFeasible(int arr[], int m, int min) {
		int studentsRequired = 1;
		int currentSum = 0;

		// iterate over all books
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (currentSum > min) {
				studentsRequired++; // increment student count
				currentSum = arr[i]; // update curr_sum
			}
		}

		return studentsRequired <= m;
	}

}
