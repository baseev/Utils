package com.baseev.coding.interview.tree;

public class LeafToRootPerLine
{    
    public static void print(int arr[], int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    
    public static void printPath(Node node, int path[], int nodeLength) {
        if(node  == null) {
            return;
        }
        
        path[nodeLength] = Integer.parseInt(node.data.toString());
        nodeLength++;
        
        if(node.left == null && node.right == null) {
            print(path, nodeLength);
        } else {
            printPath(node.left, path, nodeLength);
            printPath(node.right, path, nodeLength);
        }       
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
        
        int path[] = new int[100];
                
        LeafToRootPerLine.printPath(tree, path, 0);
    }

}
