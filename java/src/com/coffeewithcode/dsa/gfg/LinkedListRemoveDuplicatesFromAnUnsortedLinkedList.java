package com.coffeewithcode.dsa.gfg;

import java.util.HashSet;

import com.coffeewithcode.dsa.gfg.LinkedListRemoveDuplicateElementFromSortedLinkedList.Node;

public class LinkedListRemoveDuplicatesFromAnUnsortedLinkedList {
	public static void main(String[] args) {
		// int value[] = {2, 4, 7, 8, 9}
		Node node = new Node(2);
		node.next = new Node(4);
		node.next.next = new Node(7);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(4);
		LinkedListRemoveDuplicatesFromAnUnsortedLinkedList a = new LinkedListRemoveDuplicatesFromAnUnsortedLinkedList();
		Node result = a.removeDuplicates(node);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	private Node removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		 
        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            
            // If current value is seen before
            if (hs.contains(current.data)) {
                prev.next = current.next;
            }
            else {
                hs.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
	}
	
}