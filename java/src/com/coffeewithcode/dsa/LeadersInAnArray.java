package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
	public static void main(String[] args) {
		LeadersInAnArray a = new LeadersInAnArray();
		int n = 6;
		int arr[] = {16,17,4,3,5,2};
		for(int i:a.leaders(arr, n)) {
			System.out.println(i);
		}
	}

	  ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
		 ArrayList<Integer> res=new ArrayList<>();
		 int max=-1;
		 for(int i=n-1;i>=0;i--) {
			 if(arr[i]>=max) {
				 res.add(arr[i]);
				 max=arr[i];
			 }
		 }
	        Collections.reverse(res);

		 return res;
	    }
}
