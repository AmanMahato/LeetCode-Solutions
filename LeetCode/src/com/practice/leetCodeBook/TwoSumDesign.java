package com.practice.leetCodeBook;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDesign {
		
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void add(int value){
		if(map.containsKey(value)){
			map.put(map.get(value), map.get(value) + 1);
		}else {
			map.put(value, 1);
		}
	}
	
	public static boolean hasTarget(int target){
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int val = entry.getKey();
			int k = target - val;
			if(k == val){
				if(entry.getValue() >= 2){  // Check for Duplicates //
					return true;
				}
			}else{
				if(map.containsKey(k)){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		TwoSumDesign.add(3);
		TwoSumDesign.add(4);
		TwoSumDesign.add(9);
		System.out.println(TwoSumDesign.hasTarget(13));
	}
}
