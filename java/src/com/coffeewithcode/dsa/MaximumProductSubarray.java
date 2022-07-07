package com.coffeewithcode.dsa;

public class MaximumProductSubarray {
	public static void main(String[] args) {
		MaximumProductSubarray a = new MaximumProductSubarray();
		int n = 5;
		int arr[] = { 6, -3, -10, 0, 2 };
		System.out.println(a.maxProduct(arr, n));
	}

	long maxProduct(int[] arr, int n) {

		long currmax = 1;
		long msf = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			currmax *= arr[i];
			msf = Math.max(msf, currmax);
			if (currmax == 0) {
				currmax = 1;
			}
		}
		currmax = 1;
		for (int i = n - 1; i >= 0; i--) {
			currmax *= arr[i];
			msf = Math.max(msf, currmax);
			if (currmax == 0) {
				currmax = 1;
			}
		}
		return msf;
	}
}
