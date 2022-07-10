package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class GraphBFSOfGraph {
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

		System.out.println(isCyclic(7, adj));

	}

	public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
		// add your code here
		
	        int [] vis=new int[V];
	        int [] disvis=new int[V];
	        
	        for(int i=0;i<V;i++)
	        {
	           if(vis[i]==0)
	           {
	               if(dfs(adj,vis,disvis,i)==true)
	               return true;
	           }
	        }
	        return false;
	}

	public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,int [] disvis,int s) {
        vis[s]=1;
        disvis[s]=1;
        
        for(int it:adj.get(s))
        {
            if(vis[it]==0)
            {
                if(dfs(adj,vis,disvis,it)==true) return true;
            }
             else if(disvis[it]==1) return true;
        }
            disvis[s]=0;
            return false;
    }

}
