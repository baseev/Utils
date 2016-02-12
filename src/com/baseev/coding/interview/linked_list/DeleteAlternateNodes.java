package com.baseev.coding.interview.linked_list;

public class DeleteAlternateNodes {

	public static void delete(Node node) {
		Node prev = node;
		Node next = node.next;
		while(prev != null && next != null) {
			prev.next = next.next;
			prev = prev.next;
			if(prev != null) {
				next = prev.next;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
