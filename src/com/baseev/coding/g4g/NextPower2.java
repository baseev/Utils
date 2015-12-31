package com.baseev.coding.g4g;

public class NextPower2
{

    public static int getNextPower(int n) {
        int p=1;
        while(p<n) {
            p = p <<1;
        }
        return p;
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(NextPower2.getNextPower(32));
    }

}
