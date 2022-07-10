package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {
	public static void main(String[] args) {

		int N = 11;
		int M = 4;
		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2, 1, 8, 3 };
		System.out.println(Arrays.toString(sortA1ByA2(A1, N, A2, M)));
	}

	public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
		// Your code here
		Arrays.sort(A1);
		int[] res = new int[N];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < N; i++) {
			hm.put(A1[i], hm.getOrDefault(A1[i], 0) + 1);

		}
		int j = 0;
		for (int i = 0; i < M; i++) {
			if (hm.containsKey(A2[i])) {
				int val = hm.get(A2[i]);
				while (val != 0 && j < N) {
					res[j] = A2[i];
					val--;
					hm.put(A2[i], hm.get(A2[i]) - 1);
					j++;
				}
			}
		}

		Arrays.sort(A1);
		for (int i = 0; i < N; i++) {
			if (hm.get(A1[i]) > 0 && j < N)
				res[j++] = A1[i];
		}

		return res;
	}

}
