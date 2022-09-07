package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeZigZagTreeTraversal {

	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);
		tree.left.left = new Node(40);
		tree.left.right = new Node(60);
		// 10
		// / \
		// 20 30
		// / \
		// 40 60
		//
		ArrayList<Integer> list = zigZagTraversal(tree);
		for (int i : list) {
			System.out.println(i);
		}
	}

	static ArrayList<Integer> zigZagTraversal(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean flag = true;

		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);

				if (flag)
					list.add(curr.data);
				else
					list.add(0, curr.data);
			}
			ans.addAll(list);
			flag = !flag;
		}

		return ans;
	}

}
