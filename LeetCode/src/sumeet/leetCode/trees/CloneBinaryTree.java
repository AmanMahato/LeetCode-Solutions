package sumeet.leetCode.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

class Node{
	Node root;
	Node left;
	Node right;
	Node rd;
	int val;
	Node(int val){
		this.val = val;
		left = right = rd = null;
	}
}

public class CloneBinaryTree {

	public static void printTree(Node root){
		if(root == null){
			return;
		}
		printTree(root.left);
		System.out.print("[ " + root.val + " ");
		if(root.rd != null){
			System.out.println(" "+ root.rd + " ]");
		}
		printTree(root.right);
		
	}
	
	public static Node cloneTreeUtil(int[] res, HashMap<Node,Node> map, int start, int end){
		if(res == null){
			return null;
		}
		System.out.println(String.valueOf(res));
		System.out.println();
		int mid = (start + end)/2;
		Node root = null;
		try{
			 root = new Node(res[mid]);
		if(map.get(res[mid]) != null){
		root.rd = map.get(res[mid]);
		}
		root.left = cloneTreeUtil(res,map,start, mid-1);
		root.right = cloneTreeUtil(res,map,mid+1,end-1);
		}
		catch (Exception e){
			System.out.println("fucked up here");
		}
		return root;
	}
	public static void cloneTree(Node root){
		if(root == null){
			return;
		}
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		int[] val = new int[10];
		
		Node current = root;
		int i = 0;
		while(current != null){
			if(current.left == null){
				val[i] = current.val;
				i++;
				if(current.rd != null){
					map.put(current, current.rd);
					}
				current = current.right;
				
			}
			else {
				
				Node predecessor = current.left;
				while(predecessor.right != null && predecessor.right != current){
					predecessor = predecessor.right;
				}
				if(predecessor.right == null){
					predecessor.right = current;
					current = current.left;
				}
				else {
					predecessor.right = null;
					val[i] = current.val;
					i++;
					if(current.rd != null){
						map.put(current, current.rd);
						}
					current = current.right;
				}
			}
		}
		printTree(cloneTreeUtil(val, map, 0, val.length));
	}
	
	public static void main(String[] args){
		Node head = new Node(10);
		head.left = new Node(5);
		head.right = new Node(30);
		head.left.left = new Node(-2);
		head.left.right = new Node(6);
		head.left.left.right = new Node(2);
		head.left.left.right.left = new Node(1);
		head.left.right.right = new Node(8);
		head.right.right = new Node(40);
		head.rd = head.left.left;
		head.left.rd = head.left.right.right;
		CloneBinaryTree.cloneTree(head);
	}
	
}
