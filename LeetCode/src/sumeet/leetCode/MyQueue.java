package sumeet.leetCode;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> queue = new Stack<Integer>();
	
	public void push(int val){
		Stack<Integer> temp = new Stack<Integer>();
		while(!queue.isEmpty()){
			temp.push(queue.pop());
		}
		queue.push(val);
		while(!temp.isEmpty()){
			queue.push(temp.pop());
		}
	}
	
	public int pop(){
		return queue.pop();
	}
	
	public int peek(){
		return queue.peek();
	}
	
	public boolean empty(){
		return queue.isEmpty();
	}
	
	public static void main(String[] args){
		MyQueue q = new MyQueue();
		
		q.push(4);
		q.push(5);
		q.push(6);
		q.push(7);
		q.push(8);
		
		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q.empty());
		
	}
}
