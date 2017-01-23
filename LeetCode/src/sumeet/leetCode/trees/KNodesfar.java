package sumeet.leetCode.trees;

public class KNodesfar {

	public static void printKNodesFar(TreeNode root , int k){
		if(root == null){
			return;
		}
		if(k == 0){
			System.out.println(root.val + " ");
		}
		printKNodesFar(root.left, k-1);
		printKNodesFar(root.right, k-1);
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
		 
		 KNodesfar.printKNodesFar(root, 3);
	}
}
