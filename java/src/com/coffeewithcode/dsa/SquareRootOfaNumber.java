package com.coffeewithcode.dsa;

public class SquareRootOfaNumber {
	public static void main(String[] args) {
		int x=4;
		SquareRootOfaNumber a=new SquareRootOfaNumber();
		System.out.println(a.floorSqrt(x));
		
	}
	long floorSqrt(long x)
	 {
		// Your code here
		for(int i=0;;i++) {
			if(i*i>x) {
				return i-1;
			}
		}
	 }

}
