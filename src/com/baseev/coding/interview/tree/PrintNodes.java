package com.baseev.coding.interview.tree;

public class PrintNodes {

	public static void printNodes(Node root, int distance) {
		if(root == null) {
			return;
		}
		
		if(distance == 0) {
			System.out.println(root.data);
		} else {
			printNodes(root.left, distance-1);
			printNodes(root.right, distance-1);
		}		
	}
	
	public static void main(String[] args) {
		Node root = Node.getTree();
		int distance =1;
		PrintNodes.printNodes(root, distance);
	}
}
