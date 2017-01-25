package com.practice.geeksforgeeks;

public class ListNode {
	ListNode next;
	int val;
	ListNode(int val){
		this.val = val;
		next = null;
	}
	
	public static void printList(ListNode head){
		if(head == null){
			return;
		}
		ListNode p = head;
		while(p.next != null){
			System.out.println(p.val);
			p = p.next;
		}
	}
}
