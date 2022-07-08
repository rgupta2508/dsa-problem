package com.coffeewithcode.dsa;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
	public static void main(String[] args) {
		int n = 2, m = 12;
		int arr1[] = { 1,1,1,1,2,3};
		int arr2[] = { 2, 2 ,6, 6 ,7 ,7 ,10 ,11 ,12, 14, 15 ,16 };
		
		
		//5678
		//1234
		MergeWithoutExtraSpace a = new MergeWithoutExtraSpace();
		a.merge(arr1, arr2, n, m);
		for (int l : arr1) {
			System.out.println(l);
		}
		for (int k : arr2) {
			System.out.println(k);
		}
	
		
	}

	public void merge(int arr1[], int arr2[], int n, int m) {
		// code here
		//n
		int i=n-1,j=0;
		while(i>=0&&j<m&&arr1[i]>arr2[j]) {
			if(arr1[i]>arr2[j]) {
				int temp =arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				i--;
				j++;
			}
		}
		//nlog(n)
		Arrays.sort(arr1);
		//mlog(m)
		Arrays.sort(arr2);
		}
	
	
}
