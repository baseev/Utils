package com.baseev.coding.g4g;

public class LuckyNumber
{
    public static int counter = 2;
    
    public static int isLucky(int n) {
        int nextPosition = n;

        System.out.println(counter+" :: "+nextPosition);
        
        if(counter>n) {
            return 1;
        }
        
        if(n%counter == 0) {
            return 0;
        }
        System.out.println(nextPosition+"/"+counter+"="+nextPosition/counter);
        nextPosition -= nextPosition/counter;
        counter++;
        return isLucky(nextPosition);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int n =6;
        System.out.println(n+" = "+LuckyNumber.isLucky(n));

    }

}
