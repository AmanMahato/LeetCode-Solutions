package sumeet.leetCode.dynamicProgramming;

public class EditDistance {
	
	@SuppressWarnings("unused")
	public static int minimumEditDistance(String s1, String s2){
		int m = s1.length();
		int n = s2.length();
		
		if(s1 == null)
			return n;
		if(s2 == null)
			return m;
		
		int[][] res = new int[m+1][n+1];
		
		for(int i =0; i< n; i++){
			res[0][i] = i;
		}
		
		for(int j = 0; j < m; j++){
			res[j][0]  = j;
		}
		
		for(int i = 1; i<= m; i++){
			for(int j = 1; j<= n; j++){
				
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					res[i][j] = res[i-1][j-1];
				}
				else{
					res[i][j] = 1 + Math.min(Math.min(res[i-1][j], res[i-1][j-1]), res[i][j-1]);
				}
				
			}
		}
		return res[m][n];
	}
	
	
	public static void main(String[] args){
		
		System.out.println(EditDistance.minimumEditDistance("sumeet", "samrrt"));
	}
}
