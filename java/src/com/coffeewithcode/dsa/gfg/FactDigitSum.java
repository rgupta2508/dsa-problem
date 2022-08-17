package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class FactDigitSum {
	public static void main(String[] args) {
		FactDigitSum a = new FactDigitSum();
		ArrayList<Integer> res = a.FactDigit(4);
		for (int i : res) {
			System.out.println(i);
		}

	}

	static int[] fact = new int[] { 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

	ArrayList<Integer> FactDigit(int N) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 8; i >= 0; i--) {
			if (N >= fact[i]) {
				ar.add(0, i + 1);
				N = N - fact[i];
				i++;
			}
			if (N == 0) {
				return ar;
			}
		}

		return ar;
	}

}
