package TwoPointer;

import org.junit.Test;

public class LongestOneWithKFlips {
	
	
	
	@Test
	public void Test1() {
		
		
		int []Input = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		System.out.println("Test case 1");
		findlongesones(Input , k);
		System.out.println(longestOnes(Input , k));
		
		
			
	}
	
	@Test
	public void Test2() {
		
		
		int []Input = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println("Test case 2");
		findlongesones(Input , k);
				System.out.println(longestOnes(Input , k));
		
		
	}
	
	@Test
	public void Test3() {
		
		
		int []Input = {0,0,0,1};
		int k = 4;
		System.out.println("Test case 3");
		findlongesones(Input , k);
				System.out.println(longestOnes(Input , k));
		
		
	}
	
	@Test
	public void Test4() {
		
		
		int []Input = {1,1,1,0,0,0,1,1,1,1};
		int k = 0;
		System.out.println("Test case 4");
		findlongesones(Input , k);
				System.out.println(longestOnes(Input , k));
		
		
	}
	
	

	private void findlongesones(int[] input, int k) {
		// TODO Auto-generated method stub
		
		
		
		int output = 0;
		int zeros = 0;
		
		/*if(k==input.length) { System.out.println(input.length);
			
		}
		
		if (k==0) {
			int ones = 0;
			int temp_ones = 0;
			for (int i=0; i<input.length;i++) {
				
				if (input[i]==0)
				{
					if(temp_ones>ones) ones = temp_ones;
					temp_ones=0;
					
				}
					
				else temp_ones++;
			}
			
			
			if(temp_ones>ones) ones = temp_ones;
			System.out.println(ones);
			
		}
		
		else {
		*/
		for (int left =0 , right =0; right<input.length; right++  ) {
			
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
		System.out.println(output);
	}
	
	
	public static int longestOnes(int[] nums, int k) {
		/*
		 * nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
		 *                 f f f  f  f  f 	
		 *                 s s s s s
		 *                 count =1+1 +1 -1-1
		 *->k
		 * 
		 * 
		 * 
		*/
		
		int count = 0;
		int slow = 0;
		int fast;
		int max = 0;
		
		
		for ( fast =0; fast < nums.length; fast++) {
			if (nums[fast] == 0) {
				count++;
			}
			while (count > k) {
				if (nums[slow] == 0) {
					count--;
				}
				slow++;
			}
			int len = fast - slow + 1;
			max = (max > len) ? max : len;
		}
		return max;

	}
	
	

}
