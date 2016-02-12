package com.baseev.coding.array;

public class PrintSequence {
	
	public static void printRecursive(int num, int pos, int k, int n) {
		if(pos==k) {
			System.out.println(num);
			return;
		}
		for(int i=1; i<=n; i++) {
			//System.out.println(num+" :: "+(num*10+i)+" :: "+i);
			//System.out.println(num*10+i);
			printRecursive(num*10+i, pos+1, k, n);
		}
	}
	
	public static void printSequence(int k, int n) {
		printRecursive(0, 0, k, n);
	}
	

	public static void main(String[] args) {
		int k=3;
		int n=4;
		PrintSequence.printSequence(k, n);
	}
}
