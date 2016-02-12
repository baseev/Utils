package com.baseev.coding.interview.tree;

public class FoldableTree {

	public static boolean isFoldable(Node tree) {
		if(tree == null) {
			return true;
		}
		boolean status = false;
		mirror(tree.left);
		status = isStructSame(tree.left, tree.right);
		return status;
	}
	
	
	private static boolean isStructSame(Node left, Node right) {
		if(left == null && right == null) {
			return true;
		}
		
		if((left != null && right != null) && isStructSame(left.left, left.right) && isStructSame(right.left, right.right)) {
			return true;
		}
		
		return false;
	}
	
	private static void mirror(Node node) {
		if(node == null) {
			return;
		}
		
		mirror(node.left);
		mirror(node.right);
		
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;	
	}
	
	public static void main(String[] args) {
		
	}

}
