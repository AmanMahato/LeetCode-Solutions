package sumeet.leetCode;

import java.util.ArrayList;

public class Set {

	public static ArrayList<ArrayList<Integer>> powerSet(int[] nums)
	{
		if(nums == null || nums.length ==0 )
		{
			return null;
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		result.add(new ArrayList<Integer>());
		for(int num : nums)
		{
			int size = result.size();
			
			for(int i=0; i< size; i++)
			{
				ArrayList<Integer> newlist = new ArrayList<Integer>();
				newlist.addAll(result.get(i));
				//System.out.print(newlist + " ");
				newlist.add(num);
				//System.out.print(newlist + " ");
				result.add(newlist);
				//System.out.print(result + " ");
			}

		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,4};
		System.out.println(powerSet(nums));
		String s = "   sumee t";
		s.trim();
		System.out.println(s);
		
		
	}

}
