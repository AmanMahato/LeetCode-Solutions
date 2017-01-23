package sumeet.leetCode.trees;

import java.util.Stack;

public class Recover {

	public static void recoverBst(TreeNode root){
		TreeNode first = null;
		TreeNode second = null;
		TreeNode prev = null;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode p = root;
		while(p != null || !s.isEmpty()){
			if(p != null){
				s.push(p);
				p = p.left; 
			}
			else {
				TreeNode cur = s.pop();
				
				if(prev != null && cur.val <= prev.val){
					if(first == null){
						first = prev;
						second = cur;
					}
				}
				prev = cur;
				p = cur.right;
			}
		}
		
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}
	
	public static void main(String[] args){
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(6);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		
		Recover.recoverBst(root);
		
		ConvertList.printTree(root);
	}
}
