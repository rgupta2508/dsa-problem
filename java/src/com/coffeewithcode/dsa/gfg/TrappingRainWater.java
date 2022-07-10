package com.coffeewithcode.dsa.gfg;

public class TrappingRainWater {
	public static void main(String[] args) {
		
		int n = 6;
		int arr[] = {3,0,0,2,0,4};
		System.out.println("TrappingRainWater===="+trappingWater(arr,n));
	}
	 static long trappingWater(int arr[], int n) { 
	        // Your code here
		 //in case of result is a large number
		 long result=0;
		 //create max left and right arr 
		 int arrLeft[]=new int[n];
		 int arrRight[]=new int[n];
		 int tempMax=arr[0];
		 for (int i=0;i<n;i++) {
			 arrLeft[i]=tempMax-arr[i];
			 if(tempMax<arr[i]) {
				 tempMax=arr[i];
			 }
		 }
		  tempMax=arr[n-1];
		 for (int i=n-1;i>=0;i--) {
			 arrRight[i]=tempMax-arr[i];;
			 if(tempMax<arr[i]) {
				 tempMax=arr[i];
			 }
		 }
		 //System.out.println(Arrays.toString(arrLeft));
		 //System.out.println(Arrays.toString(arrRight));
		 int min=0;
		 for(int i=0;i<n;i++) {
			 min=arrLeft[i]>arrRight[i]?arrRight[i]:arrLeft[i];
			 result=result+(min<0?0:min);
		 }
		 return result;
	    } 

}
