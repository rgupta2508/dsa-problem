package com.coffeewithcode.dsa;

import java.util.HashMap;

/*if password= "good" . Then iterate over and find the distinct values:-
	g = 1,
	o = 1,
	o = 1,
	d = 1,
	go = 2,
	oo = 1,
	od = 2,
	goo = 2,
	ood = 2,
	good = 3
	
	and at the end add all here 16 is the password strength and return.
	
	Expected output = 16.
*/
public class PasswordStrength {
	
	
	public static void main(String[] args) {
		System.out.println("result===="+find("abc"));

	}
	public static int find(String password) {

		//map<char, int> mp;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		   //int n = password.length();
		   int tmp1;
		   int count = 1;
		   tmp1 = 1;
		   
		  // mp[s[0]]  1;

		   map.put(password.charAt(0), 1);
		   
		   for(int i = 1; i < password.length(); i++) {
		    if( map.get(password.charAt(i))==null) {
		    	tmp1 += 1 + i;
		    }else {
		   
		    	tmp1 += 1 + i - map.get(password.charAt(i));// mp[s[i]];
		    }
		       //mp[s[i]]
		       map.put(password.charAt(i), i + 1);
		       System.out.println("tmp==="+tmp1);
		       count += tmp1;
		       System.out.println("count==="+count);

		   }
		   
		   return count;
		}

}
