package BinarySearch;

import org.junit.Test;

public class MinimumInRotatedSortedArray {
	
	
	@Test
	public void test1() {
		
		int [] arr = {3,4,5,1,2};
		
		System.out.println(findMin(arr));
		
		
	}
	
	 public int findMin(int[] nums) {


         int start = 0;
         int end = nums.length-1;

if(nums.length==1) return nums[0];

else if (nums[start] <nums[end]) return nums[start];

else{
         while (start<=end){

                
                 int mid = start + ((end-start)/2);

                 if (nums[mid]>nums[mid+1])  return nums[mid+1];
                 else if (nums[mid]<nums[mid-1]) return nums[mid];

                 else if (nums[start] >nums[mid]) end = mid-1;

                 else start = mid+1;



         }
}
        
     return -1;
 }
	 
	 

}
