package sumeet.leetCode.trees;

public class LCABt {

	public static TreeNode  lcaBt(TreeNode root, TreeNode n1, TreeNode n2){
		if(root == null ){
			return null;
		}
		if(root.val == n1.val || root.val == n2.val){
			return root;
		}
		
		TreeNode leftVal = lcaBt(root.left, n1,n2);
		TreeNode rightVal = lcaBt(root.right, n1,n2);
		
		if(leftVal == null && rightVal == null){
			return null;
		}
		
		if(leftVal != null && rightVal != null){
			return root;
		}
		
		return leftVal = leftVal != null ? leftVal : rightVal;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(30);
		 root.right = new TreeNode(25);
		 root.left.left = new TreeNode(25);
		 root.left.right = new TreeNode(40);
		 root.right.left = new TreeNode(20);
		 root.right.right = new TreeNode(35);
		 root.right.right.left = new TreeNode(32);
		 root.right.right.right = new TreeNode(50);
		
		System.out.println(LCABt.lcaBt(root, root.right, root.right.right).val);
	}
}
