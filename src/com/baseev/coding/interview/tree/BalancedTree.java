package com.baseev.coding.interview.tree;

/**
 * 
 * 

Implement a function to check if a tree is balanced. For the purposes of this question,
a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
from the root by more than one.


 * @author baseev
 *
 */

public class BalancedTree
{

    public static int minDepth(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
    public static boolean isBalanced1(Node root){
        return (maxDepth(root) - minDepth(root) <= 1);
    }
    
    public static boolean isBalanced2(Node root){
    	int lHeight=0, rHeight=0;
    	if(root == null) {
    		return true;
    	}
    	
    	lHeight = maxDepth(root.left);
    	rHeight = maxDepth(root.right);
    	
    	if((lHeight - rHeight <= 1) && isBalanced2(root.left) && isBalanced2(root.right)) {
    		return true;
    	}
    	return false;
    }
       
}
