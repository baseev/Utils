package com.baseev.coding.interview.tree;

public class Node<T>
{
    public T data;
    public Node left;
    public Node right;
    
    public Node(T m_data) {
        data = m_data;
    }
    
    public Node(T m_data, Node m_left, Node m_right) {
        data = m_data;
        right = m_right;
        left = m_left;
    }

    public static void printInOrder(Node<Integer> tree) {
        if (tree==null) 
            return;
        printInOrder(tree.left);
        System.out.println(tree.data);
        printInOrder(tree.right);
    }
    
    public static Node<Integer> getTree() {
        Node<Integer> tree = new Node<Integer>(1);
        tree.left = new Node<Integer>(3);
        tree.right = new Node<Integer>(2);        
        tree.right.left = new Node<Integer>(5);
        tree.right.right = new Node<Integer>(4);
        return tree;
    }
    
    
    @Override
    public String toString()
    {
        return "Node [data=" + data + ", left=" + left + ", right=" + right
                + "]";
    }
}
