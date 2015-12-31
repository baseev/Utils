package com.baseev.coding.interview.tree;

public class MaxDepth
{
    
    public static int getDepth(Node node) {
        if(node == null) {
            return 0;
        }
        
        int lDepth = getDepth(node.left);
        int rDepth = getDepth(node.right);
        
        return (Math.max(lDepth, rDepth) + 1); 
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Node<Integer> tree = new Node<Integer>(1);
        tree.left = new Node<Integer>(3);
        tree.right = new Node<Integer>(2);        
        tree.right.left = new Node<Integer>(5);
        tree.right.right = new Node<Integer>(4);
        
        System.out.println(MaxDepth.getDepth(tree));

    }

}
