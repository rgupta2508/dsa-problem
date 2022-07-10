package com.coffeewithcode.dsa.gfg;

public class BinarySearch {
	static int[] arr= {2,3,4,5,6,7,8,9};
	static int n=8;
	static int k=1;
	
	public static void main(String[] args) {
		System.out.println("element position =="+binarySearch(arr,n,k));
	}
	public static int binarySearch(int arr[], int n, int k) {
		
		
		return binarySearchUtil(arr, 0, n-1, k);
    }
	public static int binarySearchUtil(int arr[], int i,int j, int k) {
		int mid=(i+j)/2;
		if(i>j) {
			return -1;
		}
		if(arr[mid]==k) {
			return mid;
		}else if(arr[mid]<k) {
			return binarySearchUtil(arr, mid+1,j, k);
		}else {
			return binarySearchUtil(arr, i,mid-1, k);
		}
		
	}
	

}
