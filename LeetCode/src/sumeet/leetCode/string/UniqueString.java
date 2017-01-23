package sumeet.leetCode.string;

public class UniqueString {

	public static boolean isUnique(String s){
		if(s == null || s.length() == 0){
			return false;
		}
		
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++){
			if(arr[s.charAt(i) - 'a'] >= 1){
				return false;
			}
			arr[s.charAt(i) - 'a']++;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		System.out.println(UniqueString.isUnique("susmet"));
	}
}
