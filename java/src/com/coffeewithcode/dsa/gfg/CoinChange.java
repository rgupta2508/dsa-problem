//Dynamic Programming
package com.coffeewithcode.dsa.gfg;

public class CoinChange {
	public static void main(String[] args) {
		int sum = 4 , m = 3;
				//int S[] = {1,2,3};
				
				 sum = 10 ;
				 m = 4;
						 int S[] ={2,5,3,6};
		System.out.println(count(S,m,sum));
	}
	public static long count(int S[], int m, int sum) {
        // code here.
		long dpArr[][]=new long[sum][m];
		for(int row = 0; row < sum; row++){
            for(int col = 0; col < m; col++){
            	dpArr[row][col] = 0;
            }
        }
		long result=getCount(S,m,sum,dpArr);
		
		
		return result;
    }
	public static long getCount(int[] s, int n, int sum ,long[][] dpArr) {
		if(sum==0) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		if(dpArr[sum-1][n-1]!=0) {
			return dpArr[sum-1][n-1];
		}
		
		long result=getCount(s,n-1,sum,dpArr);
		if(s[n-1]<=sum) {
			result=result+getCount(s,n,sum-s[n-1],dpArr);
		}
		dpArr[sum-1][n-1]=result;
		return result;
	}

}
