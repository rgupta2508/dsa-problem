package com.coffeewithcode.dsa;

public class ValidateAnIPAddress {
	public static void main(String[] args) {
		String s = "222.111.111.211.";
		System.out.println(isValid(s));
	}

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		if(s.charAt(s.length()-1)=='.') {
			return false;
		}
		String arr[] = s.split("[.]");
		if (arr.length != 4) {
			return false;
		}
		try {
			for (String str : arr) {
				if ((str.length()>1)&&str.charAt(0) == '0') {
					return false;
				} else {
					int ip = Integer.parseInt(str);
					if (ip<0 || ip > 255) {
						return false;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;

	}
}
