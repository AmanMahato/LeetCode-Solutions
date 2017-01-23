package sumeet.leetCode;

public class MaximumSubarraySum {

	public static int maximumSum(int[] nums){
		if(nums.length == 0 || nums == null){
			return 0;
		}
		
		int maxEndingHere = nums[0];
		int maxSoFar = nums[0];
		for(int i = 1; i < nums.length; i++){
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar,maxEndingHere);
		}
		return maxSoFar;
	}
	
	public static void main(String[] args){
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSubarraySum.maximumSum(nums));
	}
}
