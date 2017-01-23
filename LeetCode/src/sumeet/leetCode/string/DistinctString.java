package sumeet.leetCode.string;

import java.util.Arrays;

public class DistinctString {
	public static int longestSubstringWRC(String s) throws IllegalArgumentException{
		if(s == null || s.length() == 0){
			
		}
		int[] charMap = new int[256];
		   Arrays.fill(charMap, -1);
		   int i = 0, maxLen = 0;
		   for (int j = 0; j < s.length(); j++) {
		      if (charMap[s.charAt(j)] >= i) {
		         i = charMap[s.charAt(j)] + 1;
		      }
		      charMap[s.charAt(j)] = j;
		      maxLen = Math.max(j - i + 1, maxLen);
		}
		   return maxLen;
	}
	
	public static void main(String[] args){
		System.out.println(DistinctString.longestSubstringWRC("abaabcdbge"));
	}
}
