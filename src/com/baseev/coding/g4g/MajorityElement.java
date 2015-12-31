package com.baseev.coding.g4g;

public class MajorityElement
{
    
    public static int getCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1, i;
        for(i = 1; i < size; i++)
        {
            System.out.println("maj_index="+maj_index+", a[maj_index]="+a[maj_index]+", a[i]="+a[i]+", count="+count);
            if(a[maj_index] == a[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4, 1};
        int mElement = MajorityElement.getCandidate(a, a.length);
        System.out.println(mElement);
    }

}
