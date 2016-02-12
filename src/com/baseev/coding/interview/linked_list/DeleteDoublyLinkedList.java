package com.baseev.coding.interview.linked_list;

public class DeleteDoublyLinkedList {

	public static void deleteNode(Node head, Node del){
		if(head == null || del == null) {
			return;
		}
		
		if(head == del) {
			head = head.next;
		}
		
		if(head.next != null) {
			head.next.prev = head.prev;
		}
		
		if(head.prev != null) {
			head.prev.next = head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
