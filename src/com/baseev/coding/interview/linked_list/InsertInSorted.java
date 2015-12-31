package com.baseev.coding.interview.linked_list;

public class InsertInSorted
{

    public static Node insert(Node head, Node newNode) {
        if(head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            while(head.next != null && head.next.data <= newNode.data) {
                head = head.next;
            }
            newNode.next = head.next;
            head.next = newNode;            
        }
        return head;
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
