package Recursion;

import org.junit.Test;

public class CheckArrayIsSorted {
	
	
	
	@Test
	public void test1() {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
	System.out.println(	isSorted(arr));
		
	}
	
	
	@Test
	public void test2() {
		
		int [] arr = {1,2,4,3 ,5,6,7,8};
		
	System.out.println(	isSorted(arr));
		
	}

	private boolean isSorted(int[] arr) {
		// TODO Auto-generated method stub
		
		
		if (arr.length==1) return true;
		
		
		return isSorted(arr , 0);
		
		
		
	}

	private boolean isSorted(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		if (i==arr.length-1) return true;
		
		else return arr[i]<arr[i+1] && isSorted(arr, i+1);
		
		
	}

}
