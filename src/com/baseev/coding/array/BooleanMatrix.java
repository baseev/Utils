package com.baseev.coding.array;

public class BooleanMatrix {

	public static int[][] changeMatrix(int matrix[][]) {
		int n = matrix.length;
		int m = matrix[0].length;
		int a[] = new int[n];
		int b[] = new int[m];
	
		for(int i=0; i<n;i++) {
			a[i] = 0;
		}
				
		for(int i=0; i<n;i++) {
			b[i] = 0;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] == 1) {
					a[i] = 1;
					b[j] = 1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i] == 1 ||	b[j] == 1) {
					matrix[i][j] = 1;
				}
			}
		}
		
		return matrix;
	}
	
	public static void printMatrix(int matrix[][]) {
		int n = matrix.length;
		int m = matrix[0].length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");
		}
	}	
	
	
	public static void main(String[] args) {
		int matrix[][] = {
								{0, 1, 0},
								{0, 0, 0}
							};
		BooleanMatrix.printMatrix(matrix);
		System.out.println("\n\n\n\n");
		BooleanMatrix.printMatrix(BooleanMatrix.changeMatrix(matrix));
	}
}
