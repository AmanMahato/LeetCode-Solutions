package com.practice.leetCodeBook;

public class RotatedArrayTwo {
	public static int findMinimum(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid input");
		}
		int l = 0;
		int r = nums.length - 1;
		while(l < r && nums[l] >= nums[r]){
			int mid = (l + r) / 2;
			if(nums[mid] < nums[l]){
				r = mid;
			}else if(nums[mid] > nums[r]){
				l = mid + 1;
			}else {
				l = l + 1;
			}
		}
		return nums[l];
	}
	public static void main(String[] args) {
		System.out.println(RotatedArrayTwo.findMinimum(new int[]{5,6,7,1,2}));
	}
}
