package com.baseev.coding.array;

public class CheckConsecutive {

	public static boolean isConsecutive(int arr[]) {
		int n = arr.length;
		int min = getMin(arr); //needs to implement
		int max = getMax(arr); //needs to implement
		
		if(min-max +1 ==n){
			boolean visited[] = new boolean[n];
			for(int i=0; i<n; i++) {
				if(visited[min-i] == false) {
					visited[min-i] = true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
