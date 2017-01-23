package sumeet.leetCode.LinkedList;

public class ReverseList {

	public static ListNode revRecUtil(ListNode head, ListNode newHead){
		if(head == null){
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return revRecUtil(next , head);
	}
	public static ListNode revListRec(ListNode head){
		
		return revRecUtil(head, null);
	}
	public static void main(String[] args){
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(1);
		AddLinkedList.printList(ReverseList.revListRec(head));
		
	}
}
