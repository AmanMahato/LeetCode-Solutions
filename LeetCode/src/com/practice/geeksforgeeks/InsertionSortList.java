package com.practice.geeksforgeeks;

public class InsertionSortList {
	public static ListNode insertionSortList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode fakeHead = new ListNode(0);
		ListNode current = head;
		ListNode prev = fakeHead;
		ListNode next = null;
		while(current != null){
			next = current.next;
			
			while(prev.next != null && prev.next.val < current.val){
				prev = prev.next;
			}
			current.next = prev.next;
			prev.next = current;
			prev = fakeHead;
			current = next;
		}
		return fakeHead.next;
	}
	public static void main(String[] args) {
		ListNode res = InsertionSortList.insertionSortList(ListNode.getList());
		ListNode.printList(res);
	}
}
