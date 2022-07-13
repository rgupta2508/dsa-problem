package com.coffeewithcode.dsa.gfg;

public class ShortestUncommonSubsequence {
	public static void main(String[] args) {
		String S = "babab";
		String T = "babba";

		System.out.println(shortestUnSub(S, T));
	}

	static int shortestUnSub(String S, String T) {
		dp = new int[S.length() + 1][T.length() + 1];
		for (int i = 0; i <= S.length(); i++)
			for (int j = 0; j <= T.length(); j++) {

				dp[i][j] = -1;
			}

		int res = shortestUnSubUtil(S.length(), T.length(), S, T);
		if (res >= Integer.MAX_VALUE - 5) {
			res = -1;
		}
		return res;

	}

	static int dp[][];

	static int shortestUnSubUtil(int n, int m, String s, String t) {
		if (n == 0) {
			return Integer.MAX_VALUE - 5;
		}
		if (m == 0) {
			return 1;
		}
		if (dp[n][m] != -1) {
			return dp[n][m];
		}
		int ans = Integer.MAX_VALUE - 5;
		char c = s.charAt(n - 1);
		int j;
		for (j = m - 1; j >= 0; j--) {
			if (t.charAt(j) == c) {
				break;
			}
		}
		if (j == -1) {
			ans = 1;
		} else {
			ans = Math.min(shortestUnSubUtil(n - 1, m, s, t), shortestUnSubUtil(n - 1, j, s, t) + 1);
		}
		dp[n][m] = ans;
		return ans;
	}
}
