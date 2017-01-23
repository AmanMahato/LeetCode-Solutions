package sumeet.leetCode.string;

public class CountSay {

		public static String countAndSay(int n){
			
			if(n <= 0){
				return null;
			}
			
			String res = "1";
			int i = 0;
			while(i < n){
				int count = 1;
				StringBuilder sb = new StringBuilder();
				
				for(int j = 1; j < res.length(); j++){
					if(res.charAt(j) == res.charAt(j-1)){
						count++;
					}
					else{
						sb.append(count);
						sb.append(res.charAt(j-1));
						count = 1;
					}	
				}
				sb.append(count);
				sb.append(res.charAt(res.length()-1));
				res = sb.toString();
				i++;
			}
			return res;
		}
		
		public static void main(String[] args){
			System.out.println(CountSay.countAndSay(3));
		}
}
