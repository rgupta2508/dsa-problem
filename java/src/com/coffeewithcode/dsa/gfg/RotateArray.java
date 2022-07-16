package com.coffeewithcode.dsa.gfg;

public class RotateArray {
	public static void main(String[] args) {
		int N = 69, D = 77;
			int 	arr[] = {40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};
			rotateArr(arr, D, N);
			for(int i:arr) {
				System.out.println(i);
			}
	}

	static void rotateArr(int arr[], int d, int n) {
		if(d >= n && n != 0){
	           d = d%n;
	       }
		// add your code here
		int i = 0;
		int tempN = n-1;
		int temp;
		while (tempN > i) {
			 temp = arr[i];
			arr[i] = arr[tempN];
			arr[tempN] = temp;
			i = i + 1;
			tempN = tempN - 1;
		}

		tempN = n - d - 1;
		i = 0;
		while (tempN > i) {
			 temp = arr[i];
			arr[i] = arr[tempN];
			arr[tempN] = temp;
			i = i + 1;
			tempN = tempN - 1;
		}
		i = n - d;
		tempN = n - 1;
		while (tempN > i) {
			 temp = arr[i];
			arr[i] = arr[tempN];
			arr[tempN] = temp;
			i = i + 1;
			tempN = tempN - 1;
		}
	}

}
