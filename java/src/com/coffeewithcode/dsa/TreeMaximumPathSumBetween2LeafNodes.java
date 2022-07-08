package com.coffeewithcode.dsa;

import com.coffeewithcode.dsa.TreeLeftViewOfBinaryTree.Node;

public class TreeMaximumPathSumBetween2LeafNodes {
	public static void main(String[] args) {
//	   12
//    /  \
//   13  10
//       / \
//      14 15
//     / \ / \
//   21 24 22 23
//
// Let us create Binary Tree as shown
// above */
		Node root = new Node(5);
		// root.left = new Node(6);
		root.right = new Node(6);
		root.right.left = new Node(-5);

		root.right.right = new Node(5);

		// root.right.left = new Node(14);
		// root.right.right = new Node(15);
//		Node left = root.right.left;
//		Node right = root.right.right;
//		left.left = new Node(21);
//		left.right = new Node(24);
//		right.left = new Node(22);
//		right.right = new Node(23);
		// target Node value is 14
		System.out.println(maxPathSum(root));
	}

	static int maxPathSum(Node root) {

		// if tree is left most or right most
		// call setTree() method to adjust tree first
		if(root.left==null) {
			root.left=new Node(0);
		}
		if(root.right==null) {
			root.right=new Node(0);
		}
		maxPathSumUtil(root);
		return res;
	}

	public static int res = Integer.MIN_VALUE;

	// A utility function to find the maximum sum between any
	// two leaves.This function calculates two values:
	// 1) Maximum path sum between two leaves which is stored
	// in res.
	// 2) The maximum root to leaf path sum which is returned.
	// If one side of root is empty, then it returns INT_MIN
	static int maxPathSumUtil(Node node) {

		// Base cases
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return node.data;

		// Find maximum sum in left and right subtree. Also
		// find maximum root to leaf sums in left and right
		// subtrees and store them in ls and rs
		int ls = maxPathSumUtil(node.left);
		int rs = maxPathSumUtil(node.right);

		// If both left and right children exist
		if (node.left != null && node.right != null) {

			// Update result if needed
			res = Math.max(res, ls + rs + node.data);

			// Return maximum possible value for root being
			// on one side
			return Math.max(ls, rs) + node.data;
		}

		// If any of the two children is empty, return
		// root sum for root being on one side
		return (node.left == null) ? rs + node.data : ls + node.data;
	}
}
