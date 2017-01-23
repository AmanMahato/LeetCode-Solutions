package sumeet.leetCode;

public class ValidPalindrome {
	
	public static boolean isValidPalindrome(String s)
	{
		if(s== null)
		{
			return false;
		}
		
		int i = 0;
		int j = s.length() - 1;
		
		while(i<j){
			
			while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
				j--;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(ValidPalindrome.isValidPalindrome(s));
	}

}
