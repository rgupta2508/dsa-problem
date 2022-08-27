package com.coffeewithcode.dsa.gfg;

import java.util.LinkedList;
import java.util.Queue;

public class AlternatePositiveAndNegativeNumbers {
	public static void main(String[] args) {
		int N = 9;
			 int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
			 AlternatePositiveAndNegativeNumbers a=new AlternatePositiveAndNegativeNumbers();
			 a.rearrange(Arr, N);
			 for(int i:Arr) {
				 System.out.println(i);
			 }
	}
	void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> q1 = new LinkedList<>();
       Queue<Integer> q2 = new LinkedList<>();
       for(int i = 0; i < n ; i++){
           if(arr[i] >= 0){
               q1.add(arr[i]);
           }
           else{
               q2.add(arr[i]);
           }
       }
       int j = 0;
       while(j < n){
           if(!q1.isEmpty()){
               arr[j++] = q1.poll();
           }
           if(!q2.isEmpty()){
               arr[j++] = q2.poll();
           }
           
       }
    }

}
