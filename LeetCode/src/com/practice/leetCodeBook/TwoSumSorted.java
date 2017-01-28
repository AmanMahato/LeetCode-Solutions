package com.practice.leetCodeBook;

public class TwoSumSorted {
	public static int[] findTwoSum(int[] nums, int target){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int i = 0, j = nums.length - 1;
		while(i < j){
			if(nums[i] + nums[j] == target){
				return new int[]{i , j};
			}else if(nums[i] + nums[j] < target){
				i++;
			}else{
				j--;
			}
		}
		throw new IllegalArgumentException("No pair exist!!");
	}
	public static void main(String[] args) {
		int[] res = TwoSum.findtwoSum(new int[]{1,3,4,5,6,9},123);
			for(int i : res){
				System.out.print(i + " ");
			}
	}
}
