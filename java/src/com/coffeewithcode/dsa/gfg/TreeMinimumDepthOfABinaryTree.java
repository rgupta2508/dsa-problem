package com.coffeewithcode.dsa.gfg;

public class TreeMinimumDepthOfABinaryTree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node tree = new Node(7);
		tree.left = new Node(1);
		tree.right = new Node(10);
		// tree.left.left = new Node(40);
		tree.left.right = new Node(2);
		tree.right.left = new Node(9);
		tree.right.right = new Node(11);
		System.out.println(mindepth(tree));

	}

	static int minDepth(Node root) {
		// code here
		// return mindepth(root);
		int result = mindepth(root);

		return result == Integer.MAX_VALUE ? 0 : result;

	}

	static int mindepth(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
//		if (root.left == null) {
//			return mindepth(root.right) + 1;
//		}
//		if (root.right == null) {
//			return mindepth(root.left) + 1;
//		}
		return Math.min(mindepth(root.left), mindepth(root.right)) + 1;
	}

}
