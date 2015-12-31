package com.baseev.coding.g4g;

public class Pow
{

    public static int calculatePower(int x, int y) {
        if(y==0) {
            return 1;
        }
        return x*calculatePower(x, y-1);
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(calculatePower(3, 3));
    }

}
