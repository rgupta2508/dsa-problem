package com.coffeewithcode.dsa;

public class EquilibriumPoint {
	public static void main(String[] args) {
		int n = 5;
		long arr[] = { 1, 3, 5, 2, 2 };
		System.out.println(equilibriumPoint(arr, n));
	}

	public static int equilibriumPoint(long arr[], int n) {

		int mid = n / 2;
		int leftSum = 0, rightSum = 0;

//calculation sum to left of mid
		for (int i = 0; i < mid; i++) {
			leftSum += arr[i];
		}
//calculating sum to right of mid
		for (int i = n - 1; i > mid; i--) {
			rightSum += arr[i];
		}

//if rightsum > leftsum
		if (rightSum > leftSum) {
			// we keep moving right until rightSum become equal or less than leftSum
			while (rightSum > leftSum && mid < n - 1) {
				rightSum -= arr[mid + 1];
				leftSum += arr[mid];
				mid++;
			}
		} else {
			// we keep moving right until leftSum become equal or less than RightSum
			while (leftSum > rightSum && mid > 0) {
				rightSum += arr[mid];
				leftSum -= arr[mid - 1];
				mid--;
			}
		}

//check if both sum become equal
		if (rightSum == leftSum) {
			// System.out.print("First Point of equilibrium is at index ="+ mid);
			return mid + 1;
		}
		return -1;
// System.out.print("First Point of equilibrium is at index =" + -1);}
	}
}
