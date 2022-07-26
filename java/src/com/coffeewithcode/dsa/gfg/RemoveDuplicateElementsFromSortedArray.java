package com.coffeewithcode.dsa.gfg;

public class RemoveDuplicateElementsFromSortedArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,3,4,4,5,5,6,6,7,8,9};
	System.out.println("total element after remove duplicte======"+removeDuplicate(arr, arr.length));
	for(int i:arr) {
		System.out.println(i);
	}
	
}
static int removeDuplicate(int a[],int n){
    // code here
      if(n == 0)
   {
       return 0;
   }
   int i = 0;
   for(int j = 1;j<n;j++)
   {
       if(a[j] != a[i])
       i++;
       a[i] = a[j];
   }
   return i+1;
}
}
