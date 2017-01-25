package com.practice.geeksforgeeks;


public class MiddleLinkedList {
	public static int middleNode(ListNode head){
		if(head == null){
			return 0;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(9);
		
		System.out.println(MiddleLinkedList.middleNode(head));
	}
}
