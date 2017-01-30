package sumeet.leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public static String findLargestNumberPossible(int[] nums){
if (nums == null || nums.length == 0) return "";
        
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        
        Comparator<String> comp = new Comparator<String>(){
        	@Override
        	public int compare(String i , String j){
        		String s1 = i + j;
        		String s2 = j + i;
        		return s1.compareTo(s2);
        	}
        };
        
        Arrays.sort(strs,comp);
        
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        return res;
	}
	
	public static void main(String[] args) {
		System.out.println(LargestNumber.findLargestNumberPossible(new int[]{9,5,99}));
	}
}
