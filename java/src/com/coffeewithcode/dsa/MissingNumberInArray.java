package com.coffeewithcode.dsa;

public class MissingNumberInArray {
public static void main(String[] args) {
	int[] arr= {6,1,2,8,3,4,7,10,5};
	System.out.println(MissingNumber(arr,10));
}
public static int MissingNumber(int array[], int n) {
	
	int sum=0;
	
	for(int i:array) {
		sum=sum+i;
	}
	
	return ((n*(n+1))/2)-sum;
    // Your Code Here
}
}
