package sumeet.leetCode;

public class ProductOfArray {

	public static int[] productExceptItself(int[] nums){
		if(nums == null || nums.length == 0){
			return nums;
		}
		
		int[] res = new int[nums.length];
		res[res.length - 1] = 1;
		for(int i = res.length - 2; i>=0; i--){
			res[i] = res[i+1]*nums[i+1];
			System.out.print(res[i] + " ");
		}
		System.out.println();
		int left = 1;
		for(int i = 0; i < res.length; i++){
			res[i] = res[i]*left;
			System.out.print(res[i] + " ");
			left = left*nums[i];
		}
		return res;
	}
	
	public static void main(String[] args){
		
		int[] arr = {3,4,2,1};
		System.out.println(String.valueOf(ProductOfArray.productExceptItself(arr)));
		
	}
}
