package com.searchingandsorting;

public class QuickSort {

	public static void main(String[] args){
		int[] array = {3,1,2,5,4};
		quickSort(array);
		for(int i : array){
			System.out.print(i + " ");
		}
	}
	
	public static void quickSort(int[] array){
		quickSort(array, 0, array.length - 1);
	}
	
	public static void quickSort(int[] array, int startIndex, int endIndex){
		if(startIndex < endIndex){
			int partitionIndex = partition(array, startIndex, endIndex);
			quickSort(array, startIndex, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, endIndex);
		}
	}
	
	public static int partition(int[] array, int startIndex, int endIndex){
		int pivot = endIndex;
		int pIndex = startIndex;
		for(int i = startIndex; i < endIndex; i++){
			if(array[i] <= array[pivot]){
				swap(array,i,pIndex);
				pIndex++;
			}
		}
		swap( array, pivot, pIndex);
		return pIndex;
	}
	
	private static void swap(int[] nums, int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
