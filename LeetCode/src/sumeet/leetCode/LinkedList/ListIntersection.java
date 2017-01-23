package sumeet.leetCode.LinkedList;

public class ListIntersection {

	public static ListNode intersectingNode(ListNode one, ListNode two){
		
		if(one == null || two == null){
			return null;
		}
		
		int len1 = 0;
		int len2 = 0;
		ListNode p1 = one;
		ListNode p2 = two;
		
		while(p1 != null){
			len1++;
			p1 = p1.next;
		}
		while(p2 != null){
			len2++;
			p2 = p2.next;
		}
		
		p1 = one;
		p2 = two;
		
		int dif = len1 > len2 ? len1 - len2 : len2 - len1 ;
		
		if(len1 > len2){
			while(dif > 0){
				p1 = p1.next;
				dif--;
			}
		}
		if(len2 > len1){
			while(dif > 0){
				p2 = p2.next;
				dif--;
			}
		}
		
		while(p1 != null && p2 != null){
			if(p1 == p2){
				return p1;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return null;
	}
	
	public static void main(String[] args){
		
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = head1.next.next.next;
		head2.next.next.next.next = head1.next.next.next.next;
		
		System.out.println(ListIntersection.intersectingNode(head1, head2).val);
	}
}
