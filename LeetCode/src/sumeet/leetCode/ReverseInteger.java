package sumeet.leetCode;

public class ReverseInteger {
	public static int reverseAnInteger(int n){
		int rev = 0;
		while(n != 0){
			if(Math.abs(rev) > 214748364){
				return 0;
			}
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseInteger.reverseAnInteger(786238764));
	}

}
