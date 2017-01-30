package com.practice.leetCodeBook;

public class ValidPalindrome {
	private static String res;
	public static boolean isValidPalindrome(String s){
		if(s == null || s.length() == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		
		int i = 0;
		int j = s.length() - 1;
		while(i < j){
			while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
				i++;
			}
			while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
				j--;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i))){
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args){
		res = "A man, a plan, a canal: Panama";
		System.out.println(ValidPalindrome.isValidPalindrome(res));
	}
}
