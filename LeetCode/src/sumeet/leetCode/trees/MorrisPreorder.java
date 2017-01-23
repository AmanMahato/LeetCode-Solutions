package sumeet.leetCode.trees;

public class MorrisPreorder {

	public static void morrisPreorder(TreeNode root){
		if(root == null){
			return;
		}
		TreeNode current = root;
		while(current != null){
			if(current.left == null){
				System.out.print(current.val + " ");
				current = current.right;
			}
			else {
				TreeNode predecessor = current.left;
				while(predecessor.right != null && predecessor.right != current){
					predecessor = predecessor.right;
				}
				
				if(predecessor.right == null){
					predecessor.right = current;
					System.out.print(current.val + " ");
					current = current.left;
				}
				else {
					predecessor.right = null;
					current = current.right;
				}
			}
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
		
		MorrisPreorder.morrisPreorder(head);
		
	}
}
