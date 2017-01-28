package com.practice.leetCodeBook;

public class IntegerToRoman {
	
	private static final int[] values = {
			   1000, 900, 500, 400,
			   100,  90,  50,  40,
			   10,   9,   5,   4,
			1 };
			private static final String[] symbols = {
			   "M", "CM", "D", "CD",
			   "C", "XC", "L", "XL",
			   "X", "IX", "V", "IV",
			"I"
			};
			
	public static String integerToRoman(int num){
		if(num == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int i = 0;
		StringBuilder roman = new StringBuilder();
		while(num > 0){
			int k = num / values[i];
			for(int j = 0; j < k; j++){
				roman.append(symbols[i]);
				num = num - values[i];
			}
			i++;
		}
		return roman.toString();
	}
	public static void main(String[] args) {
		System.out.println(IntegerToRoman.integerToRoman(30));
	}
}
