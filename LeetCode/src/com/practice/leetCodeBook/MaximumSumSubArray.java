package com.practice.leetCodeBook;

public class MaximumSumSubArray {
		public static int findMaximumSumSubArray(int[] nums){
			if(nums == null || nums.length == 0){
				throw new IllegalArgumentException("Invalid Input");
			}
			int max = nums[0], maxAns = nums[0];
			for(int i = 1; i < nums.length; i++){
				max = Math.max(nums[i], nums[i] + max);
				maxAns = Math.max(max, maxAns);
			}
		return maxAns;	
		}
		public static void main(String[] args) {
			int[] nums = {2, 1, -3, 4, -1, 2, 1, -5, 4};
			System.out.println(MaximumSumSubArray.findMaximumSumSubArray(nums));
		}
}
