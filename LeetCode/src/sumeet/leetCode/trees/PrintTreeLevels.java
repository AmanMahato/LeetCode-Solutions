package sumeet.leetCode.trees;

import java.util.Queue;
import java.util.LinkedList;

public class PrintTreeLevels {

	public static void printTreeLevels(TreeNode root){
		if(root == null){
			return ;
		} 
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.offer(root);
		while(!q.isEmpty()){
			int nodeCount = q.size();
			
			while(nodeCount > 0){
				TreeNode p = q.peek();
				System.out.print(p.val + " ");
				q.poll();
				if(p.left != null){
					q.offer(p.left);
				}
				if(p.right != null){
					q.offer(p.right);
				}
				nodeCount--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		TreeNode head = new TreeNode(10);
		head.left = new TreeNode(5);
		head.right = new TreeNode(30);
		head.left.left = new TreeNode(-2);
		head.left.right = new TreeNode(6);
		head.left.left.right = new TreeNode(2);
		head.left.left.right.left = new TreeNode(1);
		head.left.right.right = new TreeNode(8);
		head.right.right = new TreeNode(40);
		
		PrintTreeLevels.printTreeLevels(head);
		
	}
}
