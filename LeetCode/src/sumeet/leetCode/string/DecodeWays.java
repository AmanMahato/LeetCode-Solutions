package sumeet.leetCode.string;

public class DecodeWays {
		
	public static int numberOfWays(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		
		int n = s.length();
		int[] res = new int[n+1];
		
		res[n] = 1;
		res[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
		
		for(int i = n-2; i >= 0; i--){
			if(s.charAt(i) == '0'){
				continue;
			}
			else{
				res[i] = (Integer.parseInt(s.substring(i,i+2)) <= 26) ? res[i+1] + res[i+2] : res[i+1];
			}
		}
		return res[0];
	}
	
	public static void main(String[] args){
		System.out.println(DecodeWays.numberOfWays("123123"));
	}
}
