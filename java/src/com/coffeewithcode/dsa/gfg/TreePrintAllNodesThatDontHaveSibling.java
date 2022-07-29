package com.coffeewithcode.dsa.gfg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class TreePrintAllNodesThatDontHaveSibling {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		TreePrintAllNodesThatDontHaveSibling a = new TreePrintAllNodesThatDontHaveSibling();
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(4);
		// root.left.left = new Node(1);
		root.right.left = new Node(6);
		//root.right.right = new Node(8);

		ArrayList<Integer> list = a.noSibling(root);
		for (int i : list) {
			System.out.println(i);
		}

	}

	ArrayList<Integer> noSibling(Node node)
	   {
	       // code here
	       ArrayList<Integer> a =new ArrayList<>();
	       Queue<Node> q = new ArrayDeque<>();
	       q.add(node);
	       while(!q.isEmpty()){
	           Node cur = q.poll();
	           if(cur.left!=null && cur.right==null) {
	        	   a.add(cur.left.data);
	           }
	           if(cur.left==null && cur.right!=null) {
	        	   a.add(cur.right.data);
	           }
	           
	           if(cur.left!=null) {
	        	   q.add(cur.left);
	           }
	           if(cur.right!=null){
	        	   q.add(cur.right);
	           }
	       }
	       if(a.isEmpty())a.add(-1);
	       Collections.sort(a);
	       return a;
	   }
	

}
