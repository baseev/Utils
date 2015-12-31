package com.baseev.coding.g4g;

public class ReverseNumber
{
    
    public static int getReverse(int n) {
        int reverse = 0;
        while(n>0) {
            reverse = reverse*10+n%10;
            n = n/10;
        }
        return reverse;
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int r = ReverseNumber.getReverse(2987);
        System.out.println(r);
    }

}
