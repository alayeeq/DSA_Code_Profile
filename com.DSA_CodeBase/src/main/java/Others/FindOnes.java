package Others;

import org.junit.Test;

public class FindOnes {
	
	
	
	
	/*
	 *  Given 0,0,0,0,0,1,1,1
	 *  0,0,0,0,0,0,0,1
	 *  create three pointers 0, length-1, mid
	 *  mid = avg of two
	 *  find if it is first one
	 *      if mid is Zero check if mid +1 is 1 or if mid is 1 check mid-1 is zero
	 *      
	 *      if mid is zero left = mid+1
	 *      
	 *      
	 *      
	 *      
	 *      @Test
	 * 
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	
	@Test
	public void Test1() {
		
		int [] input_array = {0,0,0,0,0,1,1,1};
		
	System.out.println(findones(input_array));
		
		
	}
	
	@Test
	public void Test2() {
		
		int [] input_array = {0,0,0,0,0,0,0,0};
		
	System.out.println(findones(input_array));
		
		
	}
	
	@Test
	public void Test3() {
		
		int [] input_array = {1,1,1,1,1,1,1,1};
		
	System.out.println(findones(input_array));
		
		
	}

	private int findones(int[] input_array) {
		// TODO Auto-generated method stub
			
		int left = 0;
		int right = input_array.length-1;
		int mid = -1;
		int ones = -1;
		boolean found = false;
		boolean complete = false;
		
		while (!found || !complete) {
			
			
			mid = (left+right)/2;
			
			 if (mid+1 == input_array.length) 
			{
			found = true;
			complete = true;
			}
			 
			 else if (left == 0 && right ==0) 
			{
				 ones = input_array.length;
			found = true;
			complete = true;
			}
			
			 else if(input_array[mid]==0 && input_array[mid+1]==1 || input_array[mid]==1 && input_array[mid-1]==0) {
				
				if (input_array[mid]==0) {
					
					ones = input_array.length-mid+1;
					found = true;
					complete = true;
					
				}
				
				else if (input_array[mid]==1) {
					
					ones = input_array.length-mid;
					found = true;
					complete = true;
				}
				
			}
			
			
			
			else if (input_array[mid]==0) {
				
				left = mid+1;
				
			}
			else if (input_array[mid] ==1) {
				
				right = mid-1;
				
			}		
			
		}
		
		if(ones!=-1) return ones;
		else return 0;
		
		
		
		
	}
	
	
}
