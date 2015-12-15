package com.baseev.coding.interview.lang.reference;

import java.lang.ref.SoftReference;

public class Soft
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Integer prime = new Integer(5);  // prime holds a strong reference - line 2
        SoftReference<Integer> soft = new SoftReference<Integer>(prime) ; //soft reference variable has SoftReference to Counter Object created at line 2
        prime = null;  // now Counter object is eligible for garbage collection but only be collected when JVM absolutely needs memory
        //Read more: http://javarevisited.blogspot.com/2014/03/difference-between-weakreference-vs-softreference-phantom-strong-reference-java.html#ixzz3rHmLRbb6
    }

}
