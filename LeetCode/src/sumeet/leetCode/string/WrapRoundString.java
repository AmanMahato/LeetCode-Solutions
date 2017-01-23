package sumeet.leetCode.string;

public class WrapRoundString {
	private static final String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	
	public static int wrapRoundString(String p){
		int count = 0;
		if(p.length() == 0){
			return 1;
		}
		for(int i = 1; i < p.length(); i++){
			for(int j = 0; j <= i; j++){
				System.out.print(p.substring(j, i) + " ");
				if(s.contains(p.substring(j, i))){
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(WrapRoundString.wrapRoundString("zab"));
	}
}
