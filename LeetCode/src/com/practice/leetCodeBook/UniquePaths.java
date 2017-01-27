package com.practice.leetCodeBook;

public class UniquePaths {
	public static int findUniquePaths(int m , int n){
		int[][] res = new int[m + 1][n + 1];
		res[m - 1][n] = 1;
		for(int r = m -1; r >= 0; r--){
			for(int c = n - 1; c >= 0; c--){
				res[r][c] = res[r][c + 1] + res[r + 1][c];
			}
		}
		return res[0][0];
	}
	public static void main(String[] args) {
		System.out.println(UniquePaths.findUniquePaths(3, 7));
	}
}
