package com.practice.geeksforgeeks;

public class NthNodeFromEnd {
	public static int nthNodeFromEnd(ListNode head, int n){
		if(head == null || n == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		ListNode p1 = head;
		ListNode p2 = head;
		while(n > 0){
			p1 = p1.next;
			n--;
		}
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2.val;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(9);
		head.next.next.next.next = new ListNode(11);
		System.out.println(NthNodeFromEnd.nthNodeFromEnd(head, 4));
	}
}
