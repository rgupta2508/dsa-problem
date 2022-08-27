package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;


// A job has a start time, finish time and profit.

// Driver class
class ActivitySelection {

	// Returns count of the maximum set of activities that
	// can
	// be done by a single person, one at a time.
	public static int activitySelection(int start[], int end[], int n) {
		// add your code here
		Pair arr[] = new Pair[n];

		for (int i = 0; i < n; i++) {
			arr[i] = new Pair(start[i], end[i]);
		}

		Arrays.sort(arr, (p1, p2) -> p1.en - p2.en);

		int pre = 0, res = 1;

		for (int curr = 1; curr < n; curr++) {
			if (arr[curr].st > arr[pre].en) {
				res++;
				pre = curr;
			}
		}

		return res;
	}

	private static class Pair {
		int st, en;

		Pair(int s, int e) {
			st = s;
			en = e;
		}

	}

	// Driver code
	public static void main(String[] args) {

		int n = 4;
		int start[] = { 1, 3, 2, 5 };
		int end[] = { 2, 4, 3, 6 };

		System.out.println(activitySelection(start, end, n));
	}
}
