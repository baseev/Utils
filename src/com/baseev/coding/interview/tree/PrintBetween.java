package com.baseev.coding.interview.tree;

/**
 * @author sapna
 *
 *Given two values k1 and k2 (where k1 < k2) and a root pointer to a Binary Search Tree. 
 *Print all the keys of tree in range k1 to k2. i.e. print all x such that k1<=x<=k2 and x is a key of given BST. 
 *Print all the keys in increasing order.
 *
 */

public class PrintBetween {

	public static void print(Node<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		
		if(k1<root.data) {
			print(root.left, k1, k2);
		}
		
		if(k1<=root.data && k2>=root.data) {
			System.out.println(root.data);
		}
		
		if(k2>root.data) {
			print(root.right, k1, k2);
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
