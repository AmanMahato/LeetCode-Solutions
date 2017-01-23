package sumeet.leetCode.trees;

import java.util.Stack;

public class BstIterator {

	Stack<TreeNode> stack = new Stack<TreeNode>();
	public  BstIterator(TreeNode root) {
		TreeNode n = root;
		while(n!=null){
			stack.push(n);
			n = n.left;
		}
	}
	
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	
	public int next(){
		
		TreeNode n = stack.pop();
		TreeNode right = n.right;
		while(right!=null){
			stack.push(right);
			right = right.left;
		}
		return n.val;
	}
	
	public static void main(String[] args){
		
		
		TreeNode head = new TreeNode(4);
		head.left = new TreeNode(2);
		head.right = new TreeNode(5);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(3);
		head.right.right = new TreeNode(6);
		
		BstIterator itr = new BstIterator(head);
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
	}

}
