package Others;

import java.util.Arrays;

import org.junit.Test;

public class ProductExceptSelf {
	
	
	
	@Test
	public void test1() {
		int [] nums = {1,2,3,4};
		
		
		System.out.println(productExceptSelf(nums));
		
	}
	
	
	    public int[] productExceptSelf(int[] nums) {
	    	
	    	
	        int numsLength = nums.length;
	        int prefixProduct = 1;
	        int suffixProduct = 1;
	        int[] result = new int[numsLength];
	        for(int i = 0; i < numsLength; i++) {
	            result[i] = prefixProduct;
	            prefixProduct *= nums[i];
	        }
	        System.out.println(Arrays.toString(result));
	        
	        for(int i = numsLength-1; i >= 0; i--) {
	            result[i] *= suffixProduct;
	            suffixProduct *= nums[i];
	        }
	        System.out.println(Arrays.toString(result));
	        return result;
	    }
	

}
