package TwoPointer;

import org.junit.Test;

public class MinCommonValue {
	
	
	@Test
	public void Test1() {
		
		int [] arr1 = { 1,2,3};
		int [] arr2 = { 2,3,4};
		
	System.out.println(minCommon(arr1, arr2));
		
	}
	
	
	private int minCommon(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int left_one = 0;
		int left_two = 0;
		int min_common_value = -1;	
		
		if (arr1[0]>arr2[arr2.length-1])return min_common_value;
		
		else if (arr2[0]>arr1[arr1.length-1])return min_common_value;
		else {
		while (left_one < arr1.length && left_two < arr2.length) {
			
			
			if (arr1[left_one] == arr2[left_two]) {
				
			return	min_common_value = arr1[left_one] ;
			}
			else if (arr1[left_one] < arr2[left_two]) left_one++;
				
			else left_two++;
				
			
			
			
			
		}
		return min_common_value;
		}
	}


	@Test
	public void Test2() {
		
		int [] arr1 = { 1,2,3};
		int [] arr2 = { 2,2,2,3,4};
		
		System.out.println(minCommon(arr1, arr2));
	}
	
	@Test
	public void Test3() {
		
		
		int [] arr2 = { 4,5,6};
		int [] arr1 = { 1,2,3,3,3};
		
		System.out.println(minCommon(arr1, arr2));
	}
	
	@Test
	public void Test4() {
		
		int [] arr1 = { 1,2,3};
		int [] arr2 = { 4,5,6,6,6};
		
		System.out.println(minCommon(arr1, arr2));
	}
	
	@Test
	public void Test5() {
		
		int [] arr1 = { 1};
		int [] arr2 = { 4};
		System.out.println(minCommon(arr1, arr2));
		
	}
	
	@Test
	public void Test6() {
		
		int [] arr1 = { 4};
		int [] arr2 = { 4};
		
		System.out.println(minCommon(arr1, arr2));
	}


}
