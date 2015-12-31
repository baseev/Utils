package com.baseev.coding.interview.linked_list;


public class CycleInLinkedList
{

    public static void detectLopp(Node node) {
        Node slow = node;
        Node fast = node;
        
        while(slow != null && fast != null  && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                System.out.println("The linked list contains a cycle");
                return;
            }
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
