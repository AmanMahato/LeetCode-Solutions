package sumeet.leetCode.LinkedList;

import java.util.Stack;

public class AddLinkedList{

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
	public static ListNode addtwoList(ListNode l1 , ListNode l2){
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(l1 != null){
			s1.push(l1.val);
			l1 = l1.next;
		}
		
		while(l2 != null){
			s2.push(l2.val);
			l2 = l2.next;
		}
		
		int sum = 0;
		ListNode res = new ListNode(0);
		while(!s1.isEmpty() || !s2.isEmpty()){
			if(!s1.isEmpty()){
				sum += s1.pop();
			}
			if(!s2.isEmpty()){
				sum += s2.pop();
			}
			res.val = sum % 10;
			ListNode head = new ListNode(sum / 10);
			head.next = res;
			res = head;
			sum /= 10;
		}
		
		return res.val == 0 ? res.next : res;
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(1);
		
		printList(AddLinkedList.addtwoList(l1, l2));
	}
}
