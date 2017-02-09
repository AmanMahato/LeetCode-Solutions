package sumeet.leetCode;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QuadCombination {
	public static List<List<Integer>> fourSum(int[] nums, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null){
			throw new IllegalArgumentException("Invalid Input");
		}
		Map<Integer, int[]> map = new HashMap<Integer, int[]>();
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				int sum = nums[i] + nums[j];
				if(!map.containsKey(sum)){
					map.put(sum, new int[]{i , j});
				}
			}
		}
		
		for(Integer key : map.keySet()){
			if(map.containsKey(target - key)){
				int[] pairA = map.get(key);
				int[] pairB = map.get(target - key);
				List<Integer> list = new ArrayList<Integer>();
				list.add(pairA[0]);
				list.add(pairA[1]);
				list.add(pairB[0]);
				list.add(pairB[1]);
				res.add(list);
				
			}
		}
	return res;
	}
	
	public static void main(String[] args) {
		System.out.println(QuadCombination.fourSum(new int[]{3,2,5,8,4,9,1}, 21));
	}
}
