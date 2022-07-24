package com.coffeewithcode.dsa.gfg;

public class LinkedListMergeTwoSortedLinkedlists {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(2);
		node.next = new Node(4);
		node.next.next = new Node(7);
		node.next.next.next = new Node(8);
		node.next.next.next.next = new Node(9);
		Node node2 = new Node(1);
		node2.next = new Node(3);
		node2.next.next = new Node(5);
		node2.next.next.next = new Node(6);
		node2.next.next.next.next = new Node(10);
		Node result = merge(node, node2);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	static Node sortedMerge(Node head1, Node head2) {
		// You only need to complete this method
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		if (head1.data < head2.data) {
			head1.next = sortedMerge(head1.next, head2);
			return head1;
		} else {
			head2.next = sortedMerge(head1, head2.next);
			return head2;
		}

	}

	// Merges two given lists in-place. This function
	// mainly compares head nodes and calls mergeUtil()
	static Node merge(Node h1, Node h2) {
		if (h1 == null) {
			return h2;
		}
		if (h2 == null) {
			return h1;
		}
		Node ans = h1;
		if (h1.data > h2.data) {
			Node temp = h1;
			h1 = h2;
			h2 = temp;
		}
		while (h1 != null && h2 != null) {
			Node p = null;
			while (h1 != null && h1.data < h2.data) {
				p = h1;
				h1 = h1.next;
			}

			p.next = h2;

			Node temp = h1;
			h1 = h2;
			h2 = temp;
		}
		return ans;
	}
}
