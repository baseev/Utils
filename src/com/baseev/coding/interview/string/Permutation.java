package com.baseev.coding.interview.string;

public class Permutation
{
    
    public static void permute(char a[], int l, int r) {
        if(l==r) {
            System.out.print(a);
        }
        else {
            for(int i=0; i<r; i++) {
                swap(a[l], a[i]);
                permute(a, l+1, r);
                swap(a[l], a[i]);
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
