package com.searchingandsorting;

public class InsertionSort {
	/*public static void insertionSort(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int smallerIndex = 0;
		for(int i = 1; i < nums.length; i++){
			smallerIndex = i;
			for(int j = 0; j < i; j++){
				if(nums[j] > nums[smallerIndex]){
					swap(nums, j,smallerIndex);
				}
			}
		}
	}
	public static void swap(int[] nums, int a, int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}*/
	
	public static void insertionSort(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		for(int j = 1; j < nums.length; j++){
			int key = nums[j];
			int i = j - 1;
			while(i >= 0 && nums[i] > key){
				nums[i + 1] = nums[i];
				i = i - 1;
			}
			nums[i + 1] = key;
		}
	}
	public static void main(String[] args){
		int[] nums = {123,32,41,1,2,100};
		InsertionSort.insertionSort(nums);
		for(int i : nums){
			System.out.print(i + " ");
		}
	}
}
