package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.coffeewithcode.dsa.util.Node;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);
		tree.left.left = new Node(40);
		tree.left.right = new Node(60);

		ArrayList<Integer> result = levelOrder(tree);

		for (int i : result) {
			System.out.println(i);
		}

	}

	static ArrayList<Integer> levelOrder(Node node) {
		// Your code here
		if (node == null) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				al.add(curr.data);
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		return al;
	}

}
