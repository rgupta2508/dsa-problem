package com.coffeewithcode.dsa.gfg;

public class LinkedListLeftShiftRotateALinkedList {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		// int value[] = {2, 4, 7, 8, 9}
		int k = 3;
		Node node = new Node(2);
		node.next = new Node(4);
		node.next.next = new Node(7);
		node.next.next.next = new Node(8);
		node.next.next.next.next = new Node(9);
		LinkedListLeftShiftRotateALinkedList a = new LinkedListLeftShiftRotateALinkedList();
		Node result = a.rotate(node, k);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}

	public Node rotate(Node head, int k) {
		// add code here
		if (k == 0)
			return head;

		Node current = head;

		// current will either point to kth or NULL after this
		// loop. current will point to node 40 in the above example
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}

		// If current is NULL, k is greater than or equal to count
		// of nodes in linked list. Don't change the list in this case
		if (current == null)
			return head;

		// current points to kth node. Store it in a variable.
		Node kthNode = current;

		// current will point to last node after this loop
		while (current.next != null)
			current = current.next;

		// Change next of last node to previous head

		current.next = head;

		// Change head to (k+1)th node

		head = kthNode.next;

		// change next of kth node to null
		kthNode.next = null;
		return head;

	}

}
