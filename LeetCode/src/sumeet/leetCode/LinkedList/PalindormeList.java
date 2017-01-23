package sumeet.leetCode.LinkedList;

public class PalindormeList {

	public static boolean isPalindrome(ListNode head){
	
		if(head == null || head.next == null){
			return true;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode secondhead = slow.next;
		slow.next = null;
		
		ListNode p1 = secondhead;
		ListNode p2 = p1.next;
		
		while(p1 != null && p2 != null){
			ListNode temp = p2.next;
			p2.next = p1;
			p1 = p2 ;
			p2 = temp;
		}
		secondhead.next = null;
		ListNode p =(p2 == null) ? p1 : p2;
		ListNode q = head;
		
		while(p != null && q != null){
			if(p.val != q.val){
				return false;
			}
			p = p.next;
			q = q.next; 
		}
	return true;	
	}
	
	public static void main(String[] args){
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(1);
		System.out.println(PalindormeList.isPalindrome(head));
	}
}
