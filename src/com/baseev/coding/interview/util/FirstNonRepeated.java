package com.baseev.coding.interview.util;

import java.util.Hashtable;

public class FirstNonRepeated
{

    public static Character firstNonRepeated(String str)
    {
        Hashtable<Character, Integer> charHash = new Hashtable<Character, Integer>();
        int i, length;
        Character c;
        Integer intgr;
        length = str.length();
        // Scan str, building hash table
        for (i = 0; i < length; i++) {
            c = new Character(str.charAt(i));
            intgr = (Integer) charHash.get(c);
            if (intgr == null) {
                charHash.put(c, new Integer(1));
            } else {
                // Increment count corresponding to c
                charHash.put(c, new Integer(intgr.intValue() + 1));
            }
        }
        System.out.println(charHash);
        // Search hashtable in order of str
        for (i = 0; i < length; i++) {
            c = new Character(str.charAt(i));
            if (((Integer) charHash.get(c)).intValue() > 1)
                return c;
        }
        return null;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Character c = FirstNonRepeated.firstNonRepeated("india");
        System.out.println(c);
    }

}
