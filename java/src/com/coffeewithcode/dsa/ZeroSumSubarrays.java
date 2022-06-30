package com.coffeewithcode.dsa;

import java.util.HashMap;

public class ZeroSumSubarrays {
	public static void main(String[] args) {
		int n = 6;
			long	arr[] = {0,0,5,5,0,0};
		System.out.println(findSubarray(arr, n));
	}
	
	 public static long findSubarray(long[] arr ,int n) 
	    {
	        //Your code here
	        HashMap<Long,Integer> map = new HashMap<>();
	       long result = 0, sum = 0;
	       for(int i=0; i<n; i++)
	       {
	           sum += arr[i];
	           if(sum == 0) result++;
	           if(map.containsKey(sum))
	           {
	               result += map.get(sum);
	               map.put(sum, map.get(sum) + 1);
	           }
	           else map.put(sum,1);
	       }
	       return result;
	    }

}
