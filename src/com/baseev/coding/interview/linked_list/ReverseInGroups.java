package com.baseev.coding.interview.linked_list;

public class ReverseInGroups {

	public static Node reverse(Node head, int k) {
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		
		while(current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;			
		}
		
		if(next != null) {
			head.next = reverse(next, k);
		}
		return prev;				
	}
	
	public static void main(String[] args) {
		Node node = Node.getNode(5);
		//Node.print(node);
		Node n = ReverseInGroups.reverse(node, 3);
		Node.print(n);
	}

}
