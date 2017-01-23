package sumeet.leetCode;

public class PalindromeNumber {
	public static boolean isValidPalindrome(int n){
		if(n < 0){
			return false;
		}
		
		int div = 1;
		while(n/div >=10){
			div *=10;
		}
		
		while(n!=0){
			int l = n / div;
			int r = n % 10;
			if(l != r){
				return false;
			}
			n = (n%div) / 10;
			div /= 100;
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(PalindromeNumber.isValidPalindrome(123454321));
	}
}
