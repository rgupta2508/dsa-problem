package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix {
	public static void main(String[] args) {
		int r = 4, c = 4;
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ArrayList<Integer> list = spirallyTraverse(matrix, r, c);
		for (int i : list) {
			System.out.println(i);
		}
	}

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {

		int top = 0;
		int bottom = r - 1;
		int left = 0;
		int right = c - 1;
		int direction = 0;
		ArrayList<Integer> result = new ArrayList<>();

		while (top <= bottom && left <= right) {

			if (direction == 0) {
				for (int i = left; i <= right; i++) {
					result.add(matrix[top][i]);
				}
				top++;
			} else if (direction == 1) {
				for (int i = top; i <= bottom; i++) {
					result.add(matrix[i][right]);
				}
				right--;
			} else if (direction == 2) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			} else if (direction == 3) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}

			direction = (direction + 1) % 4;
		}

		return result;

	}

}
