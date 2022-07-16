package com.coffeewithcode.dsa.gfg;

public class LinkedListAddTwoNumbersRepresentedByLinkedLists {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(4);
		node.next = new Node(5);

		Node node1 = new Node(3);
		node1.next = new Node(4);
		node1.next.next = new Node(5);

		Node res1=addTwoLists(node, node1);
		while (res1 != null) {
			System.out.println(res1.data);
			res1 = res1.next;
		}
	}

	static Node addTwoLists(Node first, Node second) {
		// code here
		// return head of sum list\
		first=rev(first);
		second=rev(second);
		Node result=null;;
		int carry=0;
		while (first != null|| second!=null) {
			if(first!=null&&second!=null) {
			Node node1=new Node((carry+first.data+second.data)%10);
			node1.next=result;
			carry=(carry+first.data+second.data)/10;
			result=node1;
			first=first.next;
			second=second.next;
			}else if(first!=null) {
				Node node1=new Node((carry+first.data)%10);
				node1.next=result;
				carry=(carry+first.data)/10;
				result=node1;
				first=first.next;
				
			}else  if(second!=null) {
				Node node1=new Node((carry+second.data)%10);
				node1.next=result;
				carry=(carry+second.data)/10;
				result=node1;
				second=second.next;
				
			}
		}
		if(carry!=0) {
		Node node1=new Node(carry);
		node1.next=result;result=node1;
		}
		return result;
	}
	public static Node rev(Node node) {
		Node res=null;
		while (node != null) {
			Node temp=node.next;
			node.next = res;
			res=node;
			node=temp;
		}
		return res;
	}

}
