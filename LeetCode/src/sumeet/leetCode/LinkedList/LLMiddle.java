package sumeet.leetCode.LinkedList;

class ListNode{
	ListNode node;
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
		next = null;
	}
	
} 

public class LLMiddle {

	public static int  getMiddleElement(ListNode head){
		if(head == null || head.next == null){
			return head.val;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		if(head != null){
			while(fast != null && fast.next != null){
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow.val;
	}
	
	public static void main(String[] args){
		ListNode  list = new ListNode(3);
		list.next = new ListNode(5);
		list.next.next = new ListNode(7);
		list.next.next.next = new ListNode(9);
		list.next.next.next.next = new ListNode(11);
		list.next.next.next.next.next = new ListNode(12);
		
		
		System.out.println(LLMiddle.getMiddleElement(list));
	}
}
