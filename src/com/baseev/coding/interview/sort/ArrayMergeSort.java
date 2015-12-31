package com.baseev.coding.interview.sort;

public class ArrayMergeSort
{
    
    /**
     * 
     * @param a
     * @param b
     * @return
     */
    /*
    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) 
        {
            answer[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }
        return answer;
    }
    */
    
    public static int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                answer[k] = a[i];
                i++;
            }
            else
            {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length)
        {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            answer[k] = b[j];
            j++;
            k++;
        }

        return answer;
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] a = {1,4,6,9,78}; 
        int[] b = {2,4,5,6,7};
        
        int c[] = ArrayMergeSort.merge(a, b);
        
        for(int i=0; i< c.length;i++) {
            System.out.println(c[i]);
        }
    }

}
