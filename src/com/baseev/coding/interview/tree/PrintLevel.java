package com.baseev.coding.interview.tree;


public class PrintLevel
{

    public static void printLevel(Node node) {
        int height = getHeight(node);
        for(int i=1; i<=height; i++) {
            print(node, i);
        }
    }
    
    private static void print(Node node, int level) {
        if(node==null) {
            return;
        }
        if(level == 1) {
            System.out.print(node.data);
        } else if(level > 1) {
            print(node.left, level-1);
            print(node.right, level-1);
        }
    }
    
    private static int getHeight(Node node) {
        if(node == null) {
            return 0;
        }
        int lHeight = getHeight(node.left);
        int rHeight = getHeight(node.right);
        
        if(lHeight>rHeight) {
            return lHeight + 1;
        }
        return rHeight + 1;        
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Node<Integer> tree = Node.getTree();
        System.out.println(tree);
        PrintLevel.printLevel(tree);
    }

}
