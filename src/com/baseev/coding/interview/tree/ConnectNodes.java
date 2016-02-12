package com.baseev.coding.interview.tree;
 
/**
 * Connect nodes at same level
 * @author Baseev
 *
 */
public class ConnectNodes {

	public static void connectNodes(Node<Integer> node) {
		if(node==null) {
			return;
		}
		
		if(node.left!=null) {
			node.left.nextRight = node.right;
		}
		
		if(node.right!=null) {
			node.right.nextRight = (node.nextRight!=null) ? node.nextRight.left : null;
		}
		
		connectNodes(node.left);
		connectNodes(node.right);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
