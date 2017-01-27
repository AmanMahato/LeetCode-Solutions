package com.practice.leetCodeBook;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class EvaluateRPN {
	
	private static final HashSet<String> operators = new HashSet<String>(Arrays.asList("+","-","/","*"));
	public static int evaluateRPN(String[] tokens){
		if(tokens == null || tokens.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(String token : tokens){
			if(operators.contains(token)){
				int y = stack.pop();
				int x = stack.pop();
				stack.push(eval(x,y,token));
			}else {
				try{
					stack.push(Integer.parseInt(token));
				}catch(Exception e){
					throw new IllegalArgumentException("Invalid Input");
				}
			}
		}
		return stack.pop();
	}
	
	public static int eval(int x, int y, String operator){
		switch(operator){
		case "+" : return x + y;
		case "*" : return x * y;
		case "-" : return x - y;
		default : return x / y;
		}
	}
}
