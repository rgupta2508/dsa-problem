package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class PrintBurningTreeInOrder {



	
	static class Node
	{
		int val;
		Node left;
		Node right;
		Node() {}
		Node(int val) { this.val = val; }
		Node(int val, Node left, Node right)
		{
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	
	static Map<Integer, List<Node>> map = new HashMap<>();
		public static void main (String[] args) {
			 /*  12
	           /  \
	          13  10
	              / \
	             14 15
	            / \ / \
	          21 24 22 23
	 
	        Let us create Binary Tree as shown
	        above */
			Node root = new Node(12);
			root.left = new Node(13);
			root.right = new Node(10);
			root.right.left = new Node(14);
			root.right.right = new Node(15);
			Node left = root.right.left;
			Node right = root.right.right;
			left.left = new Node(21);
			left.right = new Node(24);
			right.left = new Node(22);
			right.right = new Node(23);
			// target Node value is 14
			burnTree(root,left);
		System.out.println();
		}
	private static void burnTree(Node root, Node target) {
			List<Integer> res = new ArrayList<Integer> ();
			if (root == null )
			return ;
			buildMap(root, null);
			if (!map.containsKey(target.val))
			{ System.out.println("Target Not found");
			return;
			}
			Set<Node> visited = new HashSet<Node>();
		//BFS traversal
			Queue<Node> q = new LinkedList<Node>();
			q.add(target);
			visited.add(target);
			while (!q.isEmpty()) {
				int size = q.size();
				
				for (int i = 0; i < size; i++) {
					Node node = q.poll();
					System.out.print(node.val+" ");
					for (Node next : map.get(node.val)) {
						if (visited.contains(next))
						continue;
						visited.add(next);
						q.add(next);
					}
				}
				System.out.println();
				
			}
	
	
	}
		// build undirected graph
	private static void buildMap(Node node, Node parent) {
			if (node == null)
				return;
			if (!map.containsKey(node.val)) {
				
				map.put(node.val, new ArrayList<Node>());
				if (parent != null) { map.get(node.val).add(parent); map.get(parent.val).add(node) ; }
				buildMap(node.left, node);
				buildMap(node.right, node);
			}
		}


}
