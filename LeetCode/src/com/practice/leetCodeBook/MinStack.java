package com.practice.leetCodeBook;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int val){
		if(minStack.isEmpty() || minStack.peek() < val){
			minStack.push(val);
		}
		stack.push(val);
	}
	
	public void pop(){
		if (stack.pop().equals(minStack.peek())){
			 minStack.peek();
		}
	}
	public int peek(){
		return stack.peek();
	}
	
	public int min(){
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		
	}
}
