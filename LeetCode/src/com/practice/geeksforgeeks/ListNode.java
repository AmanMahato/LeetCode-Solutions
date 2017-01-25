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
		while(p != null){
			System.out.print(p.val + " ");
			p = p.next;
		}
	}
	
	public static ListNode getList(){
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(9);
		head.next.next.next.next = new ListNode(11);
		return head;
	}
}
