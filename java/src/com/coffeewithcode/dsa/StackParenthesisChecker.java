package com.coffeewithcode.dsa;

import java.util.Stack;

public class StackParenthesisChecker {
	public static void main(String[] args) {
		String s = "{([])}";
		System.out.println(isPair(s));
	}

	private static boolean isPair(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		if ((s.length() % 2) != 0)
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (!stack.isEmpty()) {
				if (stack.peek() == '(' && s.charAt(i) != ')') {
					return false;
				} else if (stack.peek() == '{' && s.charAt(i) != '}') {
					return false;
				} else if (stack.peek() == '[' && s.charAt(i) != ']') {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}

}
