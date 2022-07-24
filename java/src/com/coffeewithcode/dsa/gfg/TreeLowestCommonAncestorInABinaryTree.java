package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class TreeLowestCommonAncestorInABinaryTree {
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
		//tree.left.left = new Node(40);
		tree.left.right = new Node(2);
		tree.right.left = new Node(9);
		tree.right.right = new Node(11);


		Node result = lca(tree, 9, 10);
		//System.out.println(result);
		System.out.println(result.data);

	}

	static Node lca(Node root, int n1, int n2) {
		// Your code here
		ArrayList<Node> path1 = new ArrayList<>();

		ArrayList<Node> path2 = new ArrayList<>();
		if(findPath(root, n1, path1)==false) {
			return null;
		}
		if(findPath(root, n2, path2)==false) {
			return null;
		}
		 int i;
		for ( i= 0; i < path1.size()-1 && i < path2.size()-1; i++) {
			if (path1.get(i + 1).data != path2.get(i + 1).data) {
				return path1.get(i);
			}
		}
		return path1.get(i);
		}

	public static boolean findPath(Node node, int n, ArrayList<Node> list) {
		if(node==null) {
			return false;
		}
		list.add(node);
		if (node.data == n) {
			return true;
		}
		if(findPath(node.left, n, list)||findPath(node.right, n, list)) {
			return true;}
		list.remove(list.size() - 1);
		return false;
	}
}
