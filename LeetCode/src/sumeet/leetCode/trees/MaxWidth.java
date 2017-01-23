package sumeet.leetCode.trees;

public class MaxWidth {

	public static int[] getMaxWidthUtil(TreeNode root, int[] width, int level){
		if(root != null){
			width[level]++;
			getMaxWidthUtil(root.left,width,level + 1);
			getMaxWidthUtil(root.right,width, level + 1);
		}
		return width;
	}
	public static int getHeight(TreeNode root){
		if( root == null){
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	public static int getMax(int[] res){
		if(res == null){
			return 0;
		}
		int maxWidth = Integer.MIN_VALUE;
		for(int i = 0; i < res.length; i++){
			if(maxWidth < res[i]){
				maxWidth =  res[i];
			}
		}
		return maxWidth;
	}
	
	
	public static int getMaxWidth(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int h = getHeight(root);
		
		int[] width = new int[h];
		int level = 0;
		
	int[] res =	getMaxWidthUtil(root, width, level);
		
		return getMax(res);
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
		
		System.out.println(MaxWidth.getMaxWidth(head));
	}
}
