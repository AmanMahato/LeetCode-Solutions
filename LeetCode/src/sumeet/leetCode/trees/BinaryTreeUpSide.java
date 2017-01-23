package sumeet.leetCode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUpSide {
	
	public static TreeNode upSideDown(TreeNode root){
		return DfsBottomUp(root, null);
	}
	
	public static TreeNode DfsBottomUp(TreeNode p, TreeNode parent){
		if(p == null){
			return parent;
		}
		if(p.left!=null){
			System.out.println(p.left.val);
		}
		TreeNode root = DfsBottomUp(p.left, p);
		System.out.println(root.val);
		
		p.left = (parent == null) ? parent : parent.right;
		if(p.left!=null){System.out.println(p.left.val);}
		
		if(p.right!=null){System.out.println(p.right.val);}
		p.right = parent;
		return root;	
	}
	
	public static void printTree(TreeNode root){
		if(root == null){
			return;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode p = root;
		q.offer(p);
		
		while(!q.isEmpty()){
			
			TreeNode s = q.poll();
			System.out.print(s.val + " ");
			if(s.left != null){
				q.offer(s.left);
			}
			if(s.right != null){
				q.offer(s.right);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(-5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(-1);
		head.left.right = new TreeNode(4);
	
		BinaryTreeUpSide.printTree(head);
		System.out.println();
		TreeNode node = BinaryTreeUpSide.upSideDown(head);
		
		BinaryTreeUpSide.printTree(node);
		
	}

}
