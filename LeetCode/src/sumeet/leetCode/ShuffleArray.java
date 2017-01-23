package sumeet.leetCode;

import java.util.Random;

public class ShuffleArray {

	private int[] nums;
	private Random rd;
	
	public ShuffleArray(int[] nums){
		this.nums = nums;
		this.rd = new Random();
	}
	
	public int[] reset(){
		return nums;
	}
	
	
	public void shuffledArray(){
		int[] res = nums.clone();
		int len = res.length;
		for(int i = 0; i < res.length; i++){
			int randomIndex = i + rd.nextInt(len-i);
			int t = res[i];
				res[i] = res[randomIndex];
				res[randomIndex] = t;
		}
		for(int i : res)
			System.out.print(i + " ");
	}
	
	
	public static void main(String[] args){
		
		int[] nums = {1,2,3}; 
		
		ShuffleArray sf = new ShuffleArray(nums);
		
		sf.shuffledArray();
		System.out.println();
		sf.shuffledArray();
		sf.shuffledArray();
		
	}
	
	
}
