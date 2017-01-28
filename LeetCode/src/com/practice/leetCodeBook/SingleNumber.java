package com.practice.leetCodeBook;

public class SingleNumber {
	public static int findSingleNumber(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int num = 0;
		for(int x : nums){
			num = num ^ x;
		}
		return num; 
	}
	public static void main(String[] args) {
		System.out.println(SingleNumber.findSingleNumber(new int[]{4,4,3,2,3,2,9}));
	}
}
