package com.baseev.coding.interview.linked_list;

public class ReverseLinkedList
{

    public static Node reverse(Node node) {
        Node current = node;
    	Node prev = null;
        Node next;
        
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Node node = Node.getNode(5);
        Node.print(node);
        Node n = ReverseLinkedList.reverse(node);
        System.out.println("\n\n");
        Node.print(n);
    }

}
