package com.coffeewithcode.dsa.gfg;

public class PartitionEqualSubsetSum {
	public static void main(String[] args) {
		int n = 11;
		int arr[] = { 1, 5, 11, 5,2 };
		PartitionEqualSubsetSum a = new PartitionEqualSubsetSum();
		System.out.println(a.equalPartitionDP(n, arr));
	}

	// using DP
	 int equalPartitionDP(int sum,int elements[])
    {
        int dp[] = new int[sum + 1];
        // initializing with 1 as sum 0 is always possible
        dp[0] = 1;
        // loop to go through every element of the elements
        // array
        for (int i = 0; i < elements.length; i++) {
            // to change the values of all possible sum
            // values to 1
            for (int j = sum; j >= elements[i]; j--) {
                if (dp[j - elements[i]] == 1)
                    dp[j] = 1;
            }
        }
        // if sum is possible then return 1
        if (dp[sum] == 1)
            return 1;
        return -1;
    }
	// recursion
	static int equalPartition(int n, int arr[]) {
		// code here
		// return null;
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		if (sum % 2 == 1) {
			return -1;
		}

		return getSum(arr, sum / 2, 0);
	}

	private static int getSum(int[] arr, int i, int curIndex) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return 1;
		}
		if (i < 0 || curIndex >= arr.length) {
			return -1;
		}
		if (getSum(arr, i - arr[curIndex], curIndex + 1) == 1 || getSum(arr, i, curIndex + 1) == 1) {

			return 1;
		}
		return -1;
	}

}
