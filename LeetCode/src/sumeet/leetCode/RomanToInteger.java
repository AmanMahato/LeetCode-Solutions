package sumeet.leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	private static final HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	public RomanToInteger(){
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
	
	public  int convertRomanToInteger(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		int  sum = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(i < s.length() - 1 && map.get(s.charAt(i))< map.get(s.charAt(i+1))){
				sum -= map.get(s.charAt(i));
			}
			else{
				sum += map.get(s.charAt(i));
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		RomanToInteger romanToInteger = new RomanToInteger();
		System.out.println(romanToInteger.convertRomanToInteger("DCXXI"));
	}
}
