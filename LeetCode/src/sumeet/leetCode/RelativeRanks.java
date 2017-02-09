package sumeet.leetCode;

import java.util.Map;
import java.util.TreeMap;

public class RelativeRanks {
	public static String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        if(nums == null || nums.length == 0){
            return res;
        }
        
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }
        int count = nums.length;
        for(Integer key : map.keySet()){
            int k = (int)key;
            int index = (int)map.get(key);
            if(count == 3){
                res[index] = "Bronze Medal";
                
            }
            if(count == 2){
                res[index] = "Silver Medal";
                
            }
            if(count == 1){
                res[index] = "Gold Medal";
                
            }
            if(count > 3){
                res[index] = count + "";
        
            }
            count--;
        }
       return res; 
    }
	public static void main(String[] args) {
		String[] res = RelativeRanks.findRelativeRanks(new int[]{10,3,8,9,4});
		for(String s : res){
			System.out.print(s + " ");
		}
	}
}
