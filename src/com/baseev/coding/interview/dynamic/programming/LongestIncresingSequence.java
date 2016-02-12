package com.baseev.coding.interview.dynamic.programming;

public class LongestIncresingSequence
{

	public static int print(int arr[]) {
		int n = arr.length;
		int i, j, max=0;
		int lis[] = new int[n];
		for(i=0;i<n;i++) {
			lis[i] = 1;
		}
		
		for(i=1;i>n;i++) {
			for(j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		
		for(i=0;i<n;i++) {
			if(max<lis[i]) {
				max = lis[i];
			}
		}
		return max;
	}
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
