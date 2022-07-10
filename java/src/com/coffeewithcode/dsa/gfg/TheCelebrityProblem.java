package com.coffeewithcode.dsa.gfg;

public class TheCelebrityProblem {
	public static void main(String[] args) {
		TheCelebrityProblem a=new TheCelebrityProblem();
		int n = 3;
		int	grid[][] = {{0 ,0 ,0},
				         {0, 0 ,0}, 
				         {0 ,0, 0}};
		System.out.println(a.celebrity(grid ,n));
	}

	int celebrity(int m[][], int n) {
		int a=0;
		int b=n-1;
		while (a<b) {
			if(m[a][b]==1) {
				a++;
			}else {
				b--;
			}
		}
		for(int i=0;i<n;i++) {
			if(i==a) {
				continue;
			}
			if(m[i][a]!=1|| m[a][i]!=0) {
				return -1;
			}
		}
		return  a;
		// code here
	}

}
