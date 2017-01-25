package com.practice.geeksforgeeks;

public class ReverseLinkedList {
	public static ListNode reverseLinkedList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode prev = null;
		ListNode next = null;
		ListNode current = head;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	public static ListNode reverseLinkedList(ListNode head, ListNode newHead){
		if(head == null){
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return reverseLinkedList(next, head);
	}
	public static void main(String[] args){
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(9);
		head.next.next.next.next = new ListNode(11);
		
		ListNode.printList(head);
		ListNode resHead = ReverseLinkedList.reverseLinkedList(head);
		ListNode.printList(resHead);
	}
}
