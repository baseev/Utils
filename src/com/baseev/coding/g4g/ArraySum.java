package com.baseev.coding.g4g;

public class ArraySum
{

    public static void printSumNumbers(int a[], int sum) {
        boolean map[] = new boolean[a.length];
        for(int i=0; i<a.length;i++) {
            int temp = sum - a[i];
            if(temp>0 && map[temp]) {
                System.out.println(sum+"="+temp+"+"+a[i]);
            }
            map[a[i]] = true;
        }
    }
    
    public static void printDiffNumbers(int a[], int diff) {
        boolean map[] = new boolean[a.length];
        for(int i=0; i<a.length;i++) {
            int temp = diff + a[i];
            if(temp>0 && map[temp]) {
                System.out.println(diff+"="+temp+"-"+a[i]);
            }
            map[a[i]] = true;
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
