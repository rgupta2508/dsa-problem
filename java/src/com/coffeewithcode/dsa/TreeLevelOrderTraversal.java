package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {
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
		
	
		
		

		ArrayList<Integer> result = findSpiral(tree);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> findSpiral(Node root) {
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
