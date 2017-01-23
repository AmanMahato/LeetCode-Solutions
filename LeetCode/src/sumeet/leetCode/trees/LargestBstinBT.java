package sumeet.leetCode.trees;


class MinMax{
	int min;
	int max;
	boolean isBst;
	int size;
	public MinMax() {
		this.min = Integer.MAX_VALUE;
		this.max = Integer.MIN_VALUE;
		this.isBst = true;
		this.size = 0;
	}
	
}
public class LargestBstinBT {

	public  int largestBst(TreeNode root){
		MinMax m = largest(root);
		return m.size;
	}
	
	public  MinMax largest(TreeNode root){
		if(root == null){
			return new MinMax();
		}
		
		MinMax leftMinMax = largest(root.left);
		MinMax rightMinMax = largest(root.right);
		
		MinMax m = new MinMax();
		
		if(leftMinMax.isBst == false || rightMinMax.isBst == false || (leftMinMax.max > root.val || rightMinMax.min < root.val)){
			m.isBst = false;
			m.size = Math.max(leftMinMax.size, rightMinMax.size);
			return m;
		}
		
		m.isBst = true;
		m.size = leftMinMax.size + rightMinMax.size + 1;
		m.min = root.left != null ? leftMinMax.min : root.val;
		m.max = root.right != null ? rightMinMax.max : root.val;
		
		return m;
	}
	
	public static void main(String[] args){
		LargestBstinBT lbst = new LargestBstinBT();
		TreeNode root = new TreeNode(20);
		 root.left = new TreeNode(30);
		 root.right = new TreeNode(25);
		 root.left.left = new TreeNode(25);
		 root.left.right = new TreeNode(40);
		 root.right.left = new TreeNode(20);
		 root.right.right = new TreeNode(35);
		 root.right.right.left = new TreeNode(32);
		 root.right.right.right = new TreeNode(50);
		
		 System.out.println(lbst.largestBst(root));
		
	}
}
