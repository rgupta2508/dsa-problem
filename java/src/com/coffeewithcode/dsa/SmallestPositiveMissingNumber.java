package com.coffeewithcode.dsa;

public class SmallestPositiveMissingNumber {
	public static void main(String[] args) {
		int n = 49;
		// int arr[] = {33, -50, 4, -34, -4, -1, -13 };
		int arr[] = { 33, -50, 18, -34, -4, -1, -13, -29, 9, -47, 37, -29, -8, -7, 25, 27, -40, 12, 36, 20, 47, 43, -33,
				11, -22, -26, -33, 16, 8, 9, 16, 43, 9, 36, -41, 7, -15, -4, -20, 45, -48, -33, -34, 46, -37, 42, 24,
				-27, -44 };// {33, -50, 18, -34, -4, -1, -13 };//{28, 7 ,-36, 21 ,-21, -50 ,9,
							// -32};//{0,1,2,3,4};//{0,1};//{ 0, -10, 1, 3, -20 };
		System.out.println(missingNumber(arr, n));
	}

	static int missingNumber(int arr[], int size) {
		int min = size + 1;
		int i = 0;
		while (i < size) {
			if (arr[i] > 0 && arr[i] <= size) {
				if (arr[i] == arr[arr[i] - 1]) {
					i++;
				} else {
					int temp = arr[i];
					arr[i] = arr[temp - 1];
					arr[temp - 1] = temp;
				}

			} else {
				i++;
			}
		}
		for (int j = 0; j < size; j++) {
			if (arr[j] - 1 != j) {
				min = j + 1;
				break;
			}
		}
		return min;
		// Your code here
	}

}
