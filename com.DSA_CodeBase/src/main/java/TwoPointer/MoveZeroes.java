package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {
	
	/*
	 * leetcode 283
	 */

	
	@Test
	public void Test1() {
	
	int [] input_array = {0,1,0,3,12};
	int input_number = 0;
	
	
	;
	System.out.println(Arrays.toString(moveZeros(input_array, input_number )));
	
	}
	
	
	@Test
	public void Test2() {
	
	int [] input_array = {0,1,0};
	int input_number = 0;
	
	
	;
	System.out.println(Arrays.toString(moveZeros(input_array, input_number )));
	
	}

	private int [] moveZeros(int[] a , int target)  {
		// TODO Auto-generated method stub
	
		
		int left = 0;
		int right =0;
		for ( right =0; right <a.length ; right++) {
			
			if (a[left]!=target) {

				left++;
			}
			
			else if (a[left]==target) {
				
				if (a[right] == target ) {
					
					
				}
				
				else if (a[right] != target) {
					
					int temp = a[right];
					a[right] = a[left];
					a[left++] = temp;
					
					
					
				}
			}
			
		}
		
		return a;
		
		
	}
	
	
}
