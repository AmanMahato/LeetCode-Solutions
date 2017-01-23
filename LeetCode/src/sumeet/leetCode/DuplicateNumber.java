package sumeet.leetCode;

public class DuplicateNumber {

	public static int duplicateNumberImmutable(int[] nums){
		if(nums.length == 0 || nums == null){
			return 0;
		}
		
		int slow = 0;
		int fast = 0;
		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(slow !=fast);
		slow = 0;
		while(slow != fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
	
	public static void main(String[] args){
		int[] nums = {4,3,2,4,1};
		System.out.println(DuplicateNumber.duplicateNumberImmutable(nums));
	}
}
