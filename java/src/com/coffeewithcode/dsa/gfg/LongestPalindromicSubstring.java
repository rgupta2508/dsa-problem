package com.coffeewithcode.dsa.gfg;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		String S = "aaaabbaa";
		System.out.println(longestPalindrome(S));
	}

	static String longestPalindrome(String str) {
		String ans = str.substring(0, 1);
		for (int i = 0; i < str.length(); i++) {
			String odd = pelLength(i, i, str);
			String even = pelLength(i, i + 1, str);
			if (odd.length() > ans.length()) {
				ans = odd;
			}
			if (even.length() > ans.length()) {
				ans = even;
			}
		}
		return ans;
	}

	public static String pelLength(int startIndex, int endIndex, String str) {
		int temp = 0;
		String ans = "";
		if (startIndex == endIndex) {
			temp = 1;
			startIndex--;
			endIndex++;
		}
		while (startIndex >= 0 && endIndex < str.length() && str.charAt(endIndex) == str.charAt(startIndex)) {
			temp = temp + 2;
			startIndex--;
			endIndex++;
		}
		if (temp > 1) {
			ans = str.substring(startIndex + 1, startIndex + temp + 1);
		}
		return ans;
	}

}
