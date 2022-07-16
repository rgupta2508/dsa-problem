package com.coffeewithcode.dsa.gfg;

public class SpecificStringSubsequencesOfaString {
	public static void main(String[] args) {
		String s= "gksgks";
		String s2 = "gks";
		System.out.println(count(s, s2, 6,3));
		
	
	}

	 static int count(String a, String b, int m, int n)
	    {
	        // If both first and second string is empty,
	        // or if second string is empty, return 1
	        if ((m == 0 && n == 0) || n == 0)
	            return 1;
	     
	        // If only first string is empty and
	        // second string is not empty, return 0
	        if (m == 0)
	            return 0;
	     
	        // If last characters are same
	        // Recur for remaining strings by
	        // 1. considering last characters of
	        // both strings
	        // 2. ignoring last character of
	        // first string
	        if (a.charAt(m - 1) == b.charAt(n - 1))
	            return count(a, b, m - 1, n - 1) +
	                   count(a, b, m - 1, n);
	        else
	            // If last characters are different, 
	            // ignore last char of first string
	            // and recur for  remaining string
	            return count(a, b, m - 1, n);
	    }
}
