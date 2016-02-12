package com.baseev.coding.interview.tree;

public class ConvertChildrenSum {

	public static void convert(Node<Integer> node) {
		int leftData=0, rightData=0;
		if(node==null || (node.left == null && node.right == null)) {
			return;
		} else {
			convert(node.left);
			convert(node.right);
			
			if(node.left != null) {
				leftData = (int)node.left.data;
			}
			
			if(node.right != null) {
				rightData = (int)node.right.data;
			}
			
			int diff = leftData + rightData - node.data;
			
			if(diff > 0) {
				node.data = node.data+ diff;
			} 
			
			if(diff < 0) {
				increment(node, -diff);
			}
		}
	}
	
	
	private static void increment(Node<Integer> node, int diff) {
		if(node.left != null) {
			node.left.data = (int)node.left.data + diff;
			increment(node.left, diff);
		}
		
		if(node.right != null) {
			node.right.data = (int)node.right.data + diff;
			increment(node.right, diff);
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
