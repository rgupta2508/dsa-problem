package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

	public static void main(String[] args) {

		int n1 = 6;
		int A[] = { 1, 5, 10, 20, 40, 80 };
		int n2 = 5;
		int B[] = { 6, 7, 20, 80, 100 };
		int n3 = 8;
		int C[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		CommonElements a = new CommonElements();
		ArrayList<Integer> list = a.commonElements(A, B, C, n1, n2, n3);
		for (int i : list) {
			System.out.println(i);
		}

	}

	ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : A) {
			map.put(i, 1);
		}
		for (int i : B) {
			if (map.containsKey(i)) {
				map.put(i, 2);
			}
		}
		for (int i : C) {
			if (map.containsKey(i) && map.get(i) == 2) {
				result.add(i);
				map.put(i, 3);
			}
		}

		return result;
	}

}
