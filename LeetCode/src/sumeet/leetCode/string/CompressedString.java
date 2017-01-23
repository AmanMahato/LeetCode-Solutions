package sumeet.leetCode.string;

public class CompressedString {

	public static String compressedString(String s){
		if(s == null || s.length() == 0){
			return "";
		}
		StringBuilder compressedString = new StringBuilder();
		int countConsecutive = 0;
		
		for(int i = 0; i < s.length(); i++){
			countConsecutive ++;
			
			if(i < s.length() -1  && s.charAt(i) != s.charAt(i+1)){
				compressedString.append(countConsecutive);
				compressedString.append(s.charAt(i));
				countConsecutive = 0;
			}
		}
		compressedString.append(countConsecutive);
		compressedString.append(s.charAt(s.length() - 1));
		return s.length() < compressedString.toString().length() ? s : compressedString.toString();
	}
	
	public static void main(String[] args){
		
		System.out.println(CompressedString.compressedString("aaaae"));
	}
}
