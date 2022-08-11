package com.coffeewithcode.dsa.gfg;

public class LinkedListDeleteFindingMiddleElementInALinkedList {
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
		
		
		Node result = deleteNode(node, 2);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}
	static Node deleteNode(Node head, int x)
    {
		if(x==1) {
			head=head.next;
			return head;
		}
		int curCount=1;
		Node prev=head;
		Node current=head;
		while(current!=null) {
			prev=current;
			current=current.next;
			curCount++;
			if(curCount==x) {
				 prev.next = current.next;
	               break;
			}
		}
		return head;
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
