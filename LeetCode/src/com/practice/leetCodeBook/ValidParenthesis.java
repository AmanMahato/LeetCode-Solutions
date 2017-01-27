package com.practice.leetCodeBook;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
	
	private static final HashMap<Character, Character> map = new HashMap<Character,Character>(){{
		put('(',')');
		put('[',']');
		put('{','}');
	}};
	
	public static boolean areValidParenthesis(String s){
		if(s == null || s.length() == 0){
			throw new IllegalArgumentException("invalid Input");
		}
		Stack<Character> stack = new Stack<Character>();
		for(char c : s.toCharArray()){
			if(map.containsKey(c)){
				stack.push(c);
			}else if(stack.isEmpty() || map.get(stack.pop()) != c){
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		System.out.println(ValidParenthesis.areValidParenthesis("({({)})"));
	}
}
