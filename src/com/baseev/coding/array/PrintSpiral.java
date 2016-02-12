package com.baseev.coding.array;

public class PrintSpiral {

	public static void print(int arr[][]) {
		int m = 6;
		int n = 3;
		int i, k=0, l=0;
		
		while(k<m && l<n) {
			for(i=l;i<n;i++) {
				System.out.println(arr[k][i]);
			}
			k++;
			
			for (i = n; i < m; ++i)
	        {
				System.out.println(arr[i][n-1]);
	        }
	        n--;
			
	        if(k<m){
	        	for (i = n-1; i >= l; --i)
	            {
	        		System.out.println(arr[m-1][i]);
	            }
	            m--;
	        }
	        
	        if(l<n) {
	        	for (i = m-1; i >= k; --i)
	            {
	        		System.out.println(arr[i][l]);
	            }
	            l++;   
	        }
			
		}		
	}
	
	public static void main(String[] args) {
		int arr[][] = { 
						{1,  2,  3},
						{4,  5, 6},
						{7,  8,  9},
						{10, 11, 12},
						{13, 14, 15},
						{16, 17, 18}
		    		};
		PrintSpiral.print(arr);
	}
}
