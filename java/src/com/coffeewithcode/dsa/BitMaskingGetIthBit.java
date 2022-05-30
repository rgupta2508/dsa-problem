package com.coffeewithcode.dsa;

public class BitMaskingGetIthBit {
	public static void main(String[] args) {
		int n =17;
		int ithBit=3;
		
		//Get the ith bit 
		System.out.println("======Get the ith bit ");
		if (getIthBit(n, ithBit)==0) {
			System.out.println(ithBit +" bit is 0");
		}else {
			System.out.println(ithBit +" bit is 1");

		}
		
		//Set the ith bit 

		System.out.println("======Set the ith bit ");
		System.out.println("Number after setting ih bit=="+setIthBit(n, ithBit));
			
		
		
				
	}
	
	public static int getIthBit(int n, int ithBit){
		int mask=1<<ithBit;
		if ((n&mask)==0) {
			return 0;
		}else {
			return 1;

		}
	}
	
	
	public static int setIthBit(int n, int ithBit){
		int mask=1<<ithBit;
		return n|mask;
		
	}
	
	

}
