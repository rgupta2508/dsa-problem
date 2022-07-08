package com.coffeewithcode.dsa;

import com.coffeewithcode.dsa.util.Node;

public class TreeSumTree {
	public static void main(String[] args) {
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);
		tree.left.left = new Node(40);
		tree.left.right = new Node(60);

		TreeSumTree a = new TreeSumTree();
		boolean result = a.isSumTree(tree);
		System.out.println("isSumTree " + result);

	}

	boolean isSumTree(Node root) {
		return isSum(root);
	}

	Boolean isSum(Node node) {
		if (node == null) {
			return true;
		}
		if (node.left == null && node.right == null) {
			return true;
		}
		if (node.data == findSum(node.left) + findSum(node.right)) {
			return isSum(node.left) && isSum(node.right);
		}
		return false;
	}

	int findSum(Node node) {
		if (node == null) {
			return 0;
		}
		int sum = node.data + findSum(node.left) + findSum(node.right);
		return sum;
	}

}
