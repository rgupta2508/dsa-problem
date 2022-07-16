package com.coffeewithcode.dsa.gfg;

public class LinkedListRemoveDuplicateElementFromSortedLinkedList {
	
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
		Node node = new Node(2);
		node.next = new Node(4);
		node.next.next = new Node(4);
		node.next.next.next = new Node(8);
		node.next.next.next.next = new Node(9);
		LinkedListRemoveDuplicateElementFromSortedLinkedList a = new LinkedListRemoveDuplicateElementFromSortedLinkedList();
		Node result = a.removeDuplicates(node);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}
	Node removeDuplicates(Node head)
    {
		if(head.next==null){
	        return head;
	    }
		Node curr= head;
	    while(curr.next!=null){
	        if(curr.data==curr.next.data){
	            curr.next=curr.next.next;
	        }else{
	            curr=curr.next;
	        }
	    }
		return head;
    }

}
