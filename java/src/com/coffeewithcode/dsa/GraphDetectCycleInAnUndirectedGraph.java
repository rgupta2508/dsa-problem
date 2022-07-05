package com.coffeewithcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphDetectCycleInAnUndirectedGraph {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(0);a2.add(2);a2.add(4);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(1);a3.add(3);
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(2);a4.add(4);
		ArrayList<Integer> a5=new ArrayList<Integer>();
		a5.add(1);a5.add(3);
		
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		adj.add(a);
		adj.add(a2);
		adj.add(a3);
		adj.add(a4);
		adj.add(a5);


		System.out.println(isCycle(5,adj));
	}
	
	public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		 boolean vis[]=new boolean[v+1];
	      Arrays.fill(vis,false);
	      for(int i=0;i<v;i++)
	      {
	          if(vis[i]==false)
	          {
	              if(BFS(i,-1,vis,adj))
	              {
	                  return true;
	              }
	          }
	      }
	      return false;
	  }
		

	   public static boolean BFS(int node,int par,boolean vis[],ArrayList<ArrayList<Integer>>adj)
	   {
	       vis[node]=true;
	       
	       for(Integer it:adj.get(node))
	       {
	           if(vis[it]==false)
	           {
	               if(BFS(it,node,vis,adj)==true)
	               {
	                   return true;
	               }
	           }
	           else if(it!=par && vis[it]==true)
	           {
	               return true;
	           }
	       }
	       return false;
	   }
}
