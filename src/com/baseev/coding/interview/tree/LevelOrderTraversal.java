package com.baseev.coding.interview.tree;

public class LevelOrderTraversal {
	
	
	private static int height(Node node) {
		if(node == null) {
			return 0;
		}
		
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		
		if(rHeight < lHeight) {
			return lHeight + 1;
		}
		return rHeight + 1;
	}
	
	private static void print(Node node, int level) {
		if(node == null) {
			return ;
		}
		if(level == 1){
			System.out.println(node.data);
		}
		if(level > 1) {
			print(node.right, level-1);
			print(node.left, level-1);
		}
	}
	
	public static void printlevelOrder(Node node) {
		int height = height(node);
		for(int i=1; i<=height; i++) {
			print(node, i);
		}
	}
	
	
	public static void main(String[] args)
    {
		Node tree = Node.getTree();
		LevelOrderTraversal.printlevelOrder(tree);
    }
}
