package com.baseev.coding.interview.tree;

/**
 * 
 * 
 * 
Inorder sequence: D B E A F C
Preorder sequence: A B D E C F

In a Preorder sequence, leftmost element is the root of the tree. So we know ‘A’ is root for given sequences. 
By searching ‘A’ in Inorder sequence, we can find out all elements on left side of ‘A’ are in left subtree and elements 
on right are in right subtree. So we know below structure now.

 * 
 * 
 * @author sapna
 *
 */
public class TreeFrominOrder {

	private static int preIndex = 0;
	
	public static Node buildTree(char in[], char pre[], int start, int end) {
		
		System.out.println(start);
		if(start >= end) {
		     return null;			
		}

		Node node = new Node(pre[preIndex++]);
		
		if(start == end)
		    return node;
		
		int inIndex = search(in, start, end, (char)node.data);
		
		node.left = buildTree(in, pre, start, inIndex-1);
		node.right = buildTree(in, pre, inIndex+1, end);
		
		return node;
	}
	
	
	private static int search(char in[], int start, int end, char data ){
		int index = 0;
		for(int i=start; i<end; i++) {
			if(in[i]==data) {
				index = i;
			}
		}		
		return index;
	}
	
	
	public static void main(String[] args) {
		char in[] = {'D', 'B', 'E', 'A', 'F', 'C'};
		char pre[] = {'A', 'B', 'D', 'E', 'C', 'F'};
		
		Node node = TreeFrominOrder.buildTree(in, pre, 0, in.length-1);
		System.out.println(node);		
	}
}
