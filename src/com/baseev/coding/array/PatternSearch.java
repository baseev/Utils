package com.baseev.coding.array;

public class PatternSearch {

	public static void search(char text[], char pattern[]) {
		int m = pattern.length;
		int n = text.length;
		
		for(int i=0; i<=n; i++) {
			int j;
			for(j=0; j<=m; j++) {
				if(text[i+j] != pattern[j]) {
					break;
				}
			}
			if(j==m) {
				System.out.println("pattern found at "+j);
			}
		}
	}
	
	void search1(char pat[], char txt[])
	{
	    int M = pat.length;
	    int N = txt.length;
	    int i = 0;
	 
	    while (i <= N - M)
	    {
	        int j;
	 
	        /* For current index i, check for pattern match */
	        for (j = 0; j < M; j++)
	            if (txt[i+j] != pat[j])
	                break;
	 
	        if (j == M)  // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	        {
	           System.out.println("Pattern found at index "+i);
	           i = i + M;
	        }
	        else if (j == 0)
	           i = i + 1;
	        else
	           i = i + j; // slide the pattern by j
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
