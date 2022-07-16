package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 97, -27, 2, -34, 61, -39 };// {0, -1, 2, -3, 1};

		System.out.println(findTriplets(arr, n));
	}

	public static boolean findTriplets(int arr[], int n) {
		Arrays.sort(arr);

		boolean found = false;
		for (int i = 0; i < n - 1; i++) {

			int l = i + 1;
			int r = n - 1;
			int x = arr[i];
			while (l < r) {
				if (x + arr[l] + arr[r] == 0) {
					l++;
					r--;
					found = true;
					return true;
				} else if (x + arr[l] + arr[r] < 0)
					l++;

				else
					r--;
			}
		}

		if (found == false) {
			return false;}
		else {
			return true;
		}
	}

}
