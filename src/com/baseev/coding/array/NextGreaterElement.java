package com.baseev.coding.array;

import com.baseev.coding.interview.stack_queue.StackArray;

public class NextGreaterElement {

	public static void printNextGreaterElement(int arr[]) {
		int element, next;
		StackArray<Integer> stack = new StackArray<Integer>();
	
		stack.push(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			next = arr[i];
			if(!stack.isEmpty()) {
				element = stack.pop();
				while(element<next) {
					System.out.println(element+" ::: "+next);
					if(stack.isEmpty()) {
						break;
					}
					element = stack.pop();
				}
				if(element > next) {
					stack.push(next);
				}
			}
			stack.push(next);
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
