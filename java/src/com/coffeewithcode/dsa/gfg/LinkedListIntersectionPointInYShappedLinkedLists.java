package com.coffeewithcode.dsa.gfg;

public class LinkedListIntersectionPointInYShappedLinkedLists {
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
		node1.next = new Node(9);
		node1.next.next = new Node(10);
		
		Node node2 = new Node(7);
		node2.next = new Node(11);
		node2.next.next = new Node(12);
		
		node2.next.next.next = node;
		
		node1.next.next.next = node;


		
		int intersectPoint1=intersectPoint(node1,node2);
		System.out.println(intersectPoint1);
	}

	private static int intersectPoint(Node node1,Node node2) {
        Node a=node1,b=node2;
        while(a!=b){
            a=((a==null)?node2:a.next);
            b=((b==null)?node1:b.next);
        }
        return (a==null)?-1:a.data;}
	
	

}
