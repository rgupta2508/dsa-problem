package com.coffeewithcode.dsa.gfg;

public class LongestPalindromeInAString {
	public static void main(String[] args) {
		String S = "aaaabbaa";
		LongestPalindromeInAString a=new LongestPalindromeInAString();
		System.out.println(a.longestPalin(S));
	}
	
	String longestPalin (String S) {
        // code here
        //int length1= Integer.MIN_VALUE; 
           String ans="";
       for(int i=0;i<S.length();i++)
       {
           int start = i-1;
           int end = i+1;
          
           
           while(start>=0 && end<=S.length()-1)
           {
               if(S.charAt(start) == S.charAt(end))
                {
                    start--;
                    end++;
                }else break;
           }
           
           int l1 = (end-start)-1;
           if(l1>ans.length())
           {
               ans = S.substring(start+1,start+1+l1);
           }
           
           start = i-1;
           end = i;
            
           while(start>=0 && end<=S.length()-1)
           {
               if(S.charAt(start) == S.charAt(end))
                {
                    start--;
                    end++;
                } else break;
           }
           
           int l2 = (end-start)-1;
           if(l2>ans.length())
           {
               ans = S.substring(start+1,start+1+l2);
           }
       }
       
       return ans;
	}
}

