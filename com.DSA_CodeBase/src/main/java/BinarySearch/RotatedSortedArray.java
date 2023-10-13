package BinarySearch;

import org.junit.Test;

public class RotatedSortedArray {
	/*
	 * 
	 * leetcode 33
	 */
	
	@Test
	
	public void test1() {
		
		int [] arr = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(search(arr , target));
		
	}
	
	@Test
	
	public void test2() {
		
		int [] arr = {4,5,6,7,0,1,2};
		int target = 3;
		
		System.out.println(search(arr , target));
		
	}
	
	@Test
	
	public void test3() {
		
		int [] arr = {1};
		int target = 3;
		
		System.out.println(search(arr , target));
		
	}
	
	
	
	 public int search(int[] nums, int target) {
	        
         int start =0;
         int end = nums.length-1;

         int pivot = findPiv(nums);
          //   System.out.println("Pivot is " + pivot);
         int left_output = findEle(nums , 0, pivot , target );
         if(   left_output !=-1) return  left_output;

         // int right_output = findEle(nums , pivot+1, end , target );
         else return findEle(nums , pivot+1, end , target );




 }

 
          public int findEle(int[] nums , int start, int end ,int target) {


        

//if(nums.length==1) return nums[0];

//else if (nums[start] <nums[end]) return nums[start];


         while (start<=end){

                
                 int mid = start + ((end-start)/2);

                 if (nums[mid]==target)  return mid;
                 else if (nums[mid]<target) start = mid+1;

                // else if (nums[start] >nums[mid]) end = mid-1;

                 else end = mid-1;



         }

        
     return  -1;
 }






      public int findPiv(int[] nums) {


         int start = 0;
         int end = nums.length-1;

if(nums.length==1) return 0;

else if (nums[start] <nums[end]) return nums[start];

else{
         while (start<=end){

                
                 int mid = start + ((end-start)/2);

                 if (nums[mid]>nums[mid+1])  return mid;
                 else if (nums[mid]<nums[mid-1]) return mid-1;

                 else if (nums[start] >nums[mid]) end = mid-1;

                 else start = mid+1;



         }
}
        
     return -1;
 }

}
