package sumeet.leetCode;

public class ConstructRectangle {
	public static int[] constructRectangle(int area){
		if(area == 0){
			return null;
		}
		int w = (int)Math.sqrt(area);
		while(area % w != 0){
			w--;
		}
		return new int[]{area / w, w};
	}
	
	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args){
		print(ConstructRectangle.constructRectangle(54));
	}
}
