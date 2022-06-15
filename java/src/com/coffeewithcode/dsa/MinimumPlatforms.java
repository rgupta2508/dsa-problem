package com.coffeewithcode.dsa;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumPlatforms {
	public static void main(String[] args) {
		int n = 6 ;
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println("Minimum Platform==="+findPlatform(arr, dep, n));
	}

	
	static int findPlatform(int arr[], int dep[], int n)
    {
		
		//Sort arrays for getting arrival and departure in order
		Arrays.sort(arr);
        Arrays.sort(dep);
        // add your code here
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int result=1;
		pQueue.add(dep[0]);
		for(int i=1;i<n;i++) {
			if(pQueue.peek()<arr[i]) {
				pQueue.remove();
			}else {
				result++;
			}
			pQueue.add(dep[i]);
		}
		
		return result ;
        
    }
}
