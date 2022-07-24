package com.coffeewithcode.dsa.gfg;

public class ImplementAtoi {
	public static void main(String[] args) {
		String str = "-197";
		System.out.println(atoi(str));
	}

	///Discards all leading whitespaces not handled
	//Sign of the number
	//Overflow handled , can match every time with maxint and return maxInt
	static int atoi(String str) {
		// Your code here
		int res=0; 
		boolean isNegative=false;
		if(str.charAt(0)=='-') {
			isNegative=true;
			str=str.substring(1, str.length());
		}
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				res=res*10+(str.charAt(i)-48);
			}else {
				return -1;
			}
		}
		return isNegative?res*-1:res;
	}
}
