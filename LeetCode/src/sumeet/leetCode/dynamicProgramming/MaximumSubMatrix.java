package sumeet.leetCode.dynamicProgramming;

public class MaximumSubMatrix {

	public static int maximumSubMatrixSize(int[][] arrA){
		
		int row = arrA.length;
		int cols = arrA[0].length;
		int[][] sub = new int[row][cols];
		// copy the first row
		for (int i = 0; i < cols; i++) {
			sub[0][i] = arrA[0][i];
		}
		// copy the first column
		for (int i = 0; i < row; i++) {
			sub[i][0] = arrA[i][0];
		}

		// for rest of the matrix
		// check if arrA[i][j]==1
		int maxSize = Integer.MIN_VALUE;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < cols; j++) {
				if (arrA[i][j] == 1) {
					sub[i][j] = Math.min(sub[i - 1][j - 1],
							Math.min(sub[i][j - 1], sub[i - 1][j])) + 1;
					if(sub[i][j] > maxSize){
						maxSize = sub[i][j];
					}
				} else {
					sub[i][j] = 0;
				}
			}
}
		return maxSize;
	}
	
	public static void main(String [] args){
		
		int[][] arr = {{ 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
					   { 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
					   { 1, 1, 1, 1, 1, 1 }};
		
		System.out.println(MaximumSubMatrix.maximumSubMatrixSize(arr));
	}
	
}
