package sumeet.leetCode.dynamicProgramming;

public class Fibonacci {
		
/*
 * Bottom up approach when there are n things to be solved we start from 0 and go till n 
 */
	public static int nthFibonacci(int n){
		if(n<0){
			return 0;
		}
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i <= n; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}
	
	public static void main(String[] args){
		
		System.out.println(Fibonacci.nthFibonacci(5));
	}
}
