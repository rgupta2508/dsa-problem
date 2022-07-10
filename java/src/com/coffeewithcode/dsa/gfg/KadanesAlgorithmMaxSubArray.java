package com.coffeewithcode.dsa.gfg;

public class KadanesAlgorithmMaxSubArray {
	public static void main(String[] args) {
		int n = 5;
				int arr[] = {1,2,3,-2,5};
		System.out.println("max Sub array=="+maxSubarraySum(arr,n));
	}

	public static  long maxSubarraySum(int arr[], int n){
		 long maxi=Long.MIN_VALUE;
         long curSum=0;
        for(int i=0;i<n;i++){
            curSum+=arr[i];
            maxi = maxi>curSum?maxi:curSum;
            if(curSum<0){
                curSum=0;
            }
        }
        return maxi;
	        
	    }
}
