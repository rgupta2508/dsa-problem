package com.coffeewithcode.dsa.gfg;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import com.coffeewithcode.dsa.gfg.PrintBurningTreeInOrder.Node;

// Java program to find minimum time required
// to burn the binary tree completely


public class TreeBurningTreeInTimeFromLeafNode {

	
	static Map<Node,Node> parent=new HashMap<>();
    public static Node createMapping(Node root,int target){
        Node targetNode=null;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        parent.put(root,null);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node temp=q.remove();
                if(temp.val==target){
                    targetNode=temp;
                }
                if(temp.left!=null){
                    parent.put(temp.left,temp);
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    parent.put(temp.right,temp);
                    q.add(temp.right);
                }
            }
        }
        return targetNode;
    }
    public static int helper(Node targetNode){
        int ans=0;
        Map<Node,Boolean> vis=new HashMap<>();
        Queue<Node> q=new ArrayDeque<>();
        q.add(targetNode);
        vis.put(targetNode,true);
        while(!q.isEmpty()){
            int n=q.size();
            boolean flag=false;
            for(int i=0;i<n;i++){
                Node temp=q.remove();
                if(temp.left!=null && !vis.containsKey(temp.left)){
                    flag=true;
                    q.add(temp.left);
                    vis.put(temp.left,true);
                }
                if(temp.right!=null && !vis.containsKey(temp.right)){
                    flag=true;
                    q.add(temp.right);
                    vis.put(temp.right,true);
                }
                if(parent.get(temp)!=null && !vis.containsKey(parent.get(temp))){
                    flag=true;
                    q.add(parent.get(temp));
                    vis.put(parent.get(temp),true);
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Node targetNode=createMapping(root,target);
        int ans=helper(targetNode);
        return ans;
    }
	

	// Driver Code
	public static void main(String args[])
	{

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left.left = new Node(8);
		root.left.right.left = new Node(9);
		root.left.right.right = new Node(10);
		root.left.right.left.left = new Node(11);

		int target = 11;

		//res = 0;
		int res=minTime(root,  target);
		System.out.println(res);
	}
}
