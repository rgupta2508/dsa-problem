package com.coffeewithcode.dsa;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {

	public static void main(String args[])
    {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        System.out.println("Length of the longest 0 sum "
                           + "subarray is " + maxLen(arr, n));
    }
	 static int maxLen(int arr[], int n)
	    {
	        // Creates an empty hashMap hM
	        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

	        int sum = 0; // Initialize sum of elements
	        int maxLen = 0; // Initialize result

	        // Traverse through the given array
	        for (int i = 0; i < n; i++) {
	            // Add current element to sum
	            sum += arr[i];

	            if (arr[i] == 0 && maxLen == 0)
	                maxLen = 1;

	            if (sum == 0)
	                maxLen = i + 1;

	            // Look this sum in hash table
	            Integer prevI = hM.get(sum);

	            // If this sum is seen before, then update max_len
	            // if required
	            if (prevI != null)
	                maxLen = Math.max(maxLen, i - prevI);
	            else // Else put this sum in hash table
	                hM.put(sum, i);
	        }

	        return maxLen;
	    }

    
}
