package BinarySearch;

import org.junit.Test;

public class BinarySearchElement {
	
	@Test
	public  void test1() {
		
		
		int [] input = {-1,0,3,5,9,12};
		int target = 9;
		
	System.out.println(	binSearch (input , target));
	
		
		
		 
	}

	private int binSearch(int[] input, int target) {
		// TODO Auto-generated method stub
		
		if (input.length==0) return -1;
		
		
		
		return binSearchHelper(input , target, 0,input.length-1);
		
		
	}

	private int binSearchHelper(int[] input, int target, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end) return -1;
		
		int mid = start + (end-start)/2;
		if (input[mid] ==target)return mid;
		else if(input[mid]>target) end = mid-1;
		else start = mid+1;
		
		return (binSearchHelper(input, target, start,end));
		
		
	}

}
