package com.coffeewithcode.dsa.gfg;

public class PowerOf2 {
	
	public static void main(String[] args) {
		System.out.println("is power of 2=="+isPowerofTwo(99));
	}

	public static boolean isPowerofTwo(long n){
        
        if(n==0){
           return false;
       }
       while(n!=1){
           if(n%2!=0){
               return false;
           }
           else{
          n = n/2;
       }
      
   }
       return true;

	}
}
       

