package sumeet.leetCode.LinkedList;

public class LinkedList {

	public static void addElements(ListNode node , int val){
		if(node == null){
			ListNode temp = new ListNode(val);
			node = temp;
		}else {
			ListNode p = node;
			ListNode temp2 = new ListNode(val);
			p.next = node;
			p = p.next;
		}
	}
	public static void printList(ListNode node){
		if(node == null){
			return;
		}
		while(node != null){
			System.out.println(node.val + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args){
		ListNode node = null;
		LinkedList.addElements(node, 2);
		LinkedList.addElements(node, 3);
		LinkedList.addElements(node, 4);
		
		LinkedList.printList(node);
	}
}
