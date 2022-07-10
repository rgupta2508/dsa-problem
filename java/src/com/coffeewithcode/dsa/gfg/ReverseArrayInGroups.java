package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;


public class ReverseArrayInGroups {
	public static void main(String[] args) {
		int n=8,k=3;
		//int arr1[]= {1,2,3,4,5,6,7,8};
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		ReverseArrayInGroups arrayInGroups=new ReverseArrayInGroups();
		arrayInGroups.reverseInGroups(arr,n,k);
		System.out.println(arr);
		
		
	}
	
	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
	       int i = 0;
	       while(i < n){
	           for(int j = k - 1; j >= 0; j--){
	               if(i + j >= n){
	                   continue;
	               }
	               a.add(arr.get(i + j));
	           }
	           i = i + k;
	       }
	       arr.clear();
	       for(int j = 0; j < n; j++){
	           arr.add(a.get(j));
	       }
	   }
	  
	   

}
