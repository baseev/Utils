package com.baseev.coding.interview.linked_list;

public class AlternateSplit {

	public static Node a = null;
	public static Node b = null;
	
	public static void split(Node head) {
		while(head != null) {
			a=create(a, head.data);
			if(head.next != null) {
				b=create(b, head.next.data);
				head =head.next.next;
				continue;
			}			
			head = head.next;
		}
	}
	
	private static Node create(Node head, int data) {
		if(head == null) {
			head = new Node(data);
			return head;
		}
		Node ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = new Node(data);
		return head;
	}
	
	
	public static void main(String[] args) {
		Node node = Node.getNode(5);
		Node.print(node);
		AlternateSplit.split(node);
		System.out.println("\n\n a = ");
		Node.print(AlternateSplit.a);
		System.out.println("\n\n b = ");
		Node.print(AlternateSplit.b);		
	}

}
