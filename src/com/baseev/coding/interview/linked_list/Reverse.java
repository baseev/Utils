package com.baseev.coding.interview.linked_list;

import org.omg.PortableInterceptor.CurrentHelper;

/**
 * @author sapna
 *
 *
Reverse alternate K nodes in a Singly Linked List
Given a linked list, write a function to reverse every alternate k nodes (where k is an input to the function) in an efficient way. Give the complexity of your algorithm.

Example:
Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
Output:   3->2->1->4->5->6->9->8->7->NULL. 

kAltReverse(struct node *head, int k)
  1)  Reverse first k nodes.
  2)  In the modified list head points to the kth node.  So change next 
       of head to (k+1)th node
  3)  Move the current pointer to skip next k nodes.
  4)  Call the kAltReverse() recursively for rest of the n - 2k nodes.
  5)  Return new head of the list.


 *
 */

public class Reverse {
	
	public static Node reverse(Node head, int k) {
		Node current = head;
		Node next;
		Node prev = null;
		int count = 0;
	
		while(current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(head != null){
			head.next = current;
		}
		
		count = 0;
		while(current != null && count < k) {
			current = current.next;
			count ++;
		}
		
		if(current != null) {
			current.next =  reverse(current.next, k);
		}
		return prev;			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
