package sumeet.leetCode.string;

public class Atoi {
	
	private static final int maxDiv10 = Integer.MAX_VALUE/10; // Maximum value to check the overflow.
	
	public static int stringTointeger(String s){
		
		int i = 0;
		int j = s.length()-1;
		
		while(i<j && Character.isWhitespace(s.charAt(i))){
			i++;
		}
		int sign = 1;
		if(i<j && s.charAt(i) == '-'){  // Assign the sign of the number negative if first char in the string is '-'
			sign = -1;
			i++;
		}
		if(i<j && s.charAt(i) == '+'){  // Sign is 1 if the first char is '+'.
			i++;
		}
		int num = 0;
		while(i<=j && Character.isDigit(s.charAt(i))){
			int digit = Character.getNumericValue(s.charAt(i));
			System.out.println(digit);
			if(num > maxDiv10 || num == maxDiv10 && digit == 8 ){ // check for overflow.
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			num = num*10 + digit;
			i++;
		}
		return sign*num;
	}
	
	public static void main(String[] args){
		
		System.out.println(Atoi.stringTointeger("-2247483648"));
	}

}
