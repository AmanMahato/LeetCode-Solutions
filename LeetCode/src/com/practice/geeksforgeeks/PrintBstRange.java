package com.practice.geeksforgeeks;

public class PrintBstRange {
	public static void printBstRange(TreeNode root, int k1, int k2){
		if(root == null){
			return;
		}
		
		if(k1 < root.val){
			printBstRange(root.left, k1, k2);
		}
		if( k1 <= root.val && k2>= root.val){
			System.out.print(root.val + " ");
		}
		if(k2 > root.val){
			printBstRange(root.right,k1,k2);
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left  = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(12);
		
		PrintBstRange.printBstRange(root, 10, 22);
	}
}
