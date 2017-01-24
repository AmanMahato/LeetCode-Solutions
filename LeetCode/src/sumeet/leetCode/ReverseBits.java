package sumeet.leetCode;

public class ReverseBits {
	public static int reverseBits(int num){
		int reverse = 0;
		for(int i = 0; i < 32; i++){
			reverse <<= 1;
			if((num & 1) == 1){
				reverse++;
			}
			num >>= 1;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseBits.reverseBits(10));
	}
}
