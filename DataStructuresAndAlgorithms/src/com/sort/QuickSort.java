package com.sort;

import java.util.Arrays;

public class QuickSort {	
	
	
	public static void sort(int[] arr){
		sort( arr, 0, arr.length - 1 );		
	}
	
	
	private static void sort(int[] arr,int low, int high){
		if( high<= low ) return;
		int j = partition( arr, low, high);
		sort(arr,low,j-1);
		sort(arr,j+1,high);
	}
	
	
	private static int partition(int[] arr,int low, int high){
		
		int pivot = arr[low];
		
		int i = low;
		int j = high+1;
		
		while(true){
			
			while( arr[++i] < pivot )
				if(i == high) break;
			while( arr[--j] > pivot )
				if(j == low) break;
			
			//if pointers cross
			if(i >= j) break; 	
			
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		
		// Swap with the partitioning item
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j;
		
	}
	
	
	public static int kthLargestElement(int arr[],int k){
		
		int low = 0;
		int high = arr.length-1;
		
		while(high > low){
			int j = partition(arr,low,high);
			
			if( j<k ) low = j + 1;
			else if( j>k ) high = j - 1;
			else return arr[k];
		}
		
		return arr[k];
	}
	
	
	public static void main(String s[]){
		
		int arr[] = {12,8,11,5,10,7,9,-1,4,6,3,0};
		System.out.println( kthLargestElement(arr, 1));
		//sort(arr);
		//System.out.println(Arrays.toString(arr));
		
	}

}
