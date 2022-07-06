package com.coffeewithcode.dsa.util;

import java.util.LinkedList;
import java.util.Queue;



public class Tree {

	public static Node buildTree(String str) {
		// Corner Case
		if (str.length() == 0 || str.equals('N'))
			return null;
		String[] s = str.split(" ");

		Node root = new Node(Integer.parseInt(s[0]));
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		// Starting from the second element
		int i = 1;
		while (!q.isEmpty() && i < s.length) {
			// Get and remove the front of the queue
			Node currNode = q.remove();

			// Get the current node's value from the string
			String currVal = s[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				q.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= s.length)
				break;
			currVal = s[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				q.add(currNode.right);
			}

			i++;
		}

		return root;
	}

}
