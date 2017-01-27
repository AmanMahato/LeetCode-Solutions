package com.practice.leetCodeBook;

public class RotatedArray {
	public static int findMinimum(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int l = 0, r = nums.length - 1;
		while(l < r && nums[l] >= nums[r]){
			int mid = (l + r) / 2;
			if(nums[mid] > nums[r]){
				l = mid + 1;
			}else if(nums[l] > nums[mid]){
				r = mid;
			}
		}
		return nums[l];
	}
	public static void main(String[] args) {
		System.out.println(RotatedArray.findMinimum(new int[]{5,6,7,2,3}));
	}
}
