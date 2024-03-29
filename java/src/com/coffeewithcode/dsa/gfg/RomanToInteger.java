package com.coffeewithcode.dsa.gfg;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToDecimal("LIX"));
	}

	public static int romanToDecimal(String str) {
		HashMap<Character, Integer> mp = new HashMap<>();
		mp.put('I', 1);
		mp.put('V', 5);
		mp.put('X', 10);
		mp.put('L', 50);
		mp.put('C', 100);
		mp.put('D', 500);
		mp.put('M', 1000);
		int ans = 0, prev = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (mp.get(str.charAt(i)) >= prev) {
				ans += mp.get(str.charAt(i));
			} else {
				ans -= mp.get(str.charAt(i));
			}
			prev = mp.get(str.charAt(i));
		}
		return ans;
	}

}
