package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedListIntersectionPointInLinkedLists {
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

		Node node1 = new Node(8);
		node1.next = new Node(5);
		node1.next.next = new Node(10);

		Node node2 = new Node(7);
		node2.next = new Node(11);
		node2.next.next = new Node(6);

		node2.next.next.next = node;

		node1.next.next.next = node;

		Node intersectPoints = intersectPoint(node1, node2);
		while(intersectPoints!=null) {
	          System.out.println(intersectPoints.data);
			intersectPoints = intersectPoints.next;
	       }
	}

	private static Node intersectPoint(Node head1, Node head2) {
		HashSet<Integer> set = new HashSet<>();
		   ArrayList<Integer> list= new ArrayList<>(); 
		       while(head2!=null) {
		          set.add(head2.data);
		          head2 = head2.next;
		       }
		   
		       while(head1!=null) {
		           if(set.contains(head1.data)) 
		               list.add(head1.data);
		       head1=head1.next;
		       }
		   
		       Node head = new Node(0);
		       Node curr = head;
		       for(Integer val : list) {
		           curr.next=new Node(val);
		           curr=curr.next;
		       }
		   return head.next;
	}

}
