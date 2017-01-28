package com.practice.leetCodeBook;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static ArrayList<Integer> printSpiralMatrix(int[][] matrix){
		if(matrix == null){
			throw new IllegalArgumentException("Invalid Input");
		}	
			ArrayList<Integer> list = new ArrayList<Integer>();
	        if(matrix.length==0){
	            return list;
	        }
	        int b=matrix.length-1,l=0,t=0,r=matrix[0].length-1;
	        int dir=0;
	        while(t<=b && l<=r){
	            if(dir==0){
	                for(int k=l;k<=r;k++){
	                    list.add(matrix[t][k]);
	                }
	                t++;
	            }
	            else if(dir==1){
	                for(int k=t;k<=b;k++){
	                    list.add(matrix[k][r]);
	                }
	                r--;
	            }
	            else if(dir==2){
	                for(int k=r;k>=l;k--){
	                    list.add(matrix[b][k]);
	                }
	                b--;
	            }
	            else if(dir==3){
	                for(int k=b;k>=t;k--){
	                    list.add(matrix[k][l]);
	                }
	                l++;
	            }
	            dir=(dir+1)%4;
	        }
	        return list;
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12},
				  {13,14,15,16},};
		ArrayList<Integer> list = SpiralMatrix.printSpiralMatrix(matrix);
		for(Integer num : list){
			System.out.print(num + " ");
		}
	}
}
