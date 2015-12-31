package com.baseev.coding.g4g;

public class MissingNumber
{
    public static int getMissingNumber(int a[], int n) {
        int total = (n+1)*(n+2)/2;
        for(int i=0; i<n; i++) {
            total -= a[i];
        }
        return total;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4, 5};
        int missingNumber = MissingNumber.getMissingNumber(a, a.length);
        System.out.println("missingNumber : "+missingNumber);
    }

}
