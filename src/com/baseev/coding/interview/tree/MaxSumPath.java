package com.baseev.coding.interview.tree;

public class MaxSumPath {

	public static Node getTargetLeaf(Node node, Node maxRef, int currentSum, Node TargetRef){
		if(node == null) {
			return null;
		}
		
		currentSum = currentSum+node.data;
		if(node.left==null && node.right==null) {
			if(currentSum>Integer.parseInt(maxRef.data.toString())) {
				maxRef=
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
