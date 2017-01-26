package com.practice.geeksforgeeks;

class ArbitNode{
	ArbitNode next;
	ArbitNode arbitrary;
	int val;
	ArbitNode(int val){
		this.val = val;
	}
}
public class ArbitListNode {
	public static ArbitNode arbitListNode(ArbitNode head){
		if(head == null){
			return null;
		}
		ArbitNode newHead = reverse(head);
		
		ArbitNode max = newHead;
		ArbitNode temp = max.next;
		while(temp != null){ 
			if(max.val < temp.val){
				max = temp;
			}
			temp.arbitrary = max;
			temp = temp.next;
		}
		return reverse(newHead);
	}
	
	public static ArbitNode reverse(ArbitNode head){
		ArbitNode prev = null, current = head;
		while(current != null){
			ArbitNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static void printList(ArbitNode head){
		System.out.println("Node\tnext Pointer\tArbit pointer\n");
		while(head != null){
			System.out.print(head.val + "\t\t");
			if(head.next != null){
				System.out.print(head.next.val + "\t\t");
			}else {
				System.out.print("null" + "\t\t");
			}
			
			if(head.arbitrary != null){
				System.out.print(head.arbitrary.val + "\t\t");
			}else{
				System.out.print("null" + "\t\t");
			}
			
			System.out.println();
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		
		ArbitNode head = new ArbitNode(5);
		head.next = new ArbitNode(10);
		head.next.next = new ArbitNode(2);
		head.next.next.next = new ArbitNode(3);
		
		ArbitNode res = ArbitListNode.arbitListNode(head);
		ArbitListNode.printList(res);
	}
}
