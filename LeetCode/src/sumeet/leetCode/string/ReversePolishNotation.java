package sumeet.leetCode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {

	private static final Set<String> set = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));
	
	
	public static int evaluateRPN(String[] tokens) throws IllegalArgumentException{
		if(tokens == null || tokens.length == 0){
			throw new IllegalArgumentException();
		}
		Stack<Integer> s = new Stack<Integer>();
		for(String token : tokens){
			if(set.contains(token)){
				int y = s.pop();
				int x = s.pop();
				s.push(eval(x,y,token));
			}
			else {
				try{
					s.push(Integer.parseInt(token));
				}catch(Exception e){
					throw new IllegalArgumentException();
				}
			}
		}
		return s.pop();
	}
	
	public static int eval(int x , int y , String token){
		switch(token){
		case "+" : return x + y;
		case "*" : return x * y;
		case "/" : return x / y;
		default : return x - y;
		}	
	}
	
	public static void main(String[] args){
		
		String[] tokens = {"2", "4", "+", "-1", "*"};
		System.out.println(ReversePolishNotation.evaluateRPN(tokens));
	}
}
