package sumeet.leetCode.string;

import java.util.Stack;

public class LongestValidParenthesis {
    public static int longestValidParentheses(String s) {
        if(s.isEmpty() || s.length() == 0)
        {
            return 0;
        }
        Stack<Character> stack = new Stack<Character>();
        int count = s.length();
        int i =0, j = count;
        while(i<j)
        {
            if(s.charAt(i) == ')' && stack.isEmpty())
            {
                stack.push(')');
            }
            if(s.charAt(i) == '(')
            {
                stack.push('(');
            }
            if(s.charAt(i) == ')' && !stack.isEmpty() && arePair(stack.peek(), s.charAt(i)))
            {
                stack.pop();
            }
            else
            {
            	stack.push(')');
            }
            i++;
        }
        return stack.isEmpty() ? count : count-stack.size();
    }
    
    public static boolean arePair(char open , char close)
    {
        if(open == '(' && close == ')')
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
    	System.out.print(LongestValidParenthesis.longestValidParentheses(")()())"));
    }
}