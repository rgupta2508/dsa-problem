package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;

public class PrintAllSubsequencesOfaString {
	public static void main(String[] args) {
		String s="abc";
	getAllSubSequences(s,"",0);	
	for(String str:res) {
		System.out.println(str);
	}
	}

	public static ArrayList<String> res=new ArrayList<>();
	//static int i=0;
	static void getAllSubSequences(String s,String result,int i) {
		//i++;
		// TODO Auto-generated method stub
		if(s.length()==i) {
			res.add(result);
			return;
		}
		 // We add adding 1st character in string
		getAllSubSequences(s, result + s.charAt(i),i+1);
 
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
		getAllSubSequences(s, result,i+1);
		
	}

}
