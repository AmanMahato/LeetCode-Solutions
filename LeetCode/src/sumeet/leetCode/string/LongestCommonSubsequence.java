package sumeet.leetCode.string;

public class LongestCommonSubsequence {

	
	public int lcsDynamic(String s1, String s2){
		
		char[] str1= s1.toCharArray();
		char[] str2= s2.toCharArray();
		
		int[][] dp = new int[str1.length+1][str2.length+1];
		int max=0;
		
		for(int i=1;i<dp.length;i++){
			for(int j=1;j<dp[i].length;j++){
				if(str1[i-1]==str2[j-1]){
					dp[i][j]= 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
				}
				if(dp[i][j]>max){
					max=dp[i][j];
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1= "abcdfeg";
		String s2= "abndfg";

		int result= lcs.lcsDynamic(s1, s2);
		System.out.println(result);
	}
}
