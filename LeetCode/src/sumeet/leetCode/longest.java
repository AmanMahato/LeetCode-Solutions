package sumeet.leetCode;

public class longest {
	public static String longestPalindrome(String s) {
        if(s==null || s.length() == 1)
        {
            return s;
        }
        
        String longest = s.substring(0,1);
        System.out.println(longest);
        for(int i =0; i<s.length(); i++)
        {
            String temp = helper(s,i,i);
            if(temp.length()>longest.length())
            {
                longest = temp;
                System.out.println(longest);
            }
            
            temp = helper(s,i,i+1);
            if(temp.length()>longest.length())
            {
                longest = temp;
                System.out.println(longest);
            }
        }
        return longest;
    }
    
    private static String helper(String s, int begin, int end)
    {
        if(begin>=0 && end<=s.length()-1 && s.charAt(begin) == s.charAt(end))
        {
            begin--;
            end++;
        }
        return s.substring(begin+1,end);
    }
    
    public static void main(String[] args)
    {
    	System.out.print(longest.longestPalindrome("babad"));
    }
}
