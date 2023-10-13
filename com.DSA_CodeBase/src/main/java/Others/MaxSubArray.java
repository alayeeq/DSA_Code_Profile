package Others;

import org.junit.Test;

public class MaxSubArray {
	
	
	@Test
	public void test1() {
		
		
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr));
	}
	
	@Test
	public void test2() {
		
		
		int [] arr = {5,4,-1,7,8};
		
		System.out.println(maxSubArray(arr));
	}

	
	 public int maxSubArray(int[] nums) {

	        int max_sum = Integer.MIN_VALUE;


	           if(findAllNumsneg (nums)){

	                for (int i=0; i<nums.length ; i++){

	                        if (nums[i]>max_sum) max_sum = nums[i];

	                }

	           }
	      


	            

	            int sum = 0;

	            for (int i=0; i<nums.length ; i++){

	                sum = sum + nums[i];
	                if (sum<0) sum = 0;

	                else if (sum>max_sum) max_sum = sum;


	            }

	            return max_sum;

	        
	    }

	        public boolean findAllNumsneg(int [] abc){

	                  for (int j=0; j<abc.length ; j++ ){

	                      if(abc[j]>0) return false;

	                 }

	                return true;
	        }
	
}
