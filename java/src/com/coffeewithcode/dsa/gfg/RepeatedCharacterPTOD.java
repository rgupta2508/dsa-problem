package com.coffeewithcode.dsa.gfg;

public class RepeatedCharacterPTOD {
public static void main(String[] args) {
	
	System.out.println(firstRep("geeksfor geeks"));
}
public static  char firstRep(String S)
{
    // your code here
    for(int i=0;i<S.length();i++){
       String temp = S.substring(i+1,S.length());
       if(temp.indexOf(S.charAt(i))> -1){
           return S.charAt(i);
       }
   }
   return '#';
}
}
