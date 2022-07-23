package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class RatInAMazeProblem {
	public static void main(String[] args) {
		
	int N = 4;
			int m[][] = {{1, 0, 0, 0},
			         {1, 1, 0, 1}, 
			         {1, 1, 0, 0},
			         {0, 1, 1, 1}};
			ArrayList<String> res=findPath(m, N);
			for(String s:res) {
				System.out.println(s);
			}
			
	}
	static ArrayList<String> ans=new ArrayList<String>();
	 public static ArrayList<String> findPath(int[][] m, int n) {
	       String s = "";
	       if (m[0][0] == 0)
	           return ans;
	       if (m[n - 1][n - 1] == 0)
	           return ans;
	       findPathUtil(0, 0, m, n, s);
	       return ans;
	   }
	 
	 static void findPathUtil(int i, int j, int[][] m, int n, String s) {
	       if (i < 0 || i >= n || j < 0 || j >= n || m[i][j] == 0)
	           return;
	       if (i == n - 1 && j == n - 1) {
	           ans.add(s);
	           return;
	       }
	       m[i][j] = 0;
	       findPathUtil(i + 1, j, m, n, s + "D");
	       findPathUtil(i - 1, j, m, n, s + "U");
	       findPathUtil(i, j + 1, m, n, s + "R");
	       findPathUtil(i, j - 1, m, n, s + "L");
	       m[i][j] = 1;
	   }
	   
	   
}
