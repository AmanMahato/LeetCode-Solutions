package sumeet.leetCode.trees;

public class BinaryTreeMaxPath {
	
	private static int maxSum ;
	
	public static int maxSumPath(TreeNode root){
		maxSum = Integer.MIN_VALUE;
		 sumPathValue(root);
		 return  maxSum;
	}
	
	public static int sumPathValue(TreeNode root){
		if(root == null){
			return 0;
		}
		if(root.left!=null){
		System.out.println(root.left.val);
		}
		int left = sumPathValue(root.left);
		
		if(root.right!=null){
		System.out.println(root.right.val);
		}
		int right = sumPathValue(root.right);
		
		maxSum = Math.max(left+right+root.val, maxSum);
		int ret = root.val + Math.max(left, right);
		return ret > 0 ? ret : 0;
	}
	
	public static void main(String[] args){
		TreeNode head = new TreeNode(-5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(-1);
		head.left.right = new TreeNode(4);
		
		System.out.println(BinaryTreeMaxPath.maxSumPath(head));	
	}
}
