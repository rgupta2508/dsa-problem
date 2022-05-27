package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCombinationsRepeatedDigitsAllowedToSumN {

	public void findSets(int[] arrA, int sum) {
		System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + sum);
		Arrays.sort(arrA);
		List<Integer> combinationList = new ArrayList<>();
		combinationUtil(arrA, sum, 0, 0, combinationList);
	}

	public void combinationUtil(int arrA[], int sum, int currSum, int startIndex, List<Integer> combinationList) {
		// System.out.println(currSum+"====");
		if (currSum == sum) {
			System.out.println(combinationList);
			return;
		}

		for (int i = startIndex; i < arrA.length; i++) {
			if (currSum + arrA[i] > sum) // array is sorted, no need to check further
				break;
			combinationList.add(arrA[i]);
			// System.out.println("======"+currSum);
			combinationUtil(arrA, sum, currSum + arrA[i], i + 1, combinationList);
			combinationList.remove(combinationList.size() - 1);
		}
	}

	
	

	public boolean isSubsetSum(int set[],  int sum) {
// The value of subset[i][j] will be
// true if there is a subset of
// set[0..j-1] with sum equal to i
		int n=set.length;
		boolean subset[][] = new boolean[sum + 1][n + 1];
// If sum is 0, then answer is true
		for (int i = 0; i <= n; i++)
			subset[0][i] = true;
// If sum is not 0 and set is empty,
// then answer is false
		for (int i = 1; i <= sum; i++)
			subset[i][0] = false;
		
// Fill the subset table in bottom
// up manner
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= set[j - 1])
					subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
			}
		}
		/* // uncomment this code to print table */
		return subset[sum][n];
	}

	public static void main(String[] args) {
		int[] arrA = { 1, 3, 4, 5, 2 };
		int n = 7;
		FindCombinationsRepeatedDigitsAllowedToSumN f = new FindCombinationsRepeatedDigitsAllowedToSumN();
		f.findSets(arrA, n);
		System.out.println("##improved complexity =====Another soln use the Dynamic programming.=====");
		if (f.isSubsetSum(arrA,  n) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
		
	}
}