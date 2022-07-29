package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.List;

public class TreeCheckIfSubtree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		//TreeCheckIfSubtree a = new TreeCheckIfSubtree();
		Node root = new Node(10);
		root.left = new Node(4);
		root.right = new Node(6);
		//root.left.left = new Node(4);
		root.left.right = new Node(30);
		root.right.left = new Node(2);

		Node root2 = new Node(10);
		root2.left = new Node(4);
		root2.right = new Node(6);
		//root.left.left = new Node(4);
		root2.left.right = new Node(30);
		//root2.right.left = new Node(2);
		System.out.println(isSubtree1(root, root2));
	}

	public static void inOrder(Node node, List<Integer> list){
	       if(node==null){
	           list.add(-1);
	           return;
	       }
	       inOrder(node.left,list);
	       list.add(node.data);
	       inOrder(node.right,list);
	       
	   }
	   public static void preOrder(Node node, List<Integer> list){
	       if(node==null){
	           list.add(-1);
	           return;
	       }
	       list.add(node.data);
	       preOrder(node.left,list);
	       preOrder(node.right,list);
	       
	   }
	   public static boolean search(List<Integer> list1, List<Integer> list2){
	       int n1 = list1.size(), n2 = list2.size();
	       int lps[] = new int[n2];
	       int i = 1, j = 0;
	       while(i<n2){
	           if((int)list2.get(i)==(int)list2.get(j)){
	               j++;
	               lps[i] = j;
	               i++;
	           }else if(j!=0){
	               j = lps[j-1]; 
	           }else{
	               i++;
	           }
	       }
	       i = 0;
	       j = 0;
	       while(i<n1){
	           if((int)list1.get(i)==(int)list2.get(j)){
	               i++;
	               j++;
	               if(j==n2)   return true;
	           }else if(j!=0){
	               j = lps[j-1];
	           }else{
	               i++;
	           }
	       }
	       return false;
	   }
	   public static boolean isSubtree1(Node T, Node S) {
	       List<Integer> list1 = new ArrayList<>();
	       List<Integer> list2 = new ArrayList<>();
	       List<Integer> list3 = new ArrayList<>();
	       List<Integer> list4 = new ArrayList<>();
	       inOrder(T,list1);
	       inOrder(S,list2);
	       preOrder(T,list3);
	       preOrder(S,list4);
	       if(search(list1,list2) && search(list3,list4)){
	           return true;
	       }
	       return false;
	   }
	
	

	public boolean matchTree(Node a, Node b) {
		if (a == null && a == null)
			return true;

		if (a == null || b == null)
			return false;

		boolean l = matchTree(a.left, b.left);
		boolean r = matchTree(a.right, b.right);

		return (l && r && (a.data == b.data));
	}

	public boolean isSubTree(Node T, Node S) {
		if (T == null)
			return false;

		if (T.data == S.data && matchTree(T, S))
			return true;

		boolean l = isSubTree(T.left, S);
		boolean r = isSubTree(T.right, S);

		return (l || r);
	}
}
