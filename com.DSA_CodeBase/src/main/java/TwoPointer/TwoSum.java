package TwoPointer;

import java.util.ArrayList;

import org.junit.Test;

public class TwoSum {
	
	
	@Test
	public void test1() {
		
		int [] arr = {1,2,3,4,5};
		int target = 3;
		
		System.out.println(findTwoSum(arr , target));
		
	}
	
	@Test
	public void test2() {
		
		int [] arr = {0,5,4,3,2,1};
		int target = 3;
		
		System.out.println(findTwoSum(arr , target));
		
	}

	@Test
	public void test3() {
		
		int [] arr = {1,2,3,4,5};
		int target = 5;
		
		System.out.println(findTwoSum(arr , target));
		
	}
	private ArrayList<Integer> findTwoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		
		int left = 0;
		int right = 1;
		int sum =0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (right< arr.length) {
			
			sum = arr[right] +arr[left];
			if(sum ==target) {
				
				al.add(left);
				al.add(right);
			}
			left++;
			right++;
		}
		
		return al;
	}

}
