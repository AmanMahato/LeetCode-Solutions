package sumeet.leetCode.string;

public class LongestWithTwoRepeating {
	
	public static int longestWithTwoRepeating(String s){
		if(s == null || s.length() == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int count[] = new int[256];
		int i = 0;
		int numberOfDistincts = 0;
		int maxLen = 0;
		for(int j = 0; j < s.length(); j++){
			if(count[s.charAt(j) ] == 0){
				numberOfDistincts++;
			}
			count[s.charAt(j)]++;
			while(numberOfDistincts > 2){
				count[s.charAt(i)]--;
				if(count[s.charAt(i)] == 0){
					numberOfDistincts--;
				}
				i++;
			}
			maxLen = Math.max(j - i + 1, maxLen);
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		System.out.println(LongestWithTwoRepeating.longestWithTwoRepeating("eecba"));
	}
}
