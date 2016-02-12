package com.baseev.coding.interview.linked_list;


/**
 * @author sapna
 *
Delete nodes which have a greater value on right side
Given a singly linked list, remove all the nodes which have a greater value on right side.

Examples:
a) The list 12->15->10->11->5->6->2->3->NULL should be changed to 15->11->6->3->NULL. Note that 12, 10, 5 and 2 have been deleted because there is a greater value on the right side.

When we examine 12, we see that after 12 there is one node with value greater than 12 (i.e. 15), so we delete 12.
When we examine 15, we find no node after 15 that has value greater than 15 so we keep this node.
When we go like this, we get 15->6->3

b) The list 10->20->30->40->50->60->NULL should be changed to 60->NULL. Note that 10, 20, 30, 40 and 50 have been deleted because they all have a greater value on the right side.

c) The list 60->50->40->30->20->10->NULL should not be changed.
 *
 */

public class DeleteNodes {

	public static Node delete(Node head) {
		Node current = reverse(head);
		Node max= current;
		Node temp = null;
		while(current!=null && current.next != null) {
			if(current.next.data < max.data){
				//delete node
				temp = current.next;
				current.next = temp.next;
			} else {
				current = current.next;
				max = current;
			}
		}
		
		return reverse(current);
	}

	private static Node reverse(Node head) {
		Node current = head;
		Node prev = null;
		Node next;
		
		while(head!=null) {
			next = current.next;
			current.next = prev;
			prev = current;		
			current = next;	
		}
		
		head = prev;
		return head;
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
