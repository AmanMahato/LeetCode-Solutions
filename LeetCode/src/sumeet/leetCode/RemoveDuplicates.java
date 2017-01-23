package sumeet.leetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
        	int index = Math.abs(nums[i]);
        	if(nums[index - 1] > 0){
        		nums[index - 1] = - nums[index - 1];
        	}
        	else{
        		list.add(Math.abs(nums[i]));
        	}
        }
        
        return list;
    }
	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		
		System.out.println(RemoveDuplicates.findDuplicates(nums));
	}
}
