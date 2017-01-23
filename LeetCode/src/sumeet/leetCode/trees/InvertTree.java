package sumeet.leetCode.trees;

public class InvertTree {
	
	public static TreeNode invert(TreeNode root)
	{
		
		if(root== null)
		{
			return root;
		}
		TreeNode Right = root.right;
		TreeNode Left = root.left;
		if(root.left!=null)
		{
			 Right = invert(root.right);
		}
		if(root.left!= null)
		{
			Left = invert(root.left);
		}
		
		root.left = Right;
		root.right = Left;
		
		return root;
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
		root.left.right = new TreeNode(3);
		
		printNodes(root);
		
		System.out.println();
		invert(root);
		printNodes(root);
		
	}
}
