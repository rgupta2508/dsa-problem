package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeVerticalTraversalOfBinaryTree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static class Qobj {
		int hd;
		Node node;

		Qobj(int hd, Node node) {
			this.hd = hd;
			this.node = node;
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
		ArrayList<Integer> result = verticalOrder(tree);
		for (int i : result) {
			System.out.println(i);
		}
	}

	static ArrayList<Integer> verticalOrder(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		// Base case
		if (root == null)
			return result;

		// Create a map and store vertical order in
		// map using function getVerticalOrder()
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
		int hd = 0;

		// Create queue to do level order traversal.
		// Every item of queue contains node and
		// horizontal distance.
		Queue<Qobj> que = new LinkedList<Qobj>();
		que.add(new Qobj(0, root));

		while (!que.isEmpty()) {
			// pop from queue front
			Qobj temp = que.poll();
			hd = temp.hd;
			Node node = temp.node;

			// insert this node's data in array of hash
			if (m.containsKey(hd)) {
				m.get(hd).add(node.data);
			} else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(node.data);
				m.put(hd, al);
			}
			if (node.left != null)
				que.add(new Qobj(hd - 1, node.left));
			if (node.right != null)
				que.add(new Qobj(hd + 1, node.right));
		}

		// Traverse the map and print nodes at
		// every horizontal distance (hd)
		for (Map.Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			ArrayList<Integer> al = entry.getValue();
			for (Integer i : al) {
				//System.out.print(i + " ");
				result.add(i);
			}
			System.out.println();
		}
		return result;

	}

	
	
	static ArrayList<Integer> verticalOrder1(Node root) {
		// add your code here
		HashMap<Integer, List<Integer>> res = new HashMap<>();
		HashMap<Integer, Integer> temp = new HashMap<>();

		ArrayList<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		res.put(0, new ArrayList<>(Arrays.asList(root.data)));
		temp.put(root.data, 0);
		int temp1 = 0;
		while (queue.size() != 0) {
			temp1--;
			Node node = queue.poll();
			// result.add(node.data);
			if (node.left != null) {
				queue.add(node.left);
				temp.put(node.left.data, temp.get(node.data) - 1);

				// res.containsKey(temp.get(node.data)-1)?new
				// ArrayList<>(node.data):res.get(temp.get(node.data)-1).add(node.data);
				List<Integer> list = null;
				if (res.containsKey(temp.get(node.data) - 1)) {
					list = res.get(temp.get(node.data) - 1);
					list.add(node.left.data);
				} else {
					list = new ArrayList<>(Arrays.asList(node.left.data));
				}

				res.put(temp.get(node.data) - 1, list);

				// temp1=temp1<temp.get(node.data)-1?temp1:temp.get(node.data)-1;
			}
			if (node.right != null) {

				queue.add(node.right);
				temp.put(node.right.data, temp.get(node.data) + 1);

				List<Integer> list = null;
				if (res.containsKey(temp.get(node.data) + 1)) {
					list = res.get(temp.get(node.data) + 1);
					list.add(node.right.data);
				} else {
					list = new ArrayList<>(Arrays.asList(node.right.data));
				}

				res.put(temp.get(node.data) + 1, list);

			}
		}

		for (int i = temp1; i < -temp1; i++) {
			if (res.containsKey(i)) {
				for (int item : res.get(i)) {
					result.add(item);
				}
			}
		}
		return result;

	}

}
