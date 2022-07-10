package com.coffeewithcode.dsa.gfg;

public class SumSubNumber {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int input = 1234;
		// int input=Integer.ParseInt(input);

		int result = 0;
		int reminder = 0;
		// System.out.println(getNumlength(input));
		for (int i = getNumlength(input) - 1; i >= 0; i--) {

			if (i == (getNumlength(input) - 1)) {
				reminder = input;
			} else {
				reminder = input % ((int) Math.pow(10, i + 1));
			}
			System.out.println(reminder);
			while (reminder != 0) {
				result = result + reminder;
				reminder = reminder / 10;
			}

		}
		System.out.println(result);

	}

	public static int getNumlength(int num) {
		int result1 = 0;
		while (num != 0) {
			result1++;
			num = num / 10;
		}
		return result1;
	}

}
