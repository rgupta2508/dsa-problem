package com.coffeewithcode.dsa;

public class FindTransitionPoint {
	public static void main(String[] args) {
		FindTransitionPoint a = new FindTransitionPoint();
		int n = 5;
		int arr[] = { 0, 0, 0, 1, 1 };
		System.out.println(a.transitionPoint(arr, n));
	}

	int transitionPoint(int arr[], int n) {
		// code here
		int start = 0, end = arr.length - 1, ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == 0) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
			}
		}
		return ans;

	}
}
