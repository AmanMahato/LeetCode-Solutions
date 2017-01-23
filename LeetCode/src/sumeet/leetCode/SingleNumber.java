package sumeet.leetCode;

public class SingleNumber {
	
	public static int hasSingleNumebr(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int singleNumber = 0;
		for(int i : nums){
			singleNumber ^= i;
		}
		return singleNumber;
	}
	
	public static void main(String[] args){
		
		int[] nums = {2,2,2,2,5,3,3,3,3,4,4};
		System.out.println(SingleNumber.hasSingleNumebr(nums));
	}
}
