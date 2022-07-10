package com.coffeewithcode.dsa.gfg;

public class LinkedListFindingMiddleElementInALinkedList {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
		node.next.next.next.next = new Node(7);
		node.next.next.next.next.next = new Node(8);
		node.next.next.next.next.next.next = new Node(9);
		int middleElement=getMiddle(node);
		System.out.println(middleElement);
	}

	private static int getMiddle(Node node) {
		// TODO Auto-generated method stub
		Node temp=node;
		while(node!=null&&node.next!=null) {
			node=node.next.next;
			temp=temp.next;
		}
		return temp.data;
	}

}
