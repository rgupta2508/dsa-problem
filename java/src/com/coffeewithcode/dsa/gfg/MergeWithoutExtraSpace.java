package com.coffeewithcode.dsa.gfg;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
	public static void main(String[] args) {
		int n = 4;
				long [] arr1 = { 1, 3, 5, 7 ,10,21,22,32};
		int m = 5;
		long[] arr2 = { 0, 2, 6, 8, 9 ,11,12,20};
		merge(arr1, arr2, arr1.length, arr2.length);
	}

	public static void merge(long arr1[], long arr2[], int n, int m) {
		// code here
	    int i=n-1,j=0;
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
           
                i--;
                j++;
            
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);

         //sort(arr1,arr1+n);
         //sort(arr2,arr2+m);
	}
}
