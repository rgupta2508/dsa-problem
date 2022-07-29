package com.coffeewithcode.dsa.gfg;

public class RowWithMax1s {
	public static void main(String[] args) {
		int n = 4, m = 4;
		int arr[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		System.out.println(rowWithMax1s(arr, n, m));

	}

	//first loop n time=> number of row
	//2nd loop from max to next nax number of zero not M time again.
	//so max complexity can be m+n
	//
	static int rowWithMax1s(int arr[][], int n, int m) {
		// code here
		int res = -1;
		int max1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = m - max1 - 1; j >= 0 && arr[i][j] == 1; j--) {
				max1 = max1 + 1;
				res = i;
			}
		}
		return res;

	}
}
