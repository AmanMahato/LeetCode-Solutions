package sumeet.leetCode.trees;

public class LCABst {
	
	public static int lcaBst(TreeNode root, TreeNode n1, TreeNode n2){
		if(root == null ){
			return 0;
		}
		if(root.val < Math.min(n1.val, n2.val)){
			return lcaBst(root.right,n1,n2);
		}
		if(root.val > Math.max(n1.val, n2.val)){
			return lcaBst(root.left,n1,n2);
		}
		else 
			return root.val;
	}
	public static void main(String[] args){
		
		TreeNode root = new TreeNode(25);
		 root.left = new TreeNode(20);
		 root.right = new TreeNode(35);
		 root.right.left = new TreeNode(32);
		 root.right.right = new TreeNode(50);
		 
		System.out.println(LCABst.lcaBst(root, root.left, root.right.right));
	}
}
