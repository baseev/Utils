package com.baseev.coding.interview.tree;

public class InOrderSuccessor {

	public static Node<Integer> getInOrderSuccessor(Node<Integer> root, Node<Integer> node) {
		if(node.right != null) {
			return getMin(node.right);
		}
		
		Node<Integer> successor = null;
		while(root != null) {
			if(node.data < root.data) {
				successor = root;
				root = root.left;
			} else if(node.data > root.data) {
				root = root.right;
			}
			break;
		}
		return successor;		
	}
	
	private static Node<Integer> getMin(Node<Integer> node) {
		Node<Integer> current = node;
		while(node != null) {
			node = node.left;
		}
		return node;
	}
	
	
	/**
	 * Set inorder successor with the node
	 * @param node
	 */
	public static void successor(Node<Integer> node) {
		Node<Integer> next = null;
		while(node!=null) {
			successor(node.right);
			node.next = next;
			next = node;
			successor(node.left);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
