package com.coffeewithcode.dsa.gfg;

public class CircularTour {
public static void main(String[] args) {
		int 	petrol[] = { 55 ,52 ,33 ,100};
		int 	distance[] = {77 ,61 ,40 ,69};
		System.out.println(tour(petrol,distance));
}

static int tour(int petrol[], int distance[])
{
// Your code here
	int currPetrol=0,start=0,prevPetrol=0;
	for(int i=0;i<petrol.length;i++) {
		currPetrol=currPetrol-distance[i]+petrol[i];
		if(currPetrol<0) {
			start=i+1;
			prevPetrol=prevPetrol+currPetrol;
			currPetrol=0;
		}
	}
	return (currPetrol+prevPetrol>=0)?start+1:-1;
}
}
