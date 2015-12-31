package com.baseev.coding.interview.tree;

public class DeleteTree
{

    public static void delete(Node tree) {
        if(tree == null) {
            return;
        }
        delete(tree.left);
        delete(tree.right);
        
        tree.left = null;
        tree.right = null;
        tree = null;
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
        
        Node.printInOrder(tree);
        
        DeleteTree.delete(tree);
        
        System.out.println("\n\n");
        Node.printInOrder(tree);
        
    }

}
