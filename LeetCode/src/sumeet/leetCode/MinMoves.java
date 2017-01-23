package sumeet.leetCode;

public class MinMoves {
	public static int minMoves(int[] nums){
		if(nums.length == 0 || nums == null){
			throw new IllegalArgumentException("Invalid Input");
		}
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int n : nums){
			min = Math.min(min, n);
			sum += n;
		}
		return sum - nums.length * min;
	}
	public static void main(String[] args){
		int[] nums = {1,2,3,4,3,6};
		System.out.println(MinMoves.minMoves(nums));
	}
}
