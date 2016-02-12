package com.baseev.coding.interview.tree;

public class PrintAncestors {

	public static boolean print(Node<Integer> root, int target) {
		if(root == null) {
			return false;
		}
		
		if(root.data == target) {
			return true;
		}
		
		if(print(root.left, target) || print(root.right, target)) {
			System.out.println(root.data);
			return true;
		}		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
