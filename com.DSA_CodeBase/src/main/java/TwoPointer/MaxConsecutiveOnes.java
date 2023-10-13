package TwoPointer;

import org.junit.Test;

public class MaxConsecutiveOnes {
	
	
	@Test
	public void test1() {
		
		int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
		int k =2;
		System.out.println(longestOnes(arr,k));
	}
	
	
	 public int longestOnes(int[] input, int k) {
		  int output = 0;
				int zeros = 0;
				int left = 0;
				int right = 0;
				//	for (int left =0 , right =0; right<input.length; right++  ) {
						for ( ; right<input.length; right++  ) {
					
					if (input[right]==0) zeros++;
				/*	if(zeros>k) {
						if (input[left]==0) zeros--;
						left++;
						
						if (zeros ==k) {
							
							if (output < right+1-left) output = right+1-left;
							int left_value = input[left];
							if (left_value==0) zeros--;
							left++;
							
						}
						
						
					}*/
					//else 
						if (zeros >k) {
						
						
						int left_value = input[left];
						if (left_value==0) zeros--;
						left++;
						
					}
						if (output < right-left+1) output = right-left+1;
					
					
				//}
				
				
				}
				return output;

		    }

}
