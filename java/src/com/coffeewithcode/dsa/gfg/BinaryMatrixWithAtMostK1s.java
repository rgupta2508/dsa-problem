package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryMatrixWithAtMostK1s {
	public static void main(String[] args) {
		int R = 4, C = 5;
		// Arrays.asList
		ArrayList<ArrayList<Integer>> M = new ArrayList<>();
		ArrayList<Integer> r1 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0));
		ArrayList<Integer> r2 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1));
		ArrayList<Integer> r3 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1));
		ArrayList<Integer> r4 = new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 0));
		M.add(r1);
		M.add(r2);
		M.add(r3);
		M.add(r4);

		int K = 9, Q = 1;
		int q_i[] = { 1 };
		int q_j[] = { 2 };
		ArrayList<Integer> list = largestSquare(M, R, C, K, Q, q_i, q_j);
		for (int i : list) {
			System.out.println(i);
		}
	}

	static ArrayList<Integer> largestSquare(ArrayList<ArrayList<Integer>> M, int R, int C, int K, int Q, int[] q_i,
			int[] q_j) {
		// code here
		 int[][] preSum = new int[R][C];
	        for(int i=0; i<R; ++i){
	            for(int j=0; j<C; ++j){
	                if(i == 0 && j == 0){
	                    preSum[i][j] = M.get(i).get(j);
	                }
	                else if(i == 0){
	                    preSum[i][j] = M.get(i).get(j)+preSum[i][j-1];
	                }
	                else if(j == 0){
	                    preSum[i][j] = M.get(i).get(j)+preSum[i-1][j];
	                }
	                else{
	                    preSum[i][j] = M.get(i).get(j)+preSum[i][j-1]+preSum[i-1][j]-preSum[i-1][j-1];
	                }
	            }
	        }
	        ArrayList<Integer> ans = new ArrayList<>();
	        for(int i=0; i<Q; ++i){
	            int sr = q_i[i],sc = q_j[i];
	            int res = 0;
	            // O(minDist)
	            /*
	            
	            for(int step=0; sr+step<R && sr-step>=0 && sc+step<C && sc-step>=0 ; step++){
	                int totalSum = preSum[sr+step][sc+step];
	                totalSum -= (sc-step-1>=0?preSum[sr+step][sc-step-1]:0);
	                totalSum -= (sr-step-1>=0?preSum[sr-step-1][sc+step]:0);
	                totalSum += (sr-step-1>=0 && sc-step-1>=0?preSum[sr-step-1][sc-step-1]:0);
	                if(totalSum <= K){
	                    // res = Math.max(res,2*step+1);
	                    res = 2*step+1;//every time it is giving max only
	                }
	                else{
	                    break;
	                }
	            }
	            ans.add(res);
	            */
	            // O(log(minDist))
	            // reduce steps using binary search
	            int left = 0,right = Math.min(Math.min(sr,R-1-sr),Math.min(sc,C-1-sc));
	            while(left <= right){
	                int midStep = (left+right)/2;
	                int totalSum = preSum[sr+midStep][sc+midStep];
	                totalSum -= (sc-midStep-1>=0?preSum[sr+midStep][sc-midStep-1]:0);
	                totalSum -= (sr-midStep-1>=0?preSum[sr-midStep-1][sc+midStep]:0);
	                totalSum += (sr-midStep-1>=0 && sc-midStep-1>=0?preSum[sr-midStep-1][sc-midStep-1]:0);
	                if(totalSum > K){
	                    right = midStep-1;
	                }
	                else{
	                    res = Math.max(res,2*midStep+1);
	                    left = midStep+1;
	                }
	            }
	            ans.add(res);
	            
	        }
	        return ans;
	}

}
