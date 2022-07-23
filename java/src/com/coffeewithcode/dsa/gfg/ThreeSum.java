package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
	public static void main(String[] args) {
		int arr[]=new int[] {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
		int sum=8;
		System.out.println(threeSum1(arr,sum));
	}
	
	public static boolean threeSum1(int[] arr,int sum) {
	    // code goes here  
	   // Map<Integer,Integer> map=new HashMap<>();
	 // Fix the first element as A[i]
		Arrays.sort(arr);
		 int l, r;
		for (int i = 0; i < arr.length - 2; i++) {
			  
            // To find the other two elements, start two
            // index variables from two corners of the array
            // and move them toward each other
            l = i + 1; // index of the first element in the
                       // remaining elements
            r = arr.length - 1; // index of the last element
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    //System.out.print("Triplet is " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
                }
                else if (arr[i] + arr[l] + arr[r] < sum)
                    l++;
  
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }
  
        // If we reach here, then no triplet was found
        return false;
    }
  
	 public static boolean threeSum(int[] arr,int sum) {
		    // code goes here  
		   // Map<Integer,Integer> map=new HashMap<>();
		 // Fix the first element as A[i]
	        for (int i = 0; i < arr.length - 2; i++) {
	  
	            // Find pair in subarray A[i+1..n-1]
	            // with sum equal to sum - A[i]
	            HashSet<Integer> s = new HashSet<Integer>();
	            int curr_sum = sum - arr[i];
	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                if (s.contains(curr_sum - arr[j])) 
	                {
	                    //System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
	                    return true;
	                }
	                s.add(arr[j]);
	            }
	        }
	  
	        // If we reach here, then no triplet was found
	        return false;
	    }
	  
}
