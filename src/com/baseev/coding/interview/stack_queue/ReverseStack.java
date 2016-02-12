package com.baseev.coding.interview.stack_queue;

public class ReverseStack {
	
	private static void insertBottom(StackArray<Integer> stack, int item) {
		if(stack.isEmpty()) {
			stack.push(item);
		} else {
			int temp = stack.pop();
			insertBottom(stack, item);
			stack.push(temp);
		}
	}
	
	public static void reverse(StackArray<Integer> stack) {
		if(!stack.isEmpty()) {
			int temp = stack.pop();
			reverse(stack);	
			insertBottom(stack, temp);
		}
	}
	
	public static void main(String[] args) {
		StackArray<Integer> stack = new StackArray<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.print();
		
		reverse(stack);

		System.out.println("\n\n\n");
		stack.print();
	}

}
