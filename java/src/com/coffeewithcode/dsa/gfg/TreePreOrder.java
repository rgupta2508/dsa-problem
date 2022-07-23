package com.coffeewithcode.dsa.gfg;

//Java implementation to check if given Binary tree
//is a BST or not

/* Class containing left and right child of current
node and key value*/

public class TreePreOrder {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	void prePrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);

		prePrder(node.left);
		prePrder(node.right);
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		TreePreOrder tree = new TreePreOrder();
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);

		tree.prePrder(root);

	}
}
