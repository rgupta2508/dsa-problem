package com.coffeewithcode.dsa.gfg;

import java.util.PriorityQueue;

public class AddingArrayElementsPOTD {
	public static void main(String[] args) {
		int N = 6, K = 6;
		int arr[] = { 1, 10, 12, 9, 2, 3 };
		System.out.println(minOperations(arr, N, K));
	}

	public static int minOperations(int[] arr, int n, int k) {
		// code here
		int cnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : arr) {
			pq.add(i);
		}
		while (pq.peek() < k) {
			int a = pq.poll();
			int b = pq.poll();
			cnt++;
			pq.add(a + b);
		}
		return cnt;

	}

}
