package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumOfAllSubarraysOfSizek {

	public static void main(String[] args) {
		int n = 9, k = 3;
		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		List<Integer> result = maxOfSubarrays(arr, n, k);
		for (int element : result) {
			System.out.println("Element : " + element);
		}
		System.out.println("================");

		List<Integer> result1 = maxOfSubarrays2(arr, n, k);
		for (int element : result1) {
			System.out.println("Element : " + element);
		}

	}

	static ArrayList<Integer> maxOfSubarrays(int arr[], int n, int k) {
		System.out.println("===");
		ArrayList<Integer> result = new ArrayList<Integer>();
		PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
		// Your code here
		for (int i = 0; i < n; i++) {
			temp.add(arr[i]);
			// System.out.println(arr[i]+"=="+k+"=="+temp.size());
			if (temp.size() == k) {
				result.add(temp.peek());
				temp.remove(arr[i - k + 1]);
			}
		}
		return result;
	}

//#####################
	// Sliding window approach
	// A Dequeue (Double ended queue)
	// based method for printing
	// maximum element of
	// all subarrays of size k
	static ArrayList<Integer> maxOfSubarrays2(int arr[], int n, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		// Create a Double Ended Queue, Qi
		// that will store indexes of array elements
		// The queue will store indexes of
		// useful elements in every window and it will
		// maintain decreasing order of values
		// from front to rear in Qi, i.e.,
		// arr[Qi.front[]] to arr[Qi.rear()]
		// are sorted in decreasing order
		Deque<Integer> Qi = new LinkedList<Integer>();

		/*
		 * Process first k (or first window) elements of array
		 */
		int i;
		for (i = 0; i < k; ++i) {

			// For every element, the previous
			// smaller elements are useless so
			// remove them from Qi
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])

				// Remove from rear
				Qi.removeLast();

			// Add new element at rear of queue
			Qi.addLast(i);
		}

		// Process rest of the elements,
		// i.e., from arr[k] to arr[n-1]
		for (; i < n; ++i) {

			// The element at the front of the
			// queue is the largest element of
			// previous window, so print it
			result.add(arr[Qi.peek()]);

			// Remove the elements which
			// are out of this window
			while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
				Qi.removeFirst();

			// Remove all elements smaller
			// than the currently
			// being added element (remove
			// useless elements)
			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();

			// Add current element at the rear of Qi
			Qi.addLast(i);
		}

		// Print the maximum element of last window
		result.add(arr[Qi.peek()]);

		return result;

	}

}
