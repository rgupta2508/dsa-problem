package com.coffeewithcode.dsa;

import java.util.Stack;

public class GetMinimumElementFromStack {

	public static void main(String[] args) {
		GetMinimumElementFromStack obj = new GetMinimumElementFromStack();
		obj.push(9);
		obj.push(3);

		obj.push(4);

		obj.push(1);
		System.out.println(obj.getMin());
		System.out.println(obj.pop());
		System.out.println(obj.getMin());

	}

	int minEle;
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();

	/* returns min element from stack */
	int getMin() {
		// Your code here
		if (s.size() == 0) {
			return -1;
		}
		return min.peek();

	}

	/* returns poped element from stack */
	int pop() {
		// Your code here
		if (s.size() == 0) {
			return -1;
		}
		min.pop();

		return s.pop();

	}

	/* push element x into the stack */
	void push(int x) {
		if (s.size() == 0) {
			min.push(x);
			s.push(x);
			return;
		}
		// Your code here
		// System.out.println(min.size());
		if (min.peek() > x) {
			min.push(x);
		} else {
			min.push(min.peek());
		}
		s.push(x);
	}
}
