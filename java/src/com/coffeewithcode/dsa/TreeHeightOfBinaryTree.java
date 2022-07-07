package com.coffeewithcode.dsa;

import com.coffeewithcode.dsa.util.Node;

public class TreeHeightOfBinaryTree {
	public static void main(String[] args) {
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);
		tree.left.left = new Node(40);
		tree.left.right = new Node(60);
		
		TreeHeightOfBinaryTree a=new TreeHeightOfBinaryTree();
		int result = a.height(tree);
		System.out.println("height of tree is "+result);
		
	}
	

	private int height(Node node) {
		if(node==null) {
			return 0;
		}
		// TODO Auto-generated method stub
		return 1+Math.max(height(node.left),height(node.right));
	}

}
