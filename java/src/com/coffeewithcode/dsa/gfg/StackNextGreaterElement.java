package com.coffeewithcode.dsa.gfg;

import java.util.Stack;

public class StackNextGreaterElement {
	public static void main(String[] args) {
	int 	N = 4;
	long arr[] = {1, 3 ,2 ,4};
	long arrRes[]=nextLargerElement(arr, N);
	for(long i:arrRes) {
		System.out.println(i);
	}
	
	}
	public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
		long res[]=new long[n];
		//res[n-1]=-1;
		Stack<Long> stack=new Stack<>();
		for(int i=n-1;i>=0;i--) {
			
				while(!stack.isEmpty()) {
					if (stack.peek()>arr[i]) {
						res[i]=stack.peek();
						break;
					}
					stack.pop();
				}
				if(stack.isEmpty()==true) {
					res[i]=-1;
				
				}
			
			stack.add(arr[i]);
		}
		return res;
		
    } 

}
