
package LinearSearch;
import java.util.Arrays;

import org.junit.Test;

public class PlusOne {


/*
 * LeetCode 66
 * 
 */





	
	
  @Test
	
	public void Test1() {
		int [] input_array = {4,5,7,8};
		
	System.out.println(	Arrays.toString(doplusOne (input_array)));
		
		
		
	}
	
	@Test
	
	public void Test2() {
		int [] input_array = {9,9,9,9,9,9};
		
	System.out.println(	Arrays.toString(doplusOne (input_array)));
		
		
		
	}
	
	@Test
	
	public void Test3() {
		int [] input_array = {1};
		
	System.out.println(	Arrays.toString(doplusOne (input_array)));
		
		
		
	}
	
	@Test
	
	public void Test4() {
		int [] input_array = {};
		
	System.out.println(	Arrays.toString(doplusOne (input_array)));
		
		
		
	}


	private int [] doplusOne(int[] input_array) {
		// TODO Auto-generated method stub
		
		if (input_array.length==0) return input_array;
		int [] output ;
		int sum = 0;
		for (int i=0; i<input_array.length ; i++) {
			
			sum = sum +input_array[i];
			
			
		}
		
		if (sum==(input_array.length*9)){
			
			int [] new_array = new int[input_array.length+1];
			
			for (int j=0; j<new_array.length; j++) {
				
				if (j==0) new_array[j] = 1;
				
				else new_array[j] = 0;
				
			}
			
			output = new_array;
			
			
			
		}
		
		else {
			
			
			for (int k =input_array.length-1; k>=0  ; k--) {
				
				if(input_array[k]<9) {
					
					input_array[k] = input_array[k]+1;
					break;
				}
				
				else input_array[k] = 0;
				
				
				
			}
			
			output = input_array;
		}
		
		
		return output;
	}

}

