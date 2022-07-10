package com.coffeewithcode.dsa.gfg;

import com.coffeewithcode.dsa.gfg.NthNodeFromEndOfLinkedList.Node;

public class ReverseALinkedList {
	public static void main(String[] args) {
		
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
		node.next.next.next.next = new Node(7);
		node.next.next.next.next.next = new Node(8);
		Node node1=reverseList(node);
		while(node1!=null) {
			System.out.println(node1.data+" ");
			node1=node1.next;
		}
		
	}
	static Node reverseList(Node head)
    {
		  if(head == null)
		       return null;
		       Node prev = null;   
		       Node current = head;
		       Node next = current.next;
		       while(current!=null)
		       {
		           next=current.next;
		           current.next=prev;
		           prev=current; 
		           current =next;        
		       }
		       return prev; 
    }

}
