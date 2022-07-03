package com.coffeewithcode.dsa;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		int n = 5, s = 15;
		int a[] = { 1, 2, 3, 7, 5 };
		System.out.println(subarraySum(a, n, s));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

		ArrayList<Integer> sumArr = new ArrayList<>();
		int curr_sum = arr[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= n; i++) {
			// If curr_sum exceeds the sum,
			// then remove the starting elements
			while (curr_sum > s && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			// If curr_sum becomes equal to sum,
			// then return true
			if (curr_sum == s) {
				int p = i;
				System.out.println("Sum found between position " + (start + 1) + " and " + p);
				sumArr.add(start + 1);
				sumArr.add(p);
				return sumArr;
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}

		System.out.println("No subarray found");
		return new ArrayList<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(-1);
			}
		};

	}

}
