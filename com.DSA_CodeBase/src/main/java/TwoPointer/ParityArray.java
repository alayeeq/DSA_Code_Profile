package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class ParityArray {
	
	/*
	 *  leetcode 1464
	 * 
	 */
	
	
	@Test
	public void Test1() {
		
		
		int [] input_array = {1,3,4,2};
		
		//arrangewithParity (input_array);
		System.out.println(Arrays.toString(arrangewithParity (input_array)));
	}
	
	
	
	@Test
	public void Test2() {
		
		
		int [] input_array = {1};
		
		//arrangewithParity (input_array);
		System.out.println(Arrays.toString(arrangewithParity (input_array)));
	}
	
	@Test
	public void Test3() {
		
		
		int [] input_array = {1,4,3,2,5,7,8,12};
		
		//arrangewithParity (input_array);
		System.out.println(Arrays.toString(arrangewithParity (input_array)));
	}

	@Test
	public void Test4() {
		
		
		int [] input_array = {1,3};
		
		//arrangewithParity (input_array);
		System.out.println(Arrays.toString(arrangewithParity (input_array)));
	}
	
	private int [] arrangewithParity(int[] input_array) {
		// TODO Auto-generated method stub
		
		if(input_array.length<2) return input_array;
		
		 int left =0;
		 
		int right =1;
		
		
		while (right<input_array.length) {
			
			if (input_array[left]%2==0) {
				
				left++;
				right++;
				
			
			}
			else if (input_array[left]%2==1) {
				
				while(input_array[right]%2==1) {
					
					if(right==input_array.length-1) return input_array;
					else right++;
				}
				if (input_array[right]%2==0) {
				int temp = input_array[left];
				 input_array[left] =  input_array[right]; 
				 input_array[right] = temp;
				 left++;
					right++;
				}
			}
			
		}
		
		return input_array;
	}

}
