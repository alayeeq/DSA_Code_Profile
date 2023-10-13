package Recursion;

import java.util.Arrays;

import org.junit.Test;

public class SumTriangleArray {
	
	/*	 
	 * Check if the array length is <=1 then print array
	 * 	else create a new array of lenght n-1
	 * 	assign the sum of i, i+1 to new array[i] 
	 * 
	 * call the method again with new array following by printing the array 
	 * 
	 *i
	 */
	
	
	
	
	@Test
	public void test1() {
		
		
		int [] input = {1,2,3,4,5};
		
	//	printTriangleArray(input);
	System.out.println(	Arrays.toString( printTriangleArraym2(input)));
		
		
	}
	
	

	private int [] printTriangleArraym2(int[] input) {
		// TODO Auto-generated method stub
		
		
	if (input.length <=1) return input;
		
		else {
			
			   int [] newArray = new int [input.length-1];
			   
			   for (int i=0; i<input.length-1; i++) {
				   
				   newArray[i] = input[i]+input[i+1];
				   
			   }

			   System.out.println(Arrays.toString( printTriangleArraym2(newArray)));
			   return input;
			//System.out.println(Arrays.toString  (printTriangleArraym2(newArray)));
			   
			//   System.out.println(Arrays.toString(input));
			   
			   
		}
		
	}



	private void printTriangleArray(int[] input) {
		// TODO Auto-generated method stub
		
		
		if (input.length <=1) System.out.println(Arrays.toString(input));
		
		else {
			
			   int [] newArray = new int [input.length-1];
			   
			   for (int i=0; i<input.length-1; i++) {
				   
				   newArray[i] = input[i]+input[i+1];
				   
			   }
			   
			   printTriangleArray(newArray);
			   
			   System.out.println(Arrays.toString(input));
			   
			   
		}
		
	}

}
