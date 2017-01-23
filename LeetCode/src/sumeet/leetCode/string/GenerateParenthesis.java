package sumeet.leetCode.string;

import java.util.List;
import java.util.ArrayList;

public class GenerateParenthesis {
	
	private static ArrayList<String> generateParenthesis(int  n)
	{
		ArrayList<String> list = new ArrayList<String>();
		if(n ==0)
		{
			return list;
		}
		String s = "";
		dfs(list,s,n,n);
		return list; 
		
	}
	private static void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	    	
	        result.add(s);
	        return;
	    }
	
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = GenerateParenthesis.generateParenthesis(3);
		System.out.println(list);
	}

}
