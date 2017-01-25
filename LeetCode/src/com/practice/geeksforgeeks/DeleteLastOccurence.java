package com.practice.geeksforgeeks;

public class DeleteLastOccurence {
	public static ListNode deleteLastOccurence(ListNode head, int key){
		if(head == null){
			throw new IllegalArgumentException("Invalid Input");
		}
		ListNode lastOccurence = null;
		ListNode p = head;
		while(p != null){
			if(p.val == key){
				lastOccurence = p;
			}
			p = p.next;
		}
		if(lastOccurence != null){
			lastOccurence.val = lastOccurence.next.val;
			lastOccurence.next = lastOccurence.next.next;
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode resHead = DeleteLastOccurence.deleteLastOccurence(ListNode.getList(), 9);
		 ListNode.printList(resHead);
	}
}
