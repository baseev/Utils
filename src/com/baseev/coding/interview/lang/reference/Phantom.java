package com.baseev.coding.interview.lang.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Phantom
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ReferenceQueue refQueue = new ReferenceQueue(); //reference will be stored in this queue for cleanup
        //Read more: http://javarevisited.blogspot.com/2014/03/difference-between-weakreference-vs-softreference-phantom-strong-reference-java.html#ixzz3rHoA8TVA

        Integer digit = new Integer(22); // digit reference variable has strong reference - line 3
        PhantomReference<Integer> phantom = new PhantomReference<Integer>(digit, refQueue); // phantom reference to object created at line 3

        digit = null;
        //Read more: http://javarevisited.blogspot.com/2014/03/difference-between-weakreference-vs-softreference-phantom-strong-reference-java.html#ixzz3rHmxFKq6
    }

}
