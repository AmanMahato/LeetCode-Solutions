package com.practice.leetCodeBook;

public class RomanToInteger {
	public static int getValue(char c){
		switch(c){
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		default : return 1000;
		}
	}
		
	public static int romanToInteger(String roman){
		if(roman == null || roman.length() == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int sum = 0;
		for(int j = 0; j < roman.length(); j++){
			if(j < roman.length() - 1 && roman.charAt(j + 1) > roman.charAt(j)){
				sum -= getValue(roman.charAt(j ));
			}else {
				sum += getValue(roman.charAt(j));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(RomanToInteger.romanToInteger("IVI"));
	}
}
