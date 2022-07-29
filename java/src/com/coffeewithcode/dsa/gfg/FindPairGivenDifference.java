package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;

public class FindPairGivenDifference {
	public static void main(String[] args) {
		int L = 6, N = 78;
		int arr[] = { 5, 20, 3, 2, 5, 80 };
		System.out.println(findPair(arr, L, N));
	}

	public static boolean findPair(int arr[], int size, int n) {
		// code here.

		Arrays.sort(arr);
		Arrays.sort(arr);
		int p1 = 0, p2 = 1;
		while (p1 < size && p2 < size) {
			if (arr[p2] - arr[p1] == n && p1 != p2) {
				return true;
			} else if (arr[p2] - arr[p1] > n) {
				p1++;
			} else {
				p2++;
			}
		}
		return false;
	}
}
