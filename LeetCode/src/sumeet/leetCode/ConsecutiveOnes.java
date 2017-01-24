package sumeet.leetCode;

public class ConsecutiveOnes {
	 public static int findMaxConsecutiveOnes(int[] nums) {
	        if(nums == null || nums.length == 0){
	             return 0;
	         }   
	         int countOnes = 0;
	         int max = 0;
	         for(int one : nums){
	             if(one == 1){
	                 countOnes++;
	                 max = Math.max(countOnes, max);
	             }else{
	                 countOnes = 0;
	             }
	         }
	         return max;
	    }
	 public static void main(String[] args) {
		System.out.println(ConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,1}));
	}
}
