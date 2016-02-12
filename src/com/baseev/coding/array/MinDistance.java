package com.baseev.coding.array;

public class MinDistance {

	public static int minDist(int arr[], int n, int x, int y) {
		int i, j;
		int min_dist = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((x == arr[i] && y == arr[j] || y == arr[i] && x == arr[j]) && min_dist > Math.abs(i - j)) {
					System.out.println("i="+i+", j="+j+", arr[i]="+arr[i]+", arr[j]="+arr[j]);
					min_dist = Math.abs(i - j);
				}
			}
		}
		return min_dist;
	}

	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 8, 3};
	    int n = arr.length;
	    int x = 4;
	    int y = 8;
	 
	    System.out.println(MinDistance.minDist(arr, n, x, y));
	}

}
