package com.baseev.coding.interview.util;

public class RemoveChars
{

    public static String removeChars(String str, String remove)
    {
        char[] s = str.toCharArray();
        char[] r = remove.toCharArray();
        boolean[] flags = new boolean[128]; // assumes ASCII!
        int len = s.length;
        int src, dst;
        // Set flags for characters to be removed
        for (src = 0; src < r.length; ++src) {
            flags[r[src]] = true;
        }

        src = 0;
        dst = 0;
        // Now loop through all the characters,
        // copying only if they aren’t flagged
        while (src < len) {
            if (!flags[(int) s[src]]) {
                s[dst++] = s[src];
            }
            ++src;
        }
        return new String(s, 0, dst);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String s = RemoveChars.removeChars("india", "ai");
        System.out.println(s);
    }

}
