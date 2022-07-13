package com.coffeewithcode.dsa.gfg;

import java.util.HashSet;

public class ArraySubsetOfAnotherArray {
	public static void main(String[] args) {
		long a1[] = {10, 5, 2, 23, 19};
		long a2[] = {19, 5, 3};
		System.out.println(isSubset(a1,a2,a1.length,a2.length));
	}
public static String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> arr1 = new HashSet<>();
        

        for(int i=0;i<n;i++)
            arr1.add(a1[i]);

        for(int i=0;i<m;i++) {
        	if(!arr1.contains(a2[i])) {
        		return "No";
        	}
        }
        return "Yes";
    }

}
