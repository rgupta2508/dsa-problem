package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDetectCycleInADirectedGraph {
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

		ArrayList<Integer> list=bfsOfGraph(7, adj);
		for(Integer i:list) {
			System.out.println(i);
		}

	}

	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
		ArrayList <Integer> a= new ArrayList <Integer> ();
        boolean [] v = new boolean [V];
        Queue <Integer> q= new LinkedList <Integer>();
        q.add(0);
        while(q.size()!=0 ){
            int u = q.poll();
            if(v[u]) continue;
            v[u]= true;
            a.add(u);
            for(int k: adj.get(u)){
                q.add(k);
            }
        }
        return a ;
    }
   

}
