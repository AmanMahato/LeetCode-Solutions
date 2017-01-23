package sumeet.leetCode.string;

public class LongestIncrease {
	
	public static int longestSequence(int[] nums)
	{
		int[] lis = new int[nums.length];
		
		for(int i =0; i<lis.length; i++)
		{
			lis[i]=1;
		}
		for(int i = 1; i<nums.length; i++)
		{
			for(int j =0; j<i; j++)
			{
				if(nums[i]>nums[j] && lis[i]<lis[j]+1)
				{
					lis[i] = lis[i]+1;
				}
			}
		}
		
		int max =0;
		for(int i =0 ;i<lis.length; i++)
		{
			if(max<lis[i])
			{
				max = lis[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 22, 9, 33, 21, 50, 41, 60};
		System.out.println(longestSequence(array));

	}

}
