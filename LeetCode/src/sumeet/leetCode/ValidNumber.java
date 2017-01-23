package sumeet.leetCode;

public class ValidNumber {
	public static boolean isNumber(String s) throws IllegalArgumentException{
		if(s == null || s.length() == 0){
			throw new IllegalArgumentException("Not valid input");
		}
		int i =0, n = s.length()-1;
		//Ignore the white spaces if any between the string 
		while(i<n && Character.isWhitespace(s.charAt(i))){
			i++;
		}
		// if the string contains the + or - char continue
		if(i<n && s.charAt(i) == '+' || s.charAt(i) == '-'){
			i++;
		}
		boolean isNumeric = false;
		while(i<n && Character.isDigit(s.charAt(i))){
			i++;
			isNumeric = true;
		}
		//Check for the decimal seprator   
		if(i<n && s.charAt(i) == '.'){
			i++;
			while(i<n && Character.isDigit(s.charAt(i))){
				i++;
				isNumeric = true;
			}
		}
		// To validate the exponent of a number
		if(i<n && s.charAt(i) == 'e'){
			i++;
			isNumeric = false;
			while(i<n && Character.isDigit(s.charAt(i))){
				i++;
				isNumeric = true;
			}
		}
		while(i<n && Character.isWhitespace(s.charAt(i))){
			i++;
		}
		return isNumeric && i == n;
	}
	public static void main(String[] args){
		System.out.println(ValidNumber.isNumber("1e10"));
	}
}
