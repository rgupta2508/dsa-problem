package com.coffeewithcode.dsa.gfg;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int n = 20;
		int a[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15, 1, 2, 2, 3 };// , 12, 2, 10, 6, 14, 1, 9, 5,
																						// 13, 3, 11, 7, 15 };
		System.out.println(longestSubsequence(n, a));

	}

	static int longestSubsequence(int n, int a[]) {
		// your code here
		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}
		int max = -1;
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] < a[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		for (int d : dp) {
			max = max > d ? max : d;
		}
		return max;
	}

}
