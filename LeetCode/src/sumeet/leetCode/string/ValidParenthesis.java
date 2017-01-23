package sumeet.leetCode.string;

import java.util.Stack;

public class ValidParenthesis {

	public static boolean arePair(char open, char close){
		if(open == '{' && close == '}')return true;
		if(open == '[' && close == ']')return true;
		if(open == '(' && close == ')')return true;
		return false;
	}
	public static boolean areValidParenthesis(String s){
		if(s == null || s.length() == 0){
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
				if(stack.isEmpty() || !arePair(stack.peek(), s.charAt(i))){
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args){
		
		System.out.println(ValidParenthesis.areValidParenthesis("([)]"));
	}
}
