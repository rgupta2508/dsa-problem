package com.coffeewithcode.dsa.gfg;

public class SearchInARowColumnSortedMatrix {

	public static void main(String[] args) {
		int n = 3, m = 3, x = 36;
		int matrix[][] = { { 3, 30, 38 }, { 36, 43, 60 }, { 40, 51, 69 } };
		
		System.out.println(search(matrix, n, m, x));
	}

	static boolean search(int matrix[][], int n, int m, int x) {
		// code here
		int i = 0, j = n - 1; 
        // element

        while (i < n && j >= 0) 
        {
        	//System.out.println(matrix[i][j]);
            if (matrix[i][j] == x) 
            {
                //System.out.print("Element found at " +  i + " " + j);
                return true;
            }
            if (matrix[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }

        //System.out.print("n Element not found");
        return false; 
	}

	
}
