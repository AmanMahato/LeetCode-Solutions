package sumeet.leetCode.dynamicProgramming;

public class MinNumberCoins {
	public static int minNumberCoins(int[] coins, int amount){
		if(amount<1) return 0;
	    int[] dp = new int[amount+1];
	    int sum = 0;
	    
		while(++sum<=amount) {
			int min = -1;
	    	for(int coin : coins) {
	    		if(sum >= coin && dp[sum-coin]!=-1) {
	    			int temp = dp[sum-coin]+1;
	    			min = min<0 ? temp : (temp < min ? temp : min);
	    		}
	    	}
	    	dp[sum] = min;
		}
		return dp[amount];
	}
	public static void main(String[] args) {
		System.out.println(MinNumberCoins.minNumberCoins(new int[]{1,2,5},11));
	}
}
