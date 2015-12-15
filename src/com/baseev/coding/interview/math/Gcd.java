package com.baseev.coding.interview.math;

public class Gcd
{
    public int finGCD(int a, int b) {
        if(b==0) {
            return a;
        }
        return finGCD(b, a%b);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Gcd gcd = new Gcd();
        int g = gcd.finGCD(4, 16);
        System.out.println(g);
    }

}
