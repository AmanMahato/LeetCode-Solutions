package sumeet.leetCode.string;

import java.util.ArrayList;
import java.util.Arrays;

public class WordSearch {
	public static boolean wordSearch(String s , ArrayList<String> wordDict){
		if(s == null || s.length() == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		boolean[] res = new boolean[s.length() + 1];
		res[0] = true;
		for(int i = 1; i <= s.length(); i++){
			for(int j = 0; j < i; j++){
				if(res[j] && wordDict.contains(s.substring(j,i))){
					res[i] = true;
					break;
				}
			}
		}
		return res[s.length()];
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("leet");
		list.add("code");
		list.add("lee");
		System.out.println(WordSearch.wordSearch("leetcode", list));
	}
}
