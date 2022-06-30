package com.coffeewithcode.dsa;

public class NthNodeFromEndOfLinkedList {
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
		System.out.println(getNthFromLast(node, 3));

	}

	private static int getNthFromLast(Node head,int n) {
		  int len = 0;
	        Node temp = head;

	        // 1) count the number of nodes in Linked List
	        while (temp != null) {
	            temp = temp.next;
	            len++;
	        }

	        // check if value of n is not more than length of
	        // the linked list
	        if (len < n)
	            return -1;

	        temp = head;

	        // 2) get the (len-n+1)th node from the beginning
	        for (int i = 1; i < len - n + 1; i++)
	            temp = temp.next;

	        return temp.data;
	}
		
	

}
