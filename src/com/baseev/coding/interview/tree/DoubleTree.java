package com.baseev.coding.interview.tree;

public class DoubleTree {

	
	public static void doubleTree(Node tree) {
		if(tree == null) {
			return;
		}
		
		doubleTree(tree.left);
		doubleTree(tree.right);
		
		Node oldLeft = tree.left;
		tree.left = new Node(tree.data);
		tree.left.left = oldLeft;
	}	
	
	public static void main(String[] args) {
		Node tree = Node.getTree();
		
		Node.printInOrder(tree);
		doubleTree(tree);	
		System.out.println("\n\n");
		Node.printInOrder(tree);
	}

}
