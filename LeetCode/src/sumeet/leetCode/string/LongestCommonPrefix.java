package sumeet.leetCode.string;

public class LongestCommonPrefix {

		public static String longestCommonPrefix(String[] arr){
			if(arr == null || arr.length == 0){
				return "";
			}
			
			String sub = arr[0];
			int i = 1;
			while(i < arr.length){
				
				while(arr[i].indexOf(sub) != 0){
					
					System.out.println(arr[i].indexOf(sub));
					
					sub = sub.substring(0, sub.length()-1);
					
					System.out.println(sub);
				}
				i++;
			}
			return sub;
		}
		public static void main(String args[]) {
			String x = "Sumit Summation Summit Sum";
			String[] arrA = x.split(" ");
			
			System.out.println(LongestCommonPrefix.longestCommonPrefix(arrA));
		}
}
