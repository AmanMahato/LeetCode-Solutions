package sumeet.leetCode.string;

public class LongestString {

	public static int stringwoRepeatingChar(String s) throws IllegalArgumentException{
		boolean[] exist = new boolean[256];
		   int i = 0, maxLen = 0;
		   for (int j = 0; j < s.length(); j++) {
		      while (exist[s.charAt(j)]) {     // if the char is already present int the char array make all the 
		         exist[s.charAt(i)] = false;   // positions before the char false int  the boolean array 
		         i++;
		      }
		      exist[s.charAt(j)] = true;
		      maxLen = Math.max(j - i + 1, maxLen);  // 
		}
		   return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LongestString.stringwoRepeatingChar("ajshsddkhs"));
	}

}
