package com.practice.geeksforgeeks;

public class SortListAbsoluteValue {
	public static ListNode sortList(ListNode head){
		if(head == null){
			throw new IllegalArgumentException("Invalid Input");
		}
		ListNode cur = head.next;
		ListNode prev = head;
		while(cur != null){
			if(cur.val < prev.val){
				//Detach current from the LinkedList
				prev.next = cur.next;
				//Set current as the head
				cur.next = head;
				head = cur;
				// update current
				cur = prev;
			}else{
				prev = cur;
				cur = cur.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode resHead = SortListAbsoluteValue.sortList(ListNode.getList());
		ListNode.printList(resHead);
	}
}
