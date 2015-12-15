package com.baseev.coding.interview.stack_queue;

import java.util.ArrayList;

public class StackList<E> extends ArrayList<E>
{
    public void push(E e)
    {
        add(e);
    }

    public E pop()
    {
        E e = get(size() - 1);
        remove(size() - 1);
        return e;
    }
}
