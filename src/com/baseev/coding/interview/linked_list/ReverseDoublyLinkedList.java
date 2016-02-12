package com.baseev.coding.interview.linked_list;

public class ReverseDoublyLinkedList {

	public static void reverse(Node node) {
		Node temp = null;
		Node current = node;
		while(current != null) {
			temp = current.next;
			current.next = current.prev;
			current.prev = temp;
			current = current.prev;
		}
		
		if(temp!=null) {
			node = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
