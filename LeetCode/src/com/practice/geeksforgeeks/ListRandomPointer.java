package com.practice.geeksforgeeks;

import java.util.HashMap;

class RandomNode{
	int label;
	RandomNode next;
	RandomNode random;
	RandomNode(int label){
		this.label = label;
		next = null;
		random = null;
	}
}

public class ListRandomPointer {
	public static RandomNode listRandomPointer(RandomNode head){
		HashMap<RandomNode, RandomNode> map = new HashMap<RandomNode, RandomNode>();
		
		RandomNode fakeHead = new RandomNode(0);
		RandomNode q = fakeHead;
		RandomNode p = head;
		while(p != null){
			q.next = new RandomNode(p.label);
			map.put(p, q.next);
			p = p.next;
			q = q.next;
		}
		q = fakeHead;
		p = head;
		while(p != null){
			q.next.random = map.get(p.random);
			p = p.next;
			q = q.next;
		}
		return fakeHead.next;		
	}
	public static void main(String[] args) {
		ListRandomPointer.listRandomPointer(new RandomNode(3));// Please provide the specific list as the input to the function.
	}
}
