package com.baseev.coding.interview.lang.reference;

import java.lang.ref.WeakReference;

public class Weak
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Integer counter = new Integer(10); // strong reference - line 1
        WeakReference<Integer> weakCounter = new WeakReference<Integer>(counter); //weak reference
        counter = null; // now Counter object is eligible for garbage collection
        //Read more: http://javarevisited.blogspot.com/2014/03/difference-between-weakreference-vs-softreference-phantom-strong-reference-java.html#ixzz3rHlggQDe
    }

}
