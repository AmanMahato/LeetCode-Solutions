package com.practice.leetCodeBook;

public class SearchInsertPosition {
	public static int searchInsertPosition(int[] nums, int target){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int l = 0, r = nums.length - 1;
		while(l < r){
			int mid = (l + r) / 2;
			if(nums[mid] < target){
				l = mid + 1;
			}else {
				r = mid;
			}
		}
		return nums[l] < target ? l + 1 : l;
	}
	public static void main(String[] args) {
		System.out.println(SearchInsertPosition.searchInsertPosition(new int[]{2,3,4,6,7}, 3));
	}
}
