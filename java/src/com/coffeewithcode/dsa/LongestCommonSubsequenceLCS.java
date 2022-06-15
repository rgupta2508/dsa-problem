package com.coffeewithcode.dsa;

//https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
public class LongestCommonSubsequenceLCS {
	static int dp[][]; 
	public static void main(String[] args) {
		String a="AGGTAB",b="GXTXAYB";
		int m=a.length(),n=b.length();
		dp=new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println("LongestCommonSubsequence is "+lcs(m,n,a,b));
		
	}
	
	static int lcs(int m, int n, String a, String b) {
		
		return lcsUtil(m,n,a,b);
	}

	private static int lcsUtil(int m, int n, String a, String b) {
		
		if(m==0||n==0) {
			return 0;
		}
			if(dp[m][n]!=-1) {
				return dp[m][n];
			}
		
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return dp[m][n]=1+lcsUtil(m-1, n-1, a, b);
		}else {
			return dp[m][n]=Math.max(lcsUtil(m-1, n, a, b),lcsUtil(m, n-1, a, b));
		}
		// TODO Auto-generated method stub
		
	}

}


