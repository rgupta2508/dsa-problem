package com.coffeewithcode.dsa.gfg;

public class ExceptionallyOdd {
	public static void main(String[] args) {
		int N = 9;
		int Arr[] = { 3, 3, 2, 2, 3, 1, 1 ,1,1};
		System.out.println(2^1);
		System.out.println("====");
		System.out.println(getOddOccurrence(Arr, N));
	}

	static int getOddOccurrence(int[] a, int n) {
		// code here

		int x = a[0];
		for (int i = 1; i < n; i++) {
			x ^= a[i];
			System.out.println(x+"=");
		}
		return x;
	}

}
