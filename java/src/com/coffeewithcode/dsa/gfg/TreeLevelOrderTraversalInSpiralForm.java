package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.List;

public class TreeLevelOrderTraversalInSpiralForm {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);
		tree.left.left = new Node(40);
		tree.left.right = new Node(60);
		

		ArrayList<Integer> result = findSpiral(tree);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> findSpiral(Node root) {
		// Your code here
		ArrayList<Integer> l=new ArrayList<>();
        if(root==null)
          return l;
        List<Node> l2=new ArrayList<>();
        Node temp;
        int count=0,i=0;
        // Your code here
        l2.add(root);
        while(!l2.isEmpty())
        {
            temp=l2.get(i);
            l.add(temp.data);
            l2.remove(i);
            if(count%2==0)
            {
                if(temp.right!=null)
                  l2.add(temp.right);
                if(temp.left!=null)
                  l2.add(temp.left);
            }
            else
            {
                if(temp.left!=null)
                  l2.add(temp.left);
                if(temp.right!=null)
                  l2.add(temp.right);
            }
            i--;
            if(i==-1)
            {
                i=l2.size()-1;
                count++;
            }
        }
        return l;
	}

}
