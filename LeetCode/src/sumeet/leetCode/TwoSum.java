package sumeet.leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++)
		{
			int x = nums[i];
			if(map.containsKey(target - x))
			{
				return new int[]{map.get(target-x) + 1, i+1};
			}
			map.put(x, i);
			
		}
		//return nums;
		throw new IllegalArgumentException("No two sum");
	}
	
	public static void main(String[] args)
	{
		int[] num = {4,3,5,6,1};
		int[] res = TwoSum.twoSum(num, 5);
		for(int i =0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
