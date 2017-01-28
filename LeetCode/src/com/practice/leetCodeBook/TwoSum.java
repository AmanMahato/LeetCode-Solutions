package com.practice.leetCodeBook;

import java.util.HashMap;

public class TwoSum {
	public static int[] findtwoSum(int[] nums , int target){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			int num = target - nums[i];
			if(map.containsKey(num)){
				return new int[]{map.get(num), i};
			}else{
				map.put(nums[i], i);
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int[] res = TwoSum.findtwoSum(new int[]{4,3,1,6},7);
		for(int i : res){
			System.out.print(i + " ");
		}
	}
}
