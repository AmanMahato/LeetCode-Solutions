package sumeet.leetCode;

import java.util.HashMap;

public class FractionToDecimal {
	public static String fractionToDecimal(int numerator, int denominator){
		StringBuilder sb = new StringBuilder();
		
		String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
		long num = Math.abs((long) numerator);
		long den = Math.abs((long) denominator);
		
		sb.append(sign);
		sb.append(num / den);
		
		long remainder = num % den;
		
		if(remainder == 0){
			return sb.toString();
		}
		sb.append(".");
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		
		while(!map.containsKey(remainder)){
			map.put(remainder,  sb.length());
			sb.append(10 * remainder / den);
			
			System.out.println("String at each iteratio " + sb.toString());
			
			remainder = 10 * remainder % den;
			
			System.out.println("Remainder at each iteration" + remainder);
		}
		int index = map.get(remainder);
		sb.insert(index , "(");
		sb.append(")");
		return sb.toString().replace("(0)", "");
	}
	
	public static void main(String[] args) {
		System.out.println(FractionToDecimal.fractionToDecimal(2, 22));
	}
}
