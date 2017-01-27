package com.practice.leetCodeBook;

public class MaximumProductSubArray {
	public static int maximumProductSubArray(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = nums[0], max = nums[0], maxAns = nums[0];
		for(int i = 1; i < nums.length; i++){
			int mn = min, mx = max;
			max = Math.max(Math.max(nums[i], mx * nums[i]), mn * nums[i]); // calculates the maximum product.
			min = Math.min(Math.min(nums[i], mx * nums[i]), mn * nums[i]); // calculates the minimum product.
			maxAns = Math.max(max, maxAns);
		}
		return maxAns;
	}
	public static void main(String[] args) {
		System.out.println(MaximumProductSubArray.maximumProductSubArray(new int[]{2,3,-2,4}));
	}
}
