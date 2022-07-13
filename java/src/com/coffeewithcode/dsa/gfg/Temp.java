package com.coffeewithcode.dsa.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Temp {
	public static void main(String[] args) {

		System.out.println("########Replace all 0's with 5 #####");

		int res1 = 1005, n = 1005;
		int temp = 1;
		while (n > 0) {
			if (n % 10 == 0) {
				res1 = res1 + 5 * temp;
			}
			n = n / 10;
			temp = temp * 10;
		}
		System.out.println(res1);

		System.out.println("########/Two Sum############");

		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				System.out.println(map.get(arr[i]) + "===" + i);
				res[0] = map.get(arr[i]);
				res[1] = i;
			} else {
				map.put(target - arr[i], i);
			}
		}
		System.out.println("############Print Stack#########");
		Stack<Integer> s = new Stack<Integer>();
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(1);
		s.add(9);
		for (int a : s) {
			System.out.println(a);
		}
	}

}
