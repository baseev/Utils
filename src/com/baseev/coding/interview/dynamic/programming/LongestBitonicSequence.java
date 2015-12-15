package com.baseev.coding.interview.dynamic.programming;

import java.util.Arrays;

public class LongestBitonicSequence
{

    int lbs(int arr[], int n)
    {
        int i, j;

        /*
         * Allocate memory for LIS[] and initialize LIS values as 1 for all
         * indexes
         */
        int[] lis = new int[n];
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
        
        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    System.out.println("i="+i+", lis["+i+"]="+lis[i]+", arr["+i+"]="+arr[i]);
                }
            }
        }
        
        System.out.println(Arrays.toString(lis));

        /*
         * Allocate memory for lds and initialize LDS values for all indexes
         */
        int[] lds = new int[n];
        for (i = 0; i < n; i++) {
            lds[i] = 1;
        }

        /* Compute LDS values from right to left */
        for (i = n - 2; i >= 0; i--) {
            for (j = n - 1; j > i; j--) {
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1) {
                    lds[i] = lds[j] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(lds));
        System.out.println(Arrays.toString(lis));
        
        /* Return the maximum value of lis[i] + lds[i] - 1 */
        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++) {
            if (lis[i] + lds[i] - 1 > max) {
                max = lis[i] + lds[i] - 1;
                System.out.println("i="+i+", lis["+i+"]="+lis[i]+", lds["+i+"]="+lds[i]);
            }
        }
        return max;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int arr[] = { 12, 11, 40, 5, 3, 1 };

        LongestBitonicSequence lbs = new LongestBitonicSequence();

        int n = lbs.lbs(arr, arr.length);

        System.out.println(n);

        // TODO Auto-generated method stub

    }

}
