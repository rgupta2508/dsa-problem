package com.coffeewithcode.dsa.gfg;

import java.util.Scanner;

public class TheConversionToOne {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			for (int i : arr) {
				System.out.println(countMinimumOperations(i));
			}
			// arr = getConversionToOne(arr);
		}
	}

	public static int countMinimumOperations(int n) {
		if(n==1){
            return 0;
        }
        else if(n %2 ==0){

            return 1 + countMinimumOperations(n/2);
        }else{
            return 1 + Math.min(countMinimumOperations(n-1), countMinimumOperations(n+1));
        }
	}
}
