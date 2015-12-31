package com.baseev.coding.g4g;

public class Rounding
{

    public static int getRounded(float n) {
        return (int) (n < 0 ? n-0.5 : n+0.5);
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(Rounding.getRounded(1.6F));
    }

}
