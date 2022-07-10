package com.coffeewithcode.dsa.gfg;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
	public static void main(String[] args) {
		int n = 7;
		int a[] = {1 ,2, 3, 4 ,5};//{ 2, 6, 1, 9, 4, 5, 3 };
		System.out.println(findLongestConseqSubseq(a, n));
	}

	private static int findLongestConseqSubseq(int[] a, int n) {
		// TODO Auto-generated method stub
		int res = 0;
		int temp = 0;

		Map<Integer, Boolean> map = new HashMap<>();
		int max = 0;
		for (int i : a) {
			if (max < i) {
				max = i;
			}
			map.put(i, true);
		}
		for (int i = 0; i <= max; i++) {
			//System.out.println(i);
			if (map.get(i) != null) {			
				temp++;
				if (temp > res) {
					res = temp;
				}
			} else {
				temp = 0;
			}
		}
		return res;
	}

}
