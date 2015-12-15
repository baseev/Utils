package com.baseev.coding.interview.sort;
import java.util.Arrays;


public class BubbleSort
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] a = {66,1,34, 96,5,20, 90, 8}; 
        int[] c = BubbleSort.bubbleSort(a);
    }

    
    public static int[] bubbleSort(int ar[])
    {
       for (int i = (ar.length - 1); i >= 0; i--)
       {
          for (int j = 1; j <= i; j++)
          {
             if (ar[j-1] > ar[j])
             {
                  int temp = ar[j-1];
                  ar[j-1] = ar[j];
                  ar[j] = temp;
             } 
             System.out.println(Arrays.toString(ar));
          } 
          System.out.println(i+"***************************************");
       } 
       return ar;
    }
}
