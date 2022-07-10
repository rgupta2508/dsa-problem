package com.coffeewithcode.dsa.gfg;

import java.util.HashMap;

public class CheckIfTwoArraysAreEqualOrNot {
	public static void main(String[] args) {
		long a[]= {1,2,3,4,5};
		long b[]= {5,4,3,8,1};
		int n=5;
		
		System.out.println("arrays is equal or not=="+check(a,b,n));
	}
	public static boolean check(long A[],long B[],int N)
	
    {	HashMap<Long, Integer> hash = new HashMap<>();
    for(int i=0; i<N; i++){
        hash.put(A[i], hash.getOrDefault(A[i], 0)+1);
    }
    for(int i=0; i<N; i++){
        if (!hash.containsKey(B[i])) return false;
        else {
            hash.put(B[i], hash.get(B[i])-1);
            if(hash.get(B[i])<0) return false;
        }
    }
    return true;
    }

}
