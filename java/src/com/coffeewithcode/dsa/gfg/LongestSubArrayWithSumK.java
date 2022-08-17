package com.coffeewithcode.dsa.gfg;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
	public static void main(String[] args) {
		int A[] = { 10, 5, 2, 7, 1, 9 };
		int K = 15;
		System.out.println(lenOfLongSubarr(A, A.length, K));
	}

// Complete the function
	public static int lenOfLongSubarr(int A[], int N, int K) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int ans = 0;
		map.put(0, -1);

		for (int i = 0; i < N; i++) {
			sum += A[i];
			System.out.println(sum);
			if (map.containsKey(sum - K)) {
				ans = Math.max(ans, i - map.get(sum - K));
			}
			System.out.println(ans+"==ans");
			if (map.containsKey(sum) == false) {
				map.put(sum, i);
			}
		}

		return ans;
	}

}
