package sumeet.leetCode.trees;

public class LeftLeaf {
			
	public static int leftLeafSum(TreeNode root)
	{
		return leftUtil(root, true);
	}

	public static int leftUtil(TreeNode root, boolean value)
	{
		if(root == null)
		{
			return 0;
		}
		if(value && isLeaf(root))
		{
			return root.val;
		}
		else 
		{
			return leftUtil(root.left, true) + leftUtil(root.right, false);
		}
	}
	
	public static boolean isLeaf(TreeNode root)
	{
		return root.left == null && root.right == null ;
	}
	
	public static void  printNodes(TreeNode root)
	{
		if(root!= null)
		{
			System.out.print(root.val + " ");
			printNodes(root.left);
			printNodes(root.right);
		}
	}
	
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.right.left = new TreeNode(3);
		
		System.out.println(leftLeafSum(root));
		
	}
	
}
