package sumeet.leetCode.dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static int lengthOfLIS(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int[] max = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++){
			max[i] = 1;
			for(int j = 0; j < i; j++){
				if(nums[i] > nums[j]){
					max[i] = Math.max(max[i], max[j] + 1);
				}
			}
		}
		
		int res = Integer.MIN_VALUE;
		for(int i = 0; i < max.length; i++){
			if(max[i] > res){
				res = max[i];
			}
		}
	return res;	
	}
	
	public static void main(String[] sumeet){
		
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(LongestIncreasingSubsequence.lengthOfLIS(nums));
	}
}
