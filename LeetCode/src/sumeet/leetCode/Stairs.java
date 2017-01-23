package sumeet.leetCode;

public class Stairs {

	public static void main(String[] args)
	{
		int n = climbStairs(8);
		System.out.println(n + " ");
	}
	
	public static int climbStairs(int n)
	{
		int[] ways =new int[n+1];
		
				if(n<=2)
				{
					ways[n] = n; 
				}
				else if(ways[n] > 0)
				{
				return ways[n];
				}
				else 
				{
					ways[n] = climbStairs(n-1) + climbStairs(n-2);
				}
		
			return ways[n];
	}
	
	
}
