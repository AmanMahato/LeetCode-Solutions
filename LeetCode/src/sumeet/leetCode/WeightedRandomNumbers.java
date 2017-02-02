package sumeet.leetCode;

import java.util.Random;

public class WeightedRandomNumbers {
	
	static Random rd = new Random();
	public static int getWeightedRandomNumbers(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int weight = 0;
		for(int i : nums){
			weight += i;
		}
		int randomNumber = rd.nextInt(weight);
		int sum = 0;
		for(int w : nums){
			sum += w;
			if(randomNumber < sum){
				return w;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		WeightedRandomNumbers rdm = new WeightedRandomNumbers();
		int[] nums = {1,2,3,3,4,7};
		System.out.println(rdm.getWeightedRandomNumbers(nums));
		System.out.println(rdm.getWeightedRandomNumbers(nums));
	}
}
