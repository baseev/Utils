package com.baseev.coding.array;

public class TripletSum {

	public static void print(int arr[], int sum) {
		int n = arr.length, l=0, r=0;
		//Sort the array
		for(int i=2; i<n; i++) {
			l = i+1;
			r = n-1;
			while(l<r) {
				int currentSum = arr[i]+arr[l]+arr[r];
				if(currentSum==sum) {
					System.out.println(arr[i]+", "+arr[l]+", "+arr[r]);
				} else if(currentSum<sum) {
					l++;
				} else {
					r--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
