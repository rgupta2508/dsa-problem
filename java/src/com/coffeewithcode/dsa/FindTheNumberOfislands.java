package com.coffeewithcode.dsa;

public class FindTheNumberOfislands {
	public static void main(String[] args) {
		
		char[][] grid= {{'0','1','1','1','0','0','0'},{'0','0','1','1','0','1','0'}};
		FindTheNumberOfislands a=new FindTheNumberOfislands();
		System.out.println(a.numIsLand(grid));
	}
	public int numIsLand(char[][] grid) {
        int count = 0;
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                if(grid[i][j] == '1') {
                    count ++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    void dfs(char[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if(i < 0 || j < 0 || i >= n || j >= m) {
            return;
        }
        if(grid[i][j] == '0') { 
            return;
        }
        grid[i][j] = '0';           // Mark as visited;
        dfs(grid, i - 1, j);        // north
        dfs(grid, i - 1, j - 1);    // north - west
        dfs(grid, i - 1, j + 1);    // north - east
        dfs(grid, i, j - 1);        // west
        dfs(grid, i, j + 1);        // east
        dfs(grid, i + 1, j - 1);    // south - west
        dfs(grid, i + 1, j + 1);    // south - east
        dfs(grid, i + 1, j);        // south
    }

}
