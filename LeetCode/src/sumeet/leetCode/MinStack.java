package sumeet.leetCode;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	
	public void push(int x){
		stack.push(x);
		if(minStack.isEmpty() || x<= minStack.peek()){
			minStack.push(x);
		}
	}
	
	public void pop(){
		if(stack.pop().equals(minStack.peek())){
			minStack.pop();
		}
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int getMin(){
		return minStack.peek();
	}
	
	public static void main(String[] args){
		
		MinStack minstack = new MinStack();
		minstack.push(-2);
		minstack.push(0);
		minstack.push(-1);
		
		System.out.println(minstack.getMin());
		
		System.out.println(minstack.top());
		
		minstack.pop();
		
		System.out.println(minstack.getMin());
		
		
		
		
	}
	
}
