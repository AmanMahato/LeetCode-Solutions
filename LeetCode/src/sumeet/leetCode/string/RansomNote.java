package sumeet.leetCode.string;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magzine){
		if(ransomNote.length() == 0 || magzine.length() == 0){
			return false;
		}
		int[] arr = new int[26];
		
		for(int i =0; i<magzine.length(); i++){
			arr[magzine.charAt(i) - 'a']++;
		}
		
		for(int j=0; j<ransomNote.length(); j++){
			if(--arr[ransomNote.charAt(j) -'a'] < 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		System.out.println(RansomNote.canConstruct("aaa", "aaab"));
	}
}
