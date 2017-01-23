package sumeet.leetCode;

public class MajorityELement {

	public static int majorityElement(int[] nums){
		int majority_index = 0;
		int count = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[majority_index] == nums[i]){
				count ++;
			}
			else {
				count--;
			}
			if(count == 0){
				majority_index = i;
				count = 1;
			}
		}
		return nums[majority_index];
	}
	
	public static boolean hasMajorityElement(int[] nums){
		int element = majorityElement(nums);
		int count = 1;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == element ){
				count++;
			}
		}
		return count > nums.length / 2;
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,3};
		System.out.println(MajorityELement.hasMajorityElement(nums));
	}
}
