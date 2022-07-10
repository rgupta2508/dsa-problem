package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;

public class MinimizeTheSumOfProduct {
	public static void main(String[] args) {
		long n = 3;
		long a[] = { 3, 1, 1 };
		long b[] = { 6, 5, 4 };
		System.out.println(minValue(a, b, n));
	}

	public static long minValue(long a[], long b[], long n) {
		// Your code goes here
		Arrays.sort(a);
		Arrays.sort(b);
		long sum = 0;
		for (long i = 0, j = n - 1; i < n; i++, j--) {
			sum = sum + a[(int) i] * b[(int) j];
		}

		return sum;
	}

}
