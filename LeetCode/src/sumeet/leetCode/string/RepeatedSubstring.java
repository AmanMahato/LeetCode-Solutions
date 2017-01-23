package sumeet.leetCode.string;

public class RepeatedSubstring {
     	
		public static boolean repeatedSubstringPattern(String s){
			if(s == null || s.length() == 0){
				return false;
			}
			
			int l = s.length();
			/*
			 * For a string to formed by its substring the length of substring should be a the factor of the 
			 * length of the original string
			 * 
			 * for every string with length equals half the length of original string and less. 
			 * check if they form the original string by appending the substring
			 */
			for(int i = l/2; i >= 1; i--){
				if(l % i == 0){
					int m = l / i;
					String sub = s.substring(0,i);
					StringBuilder sb = new StringBuilder();
					for(int j = 0; j < m; j++){
						sb.append(sub);
					}
					if(sb.toString().equals(s)){
						return true;
					}
				}
			}
			return false;
		}
		
		public static void main(String[] args){
			
			System.out.println(RepeatedSubstring.repeatedSubstringPattern("aaabaaabaaa"));
			
		}
}
