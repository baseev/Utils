package com.baseev.coding.interview.tree;

public class TreeDiameter {

	public static int getDiameter(Node node){
		
		if(node == null) {
			return 0;
		}
		
		int lHeight = getHeight(node.left);
		int rHeight = getHeight(node.right);
		
		int lDiameter = getDiameter(node.left);
		int rDiameter = getDiameter(node.right);
		
		return Math.max(lHeight+rHeight+1, Math.max(lDiameter, rDiameter));
	}
	
	private static int getHeight(Node node) {
		return 1 + Math.max(getHeight(node.left), getHeight(node.left));
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
