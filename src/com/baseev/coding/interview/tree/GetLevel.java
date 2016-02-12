package com.baseev.coding.interview.tree;

public class GetLevel {

	public static int getLevel(Node root, Node node, int level){
		if(node == null) {
			return 0;
		}
		
		if(root.data == node.data) {
			return level;
		}
		
		int dLevel = getLevel(root.left, node, level+1);
		if(dLevel != 0) {
			return dLevel;
		}
		
		dLevel = getLevel(root.right, node, level+1);
		return dLevel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
