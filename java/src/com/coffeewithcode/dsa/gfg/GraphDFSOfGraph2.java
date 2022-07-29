package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class GraphDFSOfGraph2 {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

	public static void main(String[] args) {
		adj.add(0, new ArrayList<>());
		adj.add(1, new ArrayList<>());
		adj.add(2, new ArrayList<>());
		adj.add(3, new ArrayList<>());
		adj.add(4, new ArrayList<>());
		adj.add(5, new ArrayList<>());
		adj.add(6, new ArrayList<>());

		adj.get(4).add(0);
		adj.get(5).add(3);
		adj.get(3).add(0);
		adj.get(1).add(2);

		adj.get(2).add(4);

		adj.get(6).add(0);

		// adj.get(3).add(3);

		System.out.println(dfsOfGraph(7, adj));

	}

	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		// Code here
		ArrayList<Integer> ans = new ArrayList<>();
		boolean visited[] = new boolean[V];

		dfs(0, adj, visited, ans);
		return ans;
	}

	public static void dfs(int u, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans) {
		visited[u] = true;
		ans.add(u);

		for (int i : adj.get(u)) {
			if (!visited[i]) {
				dfs(i, adj, visited, ans);
			}
		}
	}

}
