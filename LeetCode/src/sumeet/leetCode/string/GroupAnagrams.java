package sumeet.leetCode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class GroupAnagrams {

		public static ArrayList<ArrayList<String>> groupAnagrams(String[] str){
			
			ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
			
			TreeMap<String, ArrayList<String>> map  = new TreeMap<String, ArrayList<String>>();
			
			for(String s : str){
				char[] arr = new char[26];
				for(int i = 0; i < s.length(); i++){
					arr[s.charAt(i) - 'a']++;
				}
				
				String key = new String(arr);
				
				if(map.containsKey(key)){
					map.get(key).add(s);
				}
				else {
					ArrayList<String> list = new ArrayList<String>();
					list.add(s);
					map.put(key, list);
				}
			}
			
			res.addAll(map.values());
			
			return res;
		}
		
		public static void main(String[] args){
			
			String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
			System.out.println(GroupAnagrams.groupAnagrams(str));
			
		}
}
