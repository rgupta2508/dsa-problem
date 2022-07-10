package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllPairsWithaGivenSum {
	public static void main(String[] args) {

		long A[] = { 1, 2, 4, 5, 7 };
		long B[] = { 5, 6, 3, 4, 8 };
		long X = 9, N = 5, M = 5;
		allPairs(A, B, N, M, X);
	}

	public static Pair[] allPairs(long A[], long B[], long N, long M, long X) {
		List<Pair> al = new ArrayList<Pair>();
		HashMap<Long, Long> map = new HashMap<>();
		Arrays.sort(B);
		for (long i : A) {
			map.put(X - i, i);
		}
		int n = 0;
		for (long j : B) {
			if (map.containsKey(j)) {
				al.add(new Pair(map.get(j), j));
				n++;
			}
		}
		Pair[] result = new Pair[n];
		for (int i = 0; i < n; i++) {
			result[n-i-1] = al.get(i);
			System.out.println(al.get(i).first + "===" + al.get(i).second);
		}
		return result;
	}

}

class Pair {
	long first, second;

	public Pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}
