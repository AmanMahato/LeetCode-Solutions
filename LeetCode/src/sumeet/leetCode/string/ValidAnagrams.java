package sumeet.leetCode.string;

public class ValidAnagrams {

	public static boolean areValidPermutations(String s, String t){
		
		if(s.length() != t.length()){
			return false;
		}
		
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++){
			arr[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < s.length(); i++){
			if(arr[t.charAt(i) - 'a'] < 0){
				return false;
			}
			arr[t.charAt(i) - 'a']--;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		System.out.println(ValidAnagrams.areValidPermutations("umt", "eem"));
	}
}
