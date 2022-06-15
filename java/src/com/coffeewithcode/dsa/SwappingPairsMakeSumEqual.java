package com.coffeewithcode.dsa;

import java.util.Arrays;

public class SwappingPairsMakeSumEqual {
	public static void main(String[] args) {

		int n = 6, m = 4;
		long a[] = { 4, 1, 2, 1, 1, 2 };// 11
		long b[] = { 3, 6, 3, 3 };// 15
		System.out.println("is pair is available==" + findSwapValues(a, n, b, m));
	}

	public static int findSwapValues(long A[], int n, long B[], int m) {
		int aSum = 0;
		int bSum = 0;
		int i = 0, j = 0, k = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		while (k < n) {
			aSum += A[k];
			k++;
		}
		k = 0;
		while (k < m) {
			bSum += B[k];
			k++;
		}
		while (i < n && j < m) {
			long p = aSum - A[i] + B[j];
			long q = bSum - B[j] + A[i];
			if (p == q)
				return 1;
			if (p > q) {
				i++;
			} else {
				j++;
			}
		}

		return -1;
	}
}
