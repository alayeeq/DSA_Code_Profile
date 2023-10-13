package Recursion;

import java.util.*;

import org.junit.Test;

public class BubbleSort {
	
	
	@Test
	public void test1() {
		
		int [] arr = {2,5,6,1};
		
		int iterations= arr.length;
		
		System.out.println(Arrays.toString(bubbleSort(arr, iterations)));
		
		
		
		
	}

	private int [] bubbleSort(int[] arr, int iterations) {
		// TODO Auto-generated method stub
		
		
		if (iterations<=1) return arr; 
		int index = arr.length-iterations;
		return bubbleSort(arr,iterations, index );
		
		
	}
			//bubbleSort({2,5,6,1},4, 0 )  -> {2,5,1,6} -> {2,1,5,6} -> {1,2,5,6}
	private int[] bubbleSort(int[] arr, int iterations, int index) {
		// TODO Auto-generated method stub
		if (iterations==0) return arr; 
		
		if(index<iterations-1) {
			
			if(arr[index]>arr[index+1]) {
				
				int temp = arr[index];
				arr[index] = arr[index+1];
				arr[index+1]= temp;		
			}
		
			return bubbleSort(arr, iterations, index+1);
			
		}
		
		else {
			
			return bubbleSort(arr, iterations-1, 0);		
			
		}
			
			
			
	}	
		
	

}
