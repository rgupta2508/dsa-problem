package com.coffeewithcode.dsa.gfg;

public class TreeCeilinBST {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(11);
		root.left.left = new Node(4);
		root.left.right = new Node(7);
		root.left.right.right = new Node(8);
		TreeCeilinBST a = new TreeCeilinBST();
		System.out.println(a.findCeil(root, 6));
	}

	int findCeil(Node root, int key) {
		if (root == null)
			return -1;
		
		findCeilUtil(root, key);
		return ans;
	}
	public int ans = 0;
	void findCeilUtil(Node root, int key) {
		if (root == null)
			return;
		// Code here
		if (root.data == key) {
			ans= root.data;
			return;
		} else if (root.data > key) {
			ans=root.data;
			 findCeil(root.left, key);
			 return;
		} else {
			 findCeil(root.right, key);
			 return;
		}
	}
}
