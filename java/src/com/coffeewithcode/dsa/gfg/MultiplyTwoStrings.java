//https://practice.geeksforgeeks.org/problems/multiply-two-strings/1/?page=1&difficulty[]=1&difficulty[]=2&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&sortBy=submissions

package com.coffeewithcode.dsa.gfg;

import java.math.BigInteger;

public class MultiplyTwoStrings {
	public static void main(String[] args) {
		MultiplyTwoStrings a = new MultiplyTwoStrings();
		String s1 = "-505041410988047";
		String s2 = "3318139";
		System.out.println(a.multiplyStrings(s1, s2));
	}

	public String multiplyStrings(String num1, String num2) {
		boolean isNegative = false;
		if ((num1.charAt(0) == '-' || num2.charAt(0) == '-') && (num1.charAt(0) != '-' || num2.charAt(0) != '-')) {
			//System.out.print("-");
			isNegative = true;
		}
		if (num1.charAt(0) == '-')
			num1 = num1.substring(1);

		if (num2.charAt(0) == '-')
			num2 = num2.substring(1);

		int len1 = num1.length();
		int len2 = num2.length();
		if (len1 == 0 || len2 == 0)
			return "0";

		// will keep the result number in vector
		// in reverse order
		int result[] = new int[len1 + len2];

		// Below two indexes are used to
		// find positions in result.
		int iN1 = 0;
		int iN2 = 0;

		// Go from right to left in num1
		for (int i = len1 - 1; i >= 0; i--) {
			int carry = 0;
			int n1 = num1.charAt(i) - '0';

			// To shift position to left after every
			// multipliccharAtion of a digit in num2
			iN2 = 0;
			System.out.println("===");

			// Go from right to left in num2
			for (int j = len2 - 1; j >= 0; j--) {
				// Take current digit of second number
				int n2 = num2.charAt(j) - '0';

				// Multiply with current digit of first number
				// and add result to previously stored result
				// charAt current position.
				int sum = n1 * n2 + result[iN1 + iN2] + carry;
				System.out.println(sum);

				// Carry for next itercharAtion
				carry = sum / 10;

				// Store result
				result[iN1 + iN2] = sum % 10;

				iN2++;
			}

			// store carry in next cell
			if (carry > 0)
				result[iN1 + iN2] += carry;

			// To shift position to left after every
			// multipliccharAtion of a digit in num1.
			iN1++;

		}

		// ignore '0's from the right
		int i = result.length - 1;
		while (i >= 0 && result[i] == 0)
			i--;

		// If all were '0's - means either both
		// or one of num1 or num2 were '0'
		if (i == -1)
			return "0";

		// genercharAte the result String
		String s = "";

		while (i >= 0)
			s += (result[i--]);

		return isNegative?"-"+s:s;
		// return intToStr(res);
		// code here.
	}

}
