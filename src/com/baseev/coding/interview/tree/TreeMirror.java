package com.baseev.coding.interview.tree;

public class TreeMirror
{

    public static Node<Integer> mirror(Node tree) {
        if(tree==null) {
            
        } else {
            mirror(tree.left);
            mirror(tree.right);
            
            Node<Integer> temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;
        }
        return tree;
    }
    
    
    public static void printInOrder(Node<Integer> tree) {
        if (tree==null) 
            return;
        printInOrder(tree.left);
        System.out.println(tree.data);
        printInOrder(tree.right);
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
        
        TreeMirror.printInOrder(tree);
                
        Node<Integer> mirrorTree = TreeMirror.mirror(tree);
        
        System.out.println("\n\n");
        TreeMirror.printInOrder(mirrorTree);
    }

}
