package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArrayMajorityElement {
	public static void main(String[] args) {
		int arr[] = { 13,13, 13 ,13,13,13,13,1,13,2,13,1,13,1,1,1};
		System.out.println(majorityElement(arr, arr.length));
	}

	/* Function to print Majority Element */
	//complexity O(n)
	public static int majorityElement(int a[], int size) {
		/* Find the candidate for Majority */
		int cand = findCandidate(a, size);

		/* Print the candidate if it is Majority */
		if (isMajority(a, size, cand)) {
			return cand;
		}
		// System.out.println(" " + cand + " ");
		else {
			return -1;
		}
		// System.out.println("No Majority Element");
	}

	/* Function to find the candidate for Majority */
	static int findCandidate(int a[], int size) {
		int majIndex = 0, count = 1;
		int i;
		for (i = 1; i < size; i++) {
			if (a[majIndex] == a[i])
				count++;
			else
				count--;
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		return a[majIndex];
	}

	/*
	 * Function to check if the candidate occurs more than n/2 times
	 */
	static boolean isMajority(int a[], int size, int cand) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == cand)
				count++;
		}
		if (count > size / 2)
			return true;
		else
			return false;
	}

	//Complexity O(nlogn)
	static int majorityElement1(int a[], int size) { // your code here
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(-1, 0);
		int num = 0, count = 0;
		Arrays.sort(a);
		int m = size / 2;
		int j = 0;
		for (int i = 0; i < size; i = j) {
			num = a[i];
			count = 1;
			for (j = i + 1; j < size && a[j] == num; j++)
				count++;
			if (count > m)
				map.put(a[j - 1], count);
		}
		int res = -1;
		for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == Collections.max(map.values())) {
				res = entry.getKey();
			}

		}
		return res;
	}

}
