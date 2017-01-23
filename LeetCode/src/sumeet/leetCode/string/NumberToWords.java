package sumeet.leetCode.string;

public class NumberToWords {

	private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
	
	
		public static String getWords(int num){
			 if (num == 0)
			        return "";
			    else if (num < 20)
			        return LESS_THAN_20[num] + " ";
			    else if (num < 100)
			        return TENS[num / 10] + " " + getWords(num % 10);
			    else
			        return LESS_THAN_20[num / 100] + " Hundred " + getWords(num % 100);
		}
		
		public static String numberToWords(int num){
			if (num == 0) return "Zero";

		    int i = 0;
		    String words = "";
		    
		    while (num > 0) {
		        if (num % 1000 != 0){
		    	    words = getWords(num % 1000) +THOUSANDS[i] + " " + words;   
		        }
		    	num /= 1000;
		    	i++;
		    }
		    
		    return words.trim();
		}
		
		public static void main(String[] args){
			
			System.out.println(NumberToWords.numberToWords(11111));
		}
}
