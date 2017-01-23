package sumeet.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ThreeSum {

	public static List<ArrayList<Integer>> threeSum(int[] nums){
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(nums == null || nums.length == 0 || nums.length < 3){
			return result;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		int i = 0;
		while(i < nums.length - 2){
			int j = i + 1;
			int k = nums.length - 1;
			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == 0){
					result.add((ArrayList<Integer>) Arrays.asList(nums[i] + nums[j] + nums[k]));
				} 
				if(sum >= 0){
					while(nums[k--] == nums[k] && j < k);
				}
				if(sum <= 0){
					while(nums[j] == nums[++j] && j < k);
				}
			}
			while(nums[i] == nums[++i] && i < nums.length - 2);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
	}

}
