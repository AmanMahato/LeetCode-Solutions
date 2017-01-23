package sumeet.leetCode;

public class SingleNumberTwo {
	public static int hasSingleNumber(int[] nums, int n ){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int ones = 0, twos = 0, threes = 0;
		for (int i = 0; i < n; i++) {
	        twos |= ones & nums[i];
	        ones ^= nums[i];
	        threes = ones & twos;
	        ones &= ~threes;
	        twos &= ~threes;
		}
	 return ones;
	}
	
	public static void main(String[] args){
		
		int[] arr = {9,9,4,9,3,4,4};
		System.out.println(SingleNumberTwo.hasSingleNumber(arr, arr.length));
	}
}
