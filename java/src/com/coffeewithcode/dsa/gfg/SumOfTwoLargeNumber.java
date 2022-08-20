package com.coffeewithcode.dsa.gfg;

public class SumOfTwoLargeNumber {
public static void main(String[] args) {
	String X = "25", Y = "23";
	System.out.println(findSum(X, Y));
}
public static String findSum(String f, String s) {
    // code here
    int l=0;
    for(int i=0;i<f.length();i++){
        if(f.charAt(i)=='0') l++;
        else break;
    }
    f=f.substring(l,f.length());
    l=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0') l++;
        else break;
    }
    s=s.substring(l,s.length());
        
    StringBuffer sb=new StringBuffer();
    int a=f.length()-1,b=s.length()-1,carry=0;
    while(a>=0 || b>=0 || carry!=0){
        int sum=0;
        if(a!=-1){
            sum+=Character.getNumericValue(f.charAt(a));
            a--;
        }
        if(b!=-1){
            sum+=Character.getNumericValue(s.charAt(b));
            b--;
        }
        sum+=carry;
        carry=sum/10;
        sb.append(String.valueOf(sum%10));
    }
    return sb.length()==0?"0":(sb.reverse()).toString();
    
}
}
