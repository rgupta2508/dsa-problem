package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSort {
	public static void main(String[] args) {
		int nums[] = { 10, 19, 6, 3, 5 };
		System.out.println(minSwaps(nums));

	}

//Sort array ans save it to anothe array
	// find difference ans swap
	public static int minSwaps(int nums[]) {
		// Code here
		int n = nums.length;
		int[] temp = Arrays.copyOfRange(nums, 0, n);
		int ans = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], i);
		}

		Arrays.sort(temp);

		for (int i = 0; i < n; i++) {
			if (temp[i] != nums[i]) {
				ans++;
				int arri = nums[i];

				swap(nums, i, map.get(temp[i]));

				map.put(arri, map.get(temp[i]));
				map.put(nums[i], i);
			}
		}
		return ans;
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
