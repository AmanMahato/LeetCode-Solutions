package sumeet.leetCode;

import java.util.Arrays;
import java.util.ArrayList;

public class FirstAndSecondSmall {
	
	public static ArrayList<Integer> findFirstAndSecondSmallest(int[] nums){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException();
		}
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i : nums){
			if(i < first){
				second = first;
				first = i;
			}else if(i < second && i != first ){
				second = i;
			}
		}
		return new ArrayList<Integer>(Arrays.asList(first,second));
	}
	
	public static void main(String[] args) {
		
		int[] nums = {4,5,3,7,1};
		System.out.println(FirstAndSecondSmall.findFirstAndSecondSmallest(nums));
	}
}
