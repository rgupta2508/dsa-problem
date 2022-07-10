package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.List;



public class TreeLeftViewOfBinaryTree {
	static class Node
	{
		int data;
		Node left, right;

		public Node(int item)
		{
			data = item;
			left = right = null;
		}
	}
	
	public static void main(String[] args) {
	/*   12
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
		leftViewTree(root, left).forEach(System.out::println);
;
	}

	private static List<Integer>  leftViewTree(Node root, Node left) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList<>();
	       leftSideNode(root, list, 0);
	       return list;
	}
	public static void leftSideNode(Node root, ArrayList<Integer> list ,int level){
	       if(root == null){
	           return;
	       }
	       if(level == list.size()){
	          list.add(root.data);
	       }
	       leftSideNode(root.left, list, level +1);
	       
	       //System.out.println(root.data);
	       leftSideNode(root.right,list, level + 1);
	       
	   }
}
