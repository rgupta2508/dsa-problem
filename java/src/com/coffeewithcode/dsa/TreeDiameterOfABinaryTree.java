package com.coffeewithcode.dsa;

public class TreeDiameterOfABinaryTree {

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
		TreeDiameterOfABinaryTree a=new TreeDiameterOfABinaryTree();
		System.out.println(a.diameter(tree));

	}

	public int res = 0;

	public int diameter(Node root) {
		if (root == null) {
			return 0;
		}
		diameterUtil(root);
		return res;
	}

	public int diameterUtil(Node root) {
		if (root == null) {
			return 0;
		}
		int dia1 = diameterUtil(root.left);
		int dia2 = diameterUtil(root.right);
		int dia3 = dia1 + dia2 + 1;
		res = Math.max(res, dia3);
		return 1 + Math.max(dia1, dia2);

	}

}
