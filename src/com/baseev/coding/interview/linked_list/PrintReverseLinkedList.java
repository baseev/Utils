package com.baseev.coding.interview.linked_list;

public class PrintReverseLinkedList {

	public static void printReverse(Node node) {
		if(node == null) return;
		printReverse(node.next);
		System.out.println(node.data);
	}
	
	public static void print(Node node) {
		if(node == null) return;
		System.out.println(node.data);
		printReverse(node.next);
	}
	
	public static void main(String[] args) {
		Node node = Node.getNode(5);
		PrintReverseLinkedList.print(node);
		System.out.println("\n\n");
		PrintReverseLinkedList.printReverse(node);
	}

}
