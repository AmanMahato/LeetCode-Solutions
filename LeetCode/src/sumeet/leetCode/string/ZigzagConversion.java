package sumeet.leetCode.string;

public class ZigzagConversion {

	public static String zigzagConversion(String s, int numRows){
		if(s == null || s.length() <= 1){
			return s;
		}
		StringBuilder sb = new StringBuilder();
		
		int step = 2 * numRows - 2;
		
		for(int i = 0; i < numRows; i++){
			//For 0 and last row we append the characters at the step count
			if(i == 0 || i == numRows - 1){
				for(int j = i; j < s.length(); j += step){
					sb.append(s.charAt(j));
				}
			}else {
				int j = i;
				boolean flag = true;
				int step1 = 2 * (numRows - 1 - i);
				int step2 = step - step1;
				while(j < s.length()){
					sb.append(s.charAt(j));
					if(flag){
						j += step1;
					}else{
						j += step2;
					}
					flag = !flag;
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		
		System.out.println(ZigzagConversion.zigzagConversion("PAYPALISHIRING", 3));
	}
}
