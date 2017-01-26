package com.practice.geeksforgeeks;

public class MergeLLReverse {
	public static ListNode mergeLLReverse(ListNode head1, ListNode head2){
		
		ListNode res = null;
		while(head1 != null && head2 != null){
			if(head1.val <= head2.val){
				ListNode next = head1.next;
				head1.next = res;
				res = head1;
				head1 = next;
			}else {
				ListNode next = head2.next;
				head2.next = res;
				res = head1;
				head2 = next;
			}
		}
		
		while(head1 != null){
			ListNode next = head1.next;
			head1.next = res;
			res = head1;
			head1 = next;
		}
		while(head2 != null){
			ListNode next = head2.next;
			head2.next = res;
			res = head1;
			head2 = next;
		}
		return res;
	}
	public static void main(String[] args) {
		
		ListNode res = MergeLLReverse.mergeLLReverse(ListNode.getList(), ListNode.getList());
		ListNode.printList(res);
	}
}
