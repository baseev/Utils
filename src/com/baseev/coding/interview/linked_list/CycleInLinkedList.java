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
            	remove(slow, node);
                System.out.println("The linked list contains a cycle");
                return;
            }
        }
    }
    
    //Remove cycle from a linked list
    private static void remove(Node loopNode, Node head) {
    	Node ptr1 = head;
    	Node ptr2;
    	
    	while(true) {
    		ptr2 = loopNode;
    		while(ptr2.next != null && ptr2.next != ptr1) {
    			ptr2 = ptr2.next;
    		}
    		
    		if(ptr2.next == ptr1) {
    			break;
    		}
    		ptr2 = ptr2.next;
    	}
    	ptr2.next =null;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
