package sumeet.leetCode.trees;

public class DeleteBst {

	public static int minValue(TreeNode root){
		if(root == null){
			return 0;
		}
		while(root.left != null){
			root = root.left;
		}
		return root.val;
	}
	public static TreeNode deleteNode(TreeNode root , int val){
		if(root == null){
			return root;
		}
		else if(val < root.val){
			root.left = deleteNode(root.left, val);
		}
		else if(val > root.val){
			root.right = deleteNode(root.right, val);
		}
		else {
			//if the node to be deleted is leaf or has only one child
			if(root.left == null ){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}
			// if the node to be deleted has two children find the inroder successor or the in order predecessor
			root.val = minValue(root.right);
			
			root.right = deleteNode(root.right, root.val);
		}
	return root;
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
		
		
	}
}
