package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;

public class MaxLengthChain {

	public static void main(String[] args) {

		int n = 5;
		Pair1 p = new Pair1(5, 24);
		Pair1 p2 = new Pair1(39, 60);
		Pair1 p3 = new Pair1(15, 28);
		Pair1 p4 = new Pair1(27, 40);
		Pair1 p5 = new Pair1(50, 90);

		Pair1 arr[] = { p, p2, p3, p4, p5 };
		MaxLengthChain x = new MaxLengthChain();
		System.out.println(x.maxChainLength(arr, n));
	}

//	public static int compare(Pair1 a, Pair1 b) {
//        return a.x.compareTo(b.);
//    }

	public int maxChainLength(Pair1 arr[], int n) {
		Arrays.sort(arr, (a, b) -> a.x - b.x);

		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}
		// your code here
		int result = 1;
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j].y < arr[i].x) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		

		for (int i = 0; i < n; i++)
			if (result < dp[i])
				result = dp[i];

		return result;
	}

}

class Pair1 {
	int x;
	int y;

	public Pair1(int a, int b) {
		x = a;
		y = b;

	}
}
