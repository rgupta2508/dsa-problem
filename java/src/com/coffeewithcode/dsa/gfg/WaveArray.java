package com.coffeewithcode.dsa.gfg;

public class WaveArray {
	public static void main(String[] args) {
		int n = 5;
				int arr[] = {1,2,3,4,5};
				convertToWave(n,arr);
				for(int i:arr) {
					System.out.println(i);
				}
	}
	
	public static void convertToWave(int n, int[] arr) {
        // code here
		for(int i=1;i<=n;i=i+2) {
			if(i==n) {
				break;
			}
			int temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
				
		}
    }

}
