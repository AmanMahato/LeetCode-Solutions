package sumeet.leetCode;

public class MissingNumber {
	
	public static int missingNumber(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException();
		}
		int x1 = nums[0];
		int x2 = 1;
		for(int i = 1; i < nums.length; i++){
			x1 = x1 ^ nums[i];
		}
		for(int i = 2; i <= nums.length + 1; i++){
			x2 = x2 ^ i;
		}
		return x1 ^ x2;
	}
	public static void main(String[] args){
		int[] nums = {1,2,4};
		System.out.println(MissingNumber.missingNumber(nums));
	}
}
