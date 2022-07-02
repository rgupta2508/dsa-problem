package com.coffeewithcode.dsa;

import com.coffeewithcode.dsa.NthNodeFromEndOfLinkedList.Node;

public class ReverseALinkedListInGroupsOfgivenSize {
	public static void main(String[] args) {

		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
		node.next.next.next.next = new Node(7);
		node.next.next.next.next.next = new Node(8);
		Node node1 = reverseList(node, 3);
		while (node1 != null) {
			System.out.println(node1.data + " ");
			node1 = node1.next;
		}

	}

	static Node reverseList(Node head, int n) {
		if (head == null)
			return null;
		Node prev = null;
		Node current = head;
		int temp=0;
		Node tempNode=null;
		tempNode=head;
		while (current != null&& temp<n) {
			temp++;
			tempNode = current.next;
			current.next = prev;
			prev = current;
			current = tempNode;
			
		}
		if(tempNode!=null) {
			head.next=reverseList(tempNode,n);
		}
		return prev;
	}

}
