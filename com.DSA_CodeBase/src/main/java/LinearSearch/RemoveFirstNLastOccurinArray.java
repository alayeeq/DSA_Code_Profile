package LinearSearch;

import java.util.Arrays;

import org.junit.Test;

public class RemoveFirstNLastOccurinArray {
	
	/*
	 * get all the indices of the given integer
	 * 
	 * if count of indices is >=2 
	 * 		create a subarray with size lenght -2 of input array
	 * 		copy all element except the two indices of the matching number
	 * 
	 * if count of indices is 1 
	 * 		create a subarray with size lenght -1 of input array
	 * 		copy all element except the one indices of the matching number
	 * 
	 * if count of indices is 0 
	 * 		return the input array

	 */
	
	
	@Test
	public void Test1() {
		
		int [] input_array = {1,3,1,4,5,1,1};
		int input = 1;
		int [] output_E = {3,1,4,5,1};
		int [] output_A = removeFNLOccrurenceinArray(input_array , input );
		System.out.println(Arrays.toString(output_A));
		
	}
	
	@Test
	public void Test2() {
		
		int [] input_array = {1};
		int input = 1;
		int [] output_E = {};
		int [] output_A = removeFNLOccrurenceinArray(input_array , input );
		System.out.println(Arrays.toString(output_A));
		
	}
	
	@Test
	public void Test3() {
		
		int [] input_array = {3,3,3,3,3};
		int input = 1;
		int [] output_E = {3,3,3,3,3};
		int [] output_A = removeFNLOccrurenceinArray(input_array , input );
		System.out.println(Arrays.toString(output_A));
		
	}
	
	@Test
	public void Test4() {
		
		int [] input_array = {};
		int input = 1;
		int [] output_E = {};
		int [] output_A = removeFNLOccrurenceinArray(input_array , input );
		System.out.println(Arrays.toString(output_A));
		
	}
	
	@Test
	public void Test5() {
		
		int [] input_array = {1,1,1,1,1};
		int input = 1;
		int [] output_E = {};
		int [] output_A = removeFNLOccrurenceinArray(input_array , input );
		System.out.println(Arrays.toString(output_A));
		
	}


	private int[] removeFNLOccrurenceinArray(int[] input_array, int input) {
		// TODO Auto-generated method stub
		int [] Output_ayyay;
		//Arrays.fill(index_array, -1);
		
		int first = -1 ;
		int last = -1;

		int j;
		for ( j =0; j<input_array.length; j++) {
			
			if (input_array[j] ==input) first = j;
			break;
			
		}
		int k;
		for ( k= j+1 ; k<input_array.length; k++) {
			
			if (input_array[k]==input) {
				
				if(last<k) {
					last = k;
				}
			}
			
		}
		
		
		if (first ==-1) return input_array;
		if (last ==-1) 	{
			int [] red_array = new int[input_array.length-1];
			if(red_array.length==0) return red_array;
			else {
			int z;
			for  ( z=0 ; z<first ; z++) {
				red_array[z] = input_array[z];
				
				
			}
			
			for  ( int y=z+1 ; y<red_array.length ; y++) {
				red_array[y-1] = input_array[y];
				
				
			}
			
			Output_ayyay = red_array;
			}
		}
		
		else {
			
			int [] red_array = new int[input_array.length-2];
			int z;
			for  ( z=0 ; z<first ; z++) {
				red_array[z] = input_array[z];
				
				
			}
			int t;
			for  (t =z+1 ; t<last ; t++) {
				red_array[t-1] = input_array[t];
				
				
			}
			
			for  ( int y=t+1 ; y<red_array.length ; y++) {
				red_array[y-1] = input_array[y];
				
				
			}
			
			Output_ayyay = red_array;
			
		}
		return Output_ayyay;
	}


}
