package sumeet.leetCode;

public class SuperPower {
	public static int superPower(int a, int[] b){
		if(a == 0 || b == null){
			return 0;
		}
		long value = 0;
		for(int i = 0; i < b.length; i++){
			value = value * 10 + b[i];
		}
		System.out.println(value);
		 System.out.println(Math.pow(a, value));
		int res = (int)Math.pow(a, value) % 1337;
		return res;
	}
	public static void main(String[] args){
		System.out.println(SuperPower.superPower(2, new int[]{3,4,2,5}));
	}
}
