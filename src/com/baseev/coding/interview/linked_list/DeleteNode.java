package com.baseev.coding.interview.linked_list;

public class DeleteNode
{

    public static Node delete(Node head, int d) {
        Node n = head;
        if(n.data == d) {
            return head.next;
        }
        
        while(n.next != null && n.next.data != d) {
        	n= n.next;
        }
        n.next = n.next.next;
        return head;
    }
   
    
    public static void main(String[] args) {
		Node node = Node.getNode(5);
		Node.print(node);
		System.out.println("\n\n\n");
		Node n = DeleteNode.delete(node, 50);
		Node.print(n);		
	}    
}
