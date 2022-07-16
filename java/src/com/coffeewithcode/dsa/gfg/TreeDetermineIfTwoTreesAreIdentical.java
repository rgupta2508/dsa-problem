package com.coffeewithcode.dsa.gfg;

public class TreeDetermineIfTwoTreesAreIdentical {

	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String args[]) {
		TreeDetermineIfTwoTreesAreIdentical a = new TreeDetermineIfTwoTreesAreIdentical();
		Node tree = new Node(10);
		tree.left = new Node(20);
		tree.right = new Node(30);

		Node tree1 = new Node(10);
		tree1.left = new Node(30);
		tree1.right = new Node(20);
		System.out.println(a.isIdentical(tree, tree1));
	}

	boolean isIdentical(Node root1, Node root2) {
		// Code Here
		if(root1==null&&root2==null) {
			return true;
		} else if(root2==null&&root1!=null) {
			return false;
		}else if(root1==null&&root2!=null) {
			return false;
		}
		if(root1.data!=root2.data) {
			return false;
		}else {
			if(!isIdentical(root1.left,root2.left)) {
				return false;
			}
			if(!isIdentical(root1.right, root2.right)) {
				return false;
			}
		}
		return true;
		
	}
}
