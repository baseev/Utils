package com.baseev.coding.interview.linked_list;

public class LastToFront {

	private static Node move(Node head) {
		Node last = head;
		Node secondLast = null;
		
		while(last.next !=null) {
			secondLast = last;
			last = last.next;
		}		
		secondLast.next = null;
		last.next = head;
		head = last;
		return head;
	}	
	
	public static void main(String[] args) {
		Node node = Node.getNode(5);
		Node.print(node);
		System.out.println("\n\n\n");		
		Node.print(LastToFront.move(node));		
	}
}
