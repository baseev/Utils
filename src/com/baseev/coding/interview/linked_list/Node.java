package com.baseev.coding.interview.linked_list;

public class Node
{
    public Node next;
    public Node prev;
    public int data;
    
    public Node(int d) {
        data = d;
    }
    
    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node getNext()
    {
        return next;
    }

    public int getData()
    {
        return data;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public void setData(int data)
    {
        this.data = data;
    }
    
    public static Node getNode(int n) {    	
		Node node = new Node(10);
		node.next = new Node(20);
		node.next.next = new Node(30);
		node.next.next.next = new Node(40);
		node.next.next.next.next = new Node(50);
		return node;
    }
    
	public static void printReverse(Node node) {
		if(node == null) return;
		printReverse(node.next);
		System.out.println(node.data);
	}
	
	public static void print(Node node) {
		if(node == null) return;
		System.out.println(node.data);
		print(node.next);
	}
}
