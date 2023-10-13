package LinearSearch;

import org.junit.Test;

public class MissingNumber {
	
	
	
	//@Test
	public void Test1() {
		
		
		int [] input_array = { 5,1,4,2,0};
		int n = 5;
		int output = 3;
	System.out.println(giveMissingNumber (input_array));
		
	}
	
	@Test
	public void Test2() {
		
		
		int [] input_array = { 1,0};
		int n = 5;
		int output = 2;
	System.out.println(giveMissingNumber (input_array));
		
	}

	private int giveMissingNumber(int[] input_array) {
		// TODO Auto-generated method stub
		
		float n =   input_array.length;
		 float ref_sum = n* ((n+1)/2);
		 
		 int array_sum = 0;
		 
		 for (int i =0 ; i<input_array.length; i++) {
			 
			 array_sum  = array_sum + input_array[i];
		 }
		 
		 int missing_number = (int) ref_sum- array_sum;
		
		 return missing_number;
		
	}


}
