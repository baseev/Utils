package com.baseev.coding.g4g;

public class PowerSet
{

    public static void printPowerSet(char characters[]) {
        int setSize = characters.length;
        int powSetSize = pow(2, setSize);
        for(int i=0;i<powSetSize;i++) {
            for(int j=0;j<setSize;j++) {
                if((i & (1<<j)) == 0) {
                    System.out.print(characters[j]);
                }
            }
            System.out.println("");
        }
    }
    
    private static int pow(int x, int y) {
        if(y==0) {
            return 1;
        }
        return x*pow(x, y-1);
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        char a[] = {'a', 'b', 'c'};
        PowerSet.printPowerSet(a);
    }

}
