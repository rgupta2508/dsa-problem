package com.coffeewithcode.dsa;

import java.util.Stack;

public class GetMinimumElementFromStack {

	public static void main(String[] args) {
		GetMinimumElementFromStack obj = new GetMinimumElementFromStack();
		obj.push(9);
		obj.push(3);

		obj.push(4);

		obj.push(1);
		System.out.println(obj.minEle);
		obj.pop();
		System.out.println(obj.minEle);

	}

	int minEle;
	Stack<Integer> s;

	/* returns min element from stack */
	int getMin() {
		// Your code here

	}

	/* returns poped element from stack */
	int pop() {
		// Your code here

	}

	/* push element x into the stack */
	void push(int x) {
		// Your code here
	}
}
