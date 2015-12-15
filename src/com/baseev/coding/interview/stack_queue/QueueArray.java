package com.baseev.coding.interview.stack_queue;

import java.util.Arrays;

public class QueueArray<E>
{
    private int size = 0;
    private int DEFALUT_CAPACITY = 10;
    private int rearPointer = -1;
    private int frontPointer = -1;
    private Object elements[];
    
    public QueueArray() {
        elements = new Object[DEFALUT_CAPACITY];
    }
    
    public void push(E element) {
        if(size==elements.length) {
            ensureCapacity();
        }
        frontPointer++;
        elements[frontPointer] = element;
        size++;
        if(rearPointer == -1) {
            rearPointer = frontPointer;
        }
    }
    
    public E pop() {
        if(size==0) return null;
        E element = (E) elements[rearPointer];
        elements[rearPointer] = null;
        rearPointer++;
        size--;
        if(size==0) {
            rearPointer = -1;
            frontPointer = -1;
        }
        return element;
    }
    
    public E peek() {
        if(size==0) return null;
        return (E) elements[rearPointer];
    }
    
    public int size() {
        return size;
    }
    
    private void ensureCapacity() {
        int newSize = size * DEFALUT_CAPACITY;
        elements = Arrays.copyOf(elements, newSize);
    }
    
    public void print() {
        System.out.println("[");
        for(int i=rearPointer; i<=frontPointer; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("]");
    }
    
    public static void main(String args[]) {
        QueueArray<Integer> q= new QueueArray<Integer>();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.push(60);
        q.push(70);
        
        System.out.println("After push");
        q.print();        
        
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        
        System.out.println("After pop");
        q.print();
        
        q.push(80);
        q.push(90);
        
        System.out.println("After again push");
        q.print();
    }
}
