package com.baseev.coding.interview.tree;

public class CheckChildrenSum {

	
	public static boolean isChildrenSum(Node<Integer> node){
		if(node == null || (node.left == null && node.right == null)) {
			return true;
		} else {
			int leftData=0, rightData=0;
			if(node.left != null){
				leftData = (int)node.left.data;
			}
			
			if(node.right != null){
				rightData = (int)node.right.data;
			}
			
			if((node.data == leftData + rightData) && isChildrenSum(node.left) && isChildrenSum(node.right)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(CheckChildrenSum.isChildrenSum(Node.getTree()));
	}

}
