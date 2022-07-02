package com.coffeewithcode.dsa;

import com.coffeewithcode.dsa.TreeTopViewOfBinaryTree.Node;

public class TreeCheckForBalancedTree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node tree=new Node(1);
		tree.left = new Node(10);
		tree.right = new Node(39);
		tree.left.left = new Node(5);
		
		System.out.println(isBalanced(tree));
	}

	static int height(Node node){
        if(node==null) {
        	return 1;
        }
        int left = height(node.left);
        int right = height(node.right);
        if(Math.abs(left-right)>1) {
        	ans = false;
        }
        return 1+ Math.max(left,right);
    }
    static boolean ans = true;
    public static boolean isBalanced(Node root)
    {
        ans = true;
	    height(root);
	    return ans;
    }
}
