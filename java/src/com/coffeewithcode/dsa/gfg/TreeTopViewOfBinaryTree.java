package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeTopViewOfBinaryTree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
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

		//Node root1 = new Node(1);
		//root1.right = new Node(2);
		for (int i : topViewTree(root)) {
			System.out.println(i + "-==");
		}
		// topViewTree(root1).forEach(System.out::println);

		
	}

	//static Map<Integer, Integer> map;

	private static ArrayList<Integer> topViewTree(Node root) {

        class QueueObj {
            Node node;
            int hd;
 
            QueueObj(Node node, int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Integer> topViewMap
            = new TreeMap<Integer, Integer>();
 
        if (root == null) {
            return null;
        }
        else {
            q.add(new QueueObj(root, 0));
        }
 
        System.out.println(
            "The top view of the tree is : ");
 
        // count function returns 1 if the container
        // contains an element whose key is equivalent
        // to hd, or returns zero otherwise.
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node.data);
            }
 
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                                   tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                                   tmpNode.hd + 1));
            }
        }
		
		
		//map = new TreeMap<>();

		
		// Map<Integer, Node> map=new HashMap<Integer, Node>() ;
		// map.put(0, root);
		//topViewTreeUiil(root, 0);

		
		return new ArrayList<Integer>(topViewMap.values());

		// return map.values();

		// TODO Auto-generated method stub
		// ArrayList<Integer> list = new ArrayList<>();
		// leftSideNode(root, list, 0);
		// return list;
	}


}
