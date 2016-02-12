package com.baseev.coding.interview.linked_list;


public class InsertCircularLInkedList {

	public static void insert(Node root, Node newNode) {
		Node current = root;
		
		if(current == null) {
			newNode.next = newNode;
			root = newNode;
		}
		
		if(newNode.data < current.data) {
			while(current.next != root) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = root;
			root = newNode;
		} else {
			while(current.next != null && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
