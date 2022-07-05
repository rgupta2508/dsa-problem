package com.coffeewithcode.dsa;

public class LinkedListCheckIfLinkedListIsPalindrome {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);

		node.next.next.next = new Node(2);
		node.next.next.next.next = new Node(1);

		System.out.println(isPalindrome(node));
	}

	/*
	 * Function to check if given linked list is palindrome or not
	 */
	static boolean isPalindrome(Node head) {
	    Node slowPtr, fastPtr, secondHalf;

		slowPtr = head;
		fastPtr = head;
		Node prevOfSlowPtr = head;
		Node midnode = null; // To handle odd size list
		boolean res = true; // initialize result

		if (head != null && head.next != null) {
			/*
			 * Get the middle of the list. Move slow_ptr by 1 and fast_ptr by 2, slow_ptr
			 * will have the middle node
			 */
			while (fastPtr != null && fastPtr.next != null) {
				fastPtr = fastPtr.next.next;

				/*
				 * We need previous of the slow_ptr for linked lists with odd elements
				 */
				prevOfSlowPtr = slowPtr;
				slowPtr = slowPtr.next;
			}

			/*
			 * fast_ptr would become NULL when there are even elements in the list and not
			 * NULL for odd elements. We need to skip the middle node for odd case and store
			 * it somewhere so that we can restore the original list
			 */
			if (fastPtr != null) {
				midnode = slowPtr;
				slowPtr = slowPtr.next;
			}

			// Now reverse the second half and compare it with first half
			secondHalf = slowPtr;
			prevOfSlowPtr.next = null; // NULL terminate first half
			secondHalf= reverse(secondHalf); // Reverse the second half
			res = compareLists(head, secondHalf); // compare

			/* Construct the original list back */
			secondHalf=reverse(secondHalf); // Reverse the second half again

			if (midnode != null) {
				// If there was a mid node (odd size case) which
				// was not part of either first half or second half.
				prevOfSlowPtr.next = midnode;
				midnode.next = secondHalf;
			} else
				prevOfSlowPtr.next = secondHalf;
		}
		return res;
	}

	/*
	 * Function to reverse the linked list Note that this function may change the
	 * head
	 */
	static Node reverse(Node second_half) {
		Node prev = null;
		Node current = second_half;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		second_half = prev;
		return second_half;
	}

	/* Function to check if two input lists have same data */
	static boolean compareLists(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else
				return false;
		}

		/* Both are empty return 1 */
		if (temp1 == null && temp2 == null)
			return true;

		/*
		 * Will reach here when one is NULL and other is not
		 */
		return false;
	}

}
