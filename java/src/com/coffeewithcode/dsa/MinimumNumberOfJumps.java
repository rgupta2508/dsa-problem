package com.coffeewithcode.dsa;

public class MinimumNumberOfJumps {
	public static void main(String[] args) {
		// int[] arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
		int[] arr = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
		// System.out.println(minJumps(arr));
		System.out.println(minJumps(arr));

	}

	public static int minJumps(int arr[]) {
		int n = arr.length;
		int minJump = 1;
		int steps = arr[0];
		int maxReach = arr[0];
		if (n == 1) {
			return 0;
		}
		if (arr[0] == 0) {
			return -1;
		}
		for (int i = 1; i < n - 1; i++) {
			maxReach = Math.max(maxReach, arr[i] + i);
			steps--;
			if (steps == 0) {
				minJump++;
				steps = maxReach - i;
				if (steps <= 0) {
					return -1;
				}
			}
		}
		return minJump;
	}

	public static int minJumps1(int arr[]) {
		if (arr[0] == 0) {
			return -1;
		}
		int totalJump = arr[0];
		int result = 1;
		for (int i = totalJump; i < arr.length;) {

			totalJump = arr[i];
			System.out.println("==" + totalJump);
			if (arr[i] == 0) {
				return -1;
			}
			if (totalJump > arr.length) {
				break;
			}
			if (arr[totalJump - 1] == 0) {
				return -1;
			}
			i = i + totalJump;
			result++;
			// System.out.println(i);
		}
		return result;

	}
//		int totalJump=arr[1];
//		int result=1;
//		for(int i=arr[1];i<arr.length;i=i+arr[totalJump-1]) {
//			totalJump=arr[i];
//			if(totalJump>arr.length) {
//				break;
//			}
//			result++;
//			System.out.println(i);
//		}
//		return result;
//    }
}
