package sumeet.leetCode.trees;

import java.util.Stack;

public class FlattenBinaryTree {

	public static void printTree(TreeNode root){
		if(root == null){
			return;
		}
		while(root.right != null){
			System.out.println(root.val);
			root = root.right;
		}
	}
	public static void  flattenTree(TreeNode root){
		if(root == null){
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		TreeNode p = root;
		while(p != null || !stack.isEmpty()){
			if(p.right != null){
				stack.push(p.right);
			}
			if(p.left != null){
				p.right = p.left;
				p.left = null;
			}
			else if(!stack.isEmpty()){
				TreeNode temp = stack.pop();
				p.right = temp;
			}
			p = p.right;
		}
	}
	
	public static void main(String[] args){
		
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.right = new TreeNode(6);
		
		FlattenBinaryTree.flattenTree(head);
		
		printTree(head);
	}
}
