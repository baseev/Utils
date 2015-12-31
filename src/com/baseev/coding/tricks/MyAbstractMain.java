package com.baseev.coding.tricks;

import com.baseev.coding.tricks.data.MyAbstractSub;
import com.baseev.coding.tricks.data.MyAbstractSuper;

public class MyAbstractMain
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        MyAbstractSuper myAbstractSuper = new MyAbstractSuper() {};
        myAbstractSuper.print();
        System.out.println(myAbstractSuper instanceof MyAbstractSuper);
        
        MyAbstractSub myAbstractSub = new MyAbstractSub() {};
        myAbstractSub.print();
        System.out.println(myAbstractSub instanceof MyAbstractSuper);
    }

}
