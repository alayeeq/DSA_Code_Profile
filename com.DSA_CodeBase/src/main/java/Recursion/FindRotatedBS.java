package Recursion;

import org.junit.Test;

public class FindRotatedBS {
	
	
	@Test
	public void test1() {
		
		
		int [] arr = {5,6,7,8,9,1,2,3};
		
		int target = 9;
		
		System.out.println("expected is 4");
	System.out.println(	findIndex(arr, target));
	
		
	}
	
	@Test
	public void test2() {
		
		
		int [] arr = {5,6,7,8,9,1,2,3};
		
		int target = 2;
		
		System.out.println("expected is 6");
	System.out.println(	findIndex(arr, target));
	
		
	}
	
	@Test
	public void test3() {
		
		
		int [] arr = {5,6,7,8,9,1,2,3};
		
		int target = 6;
		
		System.out.println("expected is 1");
	System.out.println(	findIndex(arr, target));
	
		
	}
	
	@Test
	public void test4() {
		
		
		int [] arr = {5,6,7,8,9,1,2,3};
		
		int target = 4;
		
		System.out.println("expected is -1");
	System.out.println(	findIndex(arr, target));
	
		
	}

	private int findIndex(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		
		return findIndex (arr, target , 0, arr.length-1);
		
		
	}
	

	private int temp(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		if (arr.length==1) return 1;
		else return 0;
		
	}

	private int findIndex(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		int mid  = start +((end-start)/2);
		if (start>end) return -1;
		
		
		
		else if (arr[mid]==target) return mid;
		
		else if (arr[start]<= arr[mid] ) {
			
			if  (arr[start]<=target && arr[mid]>=target) return findIndex(arr, target, start, mid-1);
			
			else return findIndex(arr, target, mid+1, end);
			
		}
		
		else if (arr[mid]<= arr[end] ) {
			
			if  (arr[mid]<=target && arr[end]>=target) return findIndex(arr, target, mid+1, end);
			
			else return findIndex(arr, target, start, mid-1);
			
		}
		
		  
		return -2;
		
	}

}
