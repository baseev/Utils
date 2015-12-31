package com.baseev.coding.interview.linked_list;

public class ReverseLinkedList
{

    public static void reverse(Node node) {
        Node prev = null;
        Node current =node;
        Node next;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
