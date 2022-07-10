package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

import com.coffeewithcode.dsa.util.Node;
import com.coffeewithcode.dsa.util.Tree;

public class TreeBoundaryTraversalOfBinaryTree {

	public static void main(String[] args) {

		Node node = (Node) Tree
				.buildTree("17 N 1 N 9 N 2 N 11 N 16 N 8 N 5 N 3 N 10 N 13 N 5 N 13 N 7 N 10 N 4 N 7 N 2 N 12 N 16");
		// 10
		// / \
		// 20 30
		// / \
		// 40 60
		//
		TreeBoundaryTraversalOfBinaryTree a = new TreeBoundaryTraversalOfBinaryTree();
		for (int i : a.boundary(node)) {
			System.out.println(i);
		}

	}

	ArrayList<Integer> list = new ArrayList<>();

	public ArrayList<Integer> boundary(Node node) {
		if (node == null)
			return new ArrayList<Integer>();
		list.add(node.data);
		leftSideNode(node.left);
		leafNode(node.left);
		leafNode(node.right);
		rightSideNode(node.right);
		return list;

	}

	public void leafNode(Node root) {
		if (root == null)
			return;
		// If node is leaf node, print its data
		// If left child exists, check for leaf
		// recursively
		leafNode(root.left);
		if (root.left == null && root.right == null) {
			list.add(root.data);
		}
		// If right child exists, check for leaf recursively
		leafNode(root.right);
	}

	public void leftSideNode(Node node) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			// to ensure top down order, print the node
			// before calling itself for left subtree
			list.add(node.data);
			leftSideNode(node.left);
		} else if (node.right != null) {
			list.add(node.data);
			leftSideNode(node.right);
		}
		// do nothing if it is a leaf node, this way we avoid
		// duplicates in output

	}

	public void rightSideNode(Node node) {
		if (node == null)
			return;
		if (node.right != null) {
			// to ensure bottom up order, first call for right
			// subtree, then print this node
			rightSideNode(node.right);
			list.add(node.data);
		} else if (node.left != null) {
			rightSideNode(node.left);
			list.add(node.data);
		}
	}
}
