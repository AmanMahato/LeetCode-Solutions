package sumeet.leetCode;

public class TwoSumSorted {
	
	public static int[] twoSum(int[] nums, int target)
	{
		int i = 0;
		int j = nums.length-1;
		while(i<=j)
		{
			if(nums[i]+nums[j] < target)
			{
				i++;
			}
			else if(nums[i]+nums[j] > target){
				j--;
			}
			else
			{
				return new int[] {i+1,j+1};
			}
		}
		throw new IllegalArgumentException("No two sum");
	}
	
	public static void main(String[] args)
	{
		int[] num = {1,3,4,5,6};
		int[] res = TwoSum.twoSum(num, 5);
		for(int i =0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
