package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Stack;

public class GraphTopologicalSort {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	
	adj.add(0, new ArrayList<>());
	adj.add(1, new ArrayList<>());
	adj.add(2, new ArrayList<>());
	adj.add(3, new ArrayList<>());
	adj.get(0).add(1);
	adj.get(1).add(2);

	adj.get(2).add(3);

	adj.get(3).add(3);
	int[] result=topoSort(4, adj);
	for(int i:result) {
		System.out.println(i);
	}
	
	}
	
	static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
		boolean[] vis = new boolean[v];
		Stack<Integer> recStack = new Stack<>();
		for(int i=0;i<v;i++) {
			if(vis[i]!=true) {
				//System.out.println("==="+v);
				dfs(adj,i,recStack,vis);
			}
		}
		int result[]=new int[v];
		int i=0;
		while(!recStack.empty()) {
			result[i]=recStack.pop();
			i++;
		}
		return result;
    }

	private static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> recStack, boolean[] vis) {
		// TODO Auto-generated method stub
		//System.out.println(v);
		vis[v]=true;
		for(int item:adj.get(v)) {
			if(vis[item]==false) {
				dfs(adj,item,recStack,vis);
			}
		}
		recStack.push(v);
		
	}
	
	

}
