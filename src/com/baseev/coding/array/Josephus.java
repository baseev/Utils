package com.baseev.coding.array;

public class Josephus {

	public static int getJosephus(int n, int k){
		if(n==1) {
			return 1;
		}
		return (getJosephus(n-1, k)+ k-1) %n+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
