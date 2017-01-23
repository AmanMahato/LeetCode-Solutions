package sumeet.leetCode.trees;

public class SortedArrayToBst {
	
	public static TreeNode sortedArrayToBst(int[] nums){
		if( nums == null || nums.length == 0){
			return null;
		}
		return util(nums, 0 , nums.length -1);
	}
	
	public static TreeNode util(int[] nums, int start, int end){
		
		if(start > end){
			return null;
		}
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = util(nums, start, mid - 1);
		root.right = util(nums, mid + 1, end);
		
		return root;
	}
	
	public static void main(String[] args){
		
		int[] nums = {1,2,3,4,5,6};
		TreeNode root = SortedArrayToBst.sortedArrayToBst(nums);
		
		ConvertList.printTree(root);
		
	} 
}
