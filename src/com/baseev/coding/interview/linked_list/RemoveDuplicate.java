package com.baseev.coding.interview.linked_list;

import java.util.Hashtable;

public class RemoveDuplicate
{
    public static void removeDuplicate(Node node) {
        Hashtable table = new Hashtable();
        Node previous = null;
        while(node!=null) {
            if(table.contains(node.data)) {
                previous.next = node.next;
            } else {
                table.put(node.data, true);
                previous = node;
            }
            node = node.next;
        }
    }

    public static void removeDuplicateFromSorted(Node node) {
    	Node current = node;
    	Node _next;
    	while(current.next != null) {
    		if(current.data == current.next.data) {
    			_next = current.next.next;
    			current.next = _next;
    		} else {
    			current = current.next;
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
