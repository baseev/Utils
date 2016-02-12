package com.baseev.coding.interview.linked_list;

/**
 * @author Baseev
 * 
 *         Segregate even and odd nodes in a Linked List Given a Linked List of
 *         integers, write a function to modify the linked list such that all
 *         even numbers appear before all the odd numbers in the modified linked
 *         list. Also, keep the order of even and odd numbers same.
 * 
 *         Examples: Input: 17->15->8->12->10->5->4->1->7->6->NULL Output:
 *         8->12->10->4->6->17->15->5->1->7->NULL
 * 
 *         Input: 8->12->10->5->4->1->6->NULL Output:
 *         8->12->10->4->6->5->1->NULL
 * 
 *         // If all numbers are even then do not change the list Input:
 *         8->12->10->NULL Output: 8->12->10->NULL
 * 
 *         // If all numbers are odd then do not change the list Input:
 *         1->3->5->7->NULL Output: 1->3->5->7->NULL
 *
 */
public class SegregateOddEvevn {

	public static void segregate(Node head) {
		Node end = head;
		Node prev = null;
		Node curr = head;

		/* Get pointer to the last node */
		while (end.next != null)
			end = end.next;

		Node new_end = end;

		/*
		 * Consider all odd nodes before the first even node and move then after
		 * end
		 */
		while (curr.data % 2 != 0 && curr != end) {
			new_end.next = curr;
			curr = curr.next;
			new_end.next.next = null;
			new_end = new_end.next;
		}

		// 10->8->17->17->15
		/* Do following steps only if there is any even node */
		if (curr.data % 2 == 0) {
			/* Change the head pointer to point to first even node */
			head = curr;

			/* now current points to the first even node */
			while (curr != end) {
				if ((curr.data) % 2 == 0) {
					prev = curr;
					curr = curr.next;
				} else {
					/* break the link between prev and current */
					prev.next = curr.next;

					/* Make next of curr as NULL */
					curr.next = null;

					/* Move curr to end */
					new_end.next = curr;

					/* make curr as new end of list */
					new_end = curr;

					/* Update current pointer to next of the moved node */
					curr = prev.next;
				}
			}
		}

		/*
		 * We must have prev set before executing lines following this statement
		 */
		else {
			prev = curr;
		}

		/*
		 * If there are more than 1 odd nodes and end of original list is odd
		 * then move this node to end to maintain same order of odd numbers in
		 * modified list
		 */
		if (new_end != end && (end.data) % 2 != 0) {
			prev.next = end.next;
			end.next = null;
			new_end.next = end;
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
