package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMirrorTree {

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
		Node result = getTreeMirrorTree(tree);
		ArrayList<Integer> list = levelOrder(result);
		for (int i : list) {
			System.out.println(i);
		}
	}

	public static Node getTreeMirrorTree(Node root) {
		if (root == null) {
			return root;
		} else {
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		getTreeMirrorTree(root.left);
		getTreeMirrorTree(root.right);
		return root;

	}

	public static ArrayList<Integer> levelOrder(Node root) {
		// Your code here
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (queue.size() != 0) {
			Node node = queue.poll();
			result.add(node.data);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return result;
	}

}
