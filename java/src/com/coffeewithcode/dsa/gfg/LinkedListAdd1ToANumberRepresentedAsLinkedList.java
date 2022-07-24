package com.coffeewithcode.dsa.gfg;

public class LinkedListAdd1ToANumberRepresentedAsLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(9);
//		node.next = new Node(9);
//		node.next.next = new Node(9);
//
//		node.next.next.next = new Node(9);
//		node.next.next.next.next = new Node(9);

		Node res1 = addOne(node);
		while (res1 != null) {
			System.out.println(res1.data);
			res1 = res1.next;
		}
	}

	public static Node addOne(Node head) {
		// code here.
		head = revList(head);
		Node cur = head;
		boolean isAddOne=true;
		while (cur != null) {
			//System.out.println(cur.data);
			if(cur.data==9&&isAddOne==true) {
				cur.data=0;
				if(cur.next==null){
					cur.next=new Node(1);
					break;
				}
			}else if(isAddOne==true) {
				cur.data=cur.data+1;
				isAddOne=false;
			}
			
			cur = cur.next;
		}
		head=revList(head);

		return head;
	}

	private static Node revList(Node node) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
}
