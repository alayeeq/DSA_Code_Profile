 package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	
	@Test
	
	public void Test1() {
		
		int [] input_one = { 1,4,5,0,0,0,0};
		int [] input_two = { 2,3,3,9};
		
		int m = 3;
		int n = 4;
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
		//Mergearray (input_one,input_two);
	//System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
	}
	
	
	@Test
	
	public void Test2() {
		
		int [] input_one = { 1,4,5,0};
		int [] input_two = { 2};
		
		int m = 3;
		int n = 1;
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
		//Mergearray (input_one,input_two);
	//System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
	}
	
	@Test
	
	public void Test3() {
		
		int [] input_one = { 7,0,0,0,0,0};
		int [] input_two = { 1,2,3,4,5};
		
		int m = 1;
		int n =5;
		
		//Mergearray (input_one,input_two);
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
		//		System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
	}
	
	
	@Test
	
	public void Test4() {
		
		int [] input_one = {1,2,3,0,0,0};
		int [] input_two = { 2,5,6};
		
		int m = 3;
		int n = 3;
		
		//Mergearray (input_one,input_two);
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
		//System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
	}
	
	@Test
	
	public void Test5() {
		
		int [] input_one = {0,0,0};
		int [] input_two = { 2,5,6};
		
		int m = 0;
		int n = 3;
		
		//Mergearray (input_one,input_two);
	//System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
	}
	
	@Test
	
	public void Test6() {
		
		int [] input_one = {0};
		int [] input_two = {2};
		 
		int m = 1;
		int n = 1;
		
		//Mergearray (input_one,input_two);
	//System.out.println(Arrays.toString(Mergearray (input_one,m,input_two,n)));	
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));
	}
	
	@Test
	
	public void Test7() {
		
		int [] input_one = {0,0,3,0,0,0,0,0,0};
		int [] input_two = {-1,1,1,1,2,3};
		
		int m = 3;
		int n = 6;
		
		//Mergearray (input_one,input_two);
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));	
	}
	
	
	@Test
	
	public void Test8() {
		
		int [] input_one = {-1,0,0,5,0,0,0,0,0,0};
		int [] input_two = {-3,-2,6,7,8,9};
		
		int m = 4;
		int n = 6;
		
		//Mergearray (input_one,input_two);
		System.out.println(Arrays.toString(merge (input_one, m ,input_two,n)));	
	}
	
	

	
	
	
	 public int [] merge(int[] nums1, int m, int[] nums2, int n) {

		    int i=m-1; // will point at m-1 index of nums1 array
		        int j=n-1; // will point at n-1 index of nums2 array
		        int k=nums1.length-1; //will point at the last position of the nums1 array

		        // Now traversing the nums2 array
		        while(j>=0){
		            // If element at i index of nums1 > element at j index of nums2
		            // then it is largest among two arrays and will be stored at k position of nums1
		            // using i>=0 to make sure we have elements to compare in nums1 array
		            if(i>=0 && nums1[i]>nums2[j]){
		            	
		            	int temp = nums1[k];
		                nums1[k]=nums1[i];
		                nums1[i] = temp;
		                k--; 
		                i--; //updating pointer for further comparisons
		            }else{
		                // element at j index of nums2 array is greater than the element at i index of nums1 array 
		                // or there is no element left to compare with the nums1 array 
		                // and we just have to push the elements of nums2 array in the nums1 array.
		                nums1[k] = nums2[j];
		                k--; 
		                j--; //updating pointer for further comparisons
		            }
		        }
		        
		        return nums1;
		    }
	
	

	private int[] Mergearray(int[] input_one, int m, int[] input_two, int n) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		int left = input_one.length-input_two.length-1;
		
		int right = input_two.length-1;
		int target_index = input_one.length-1;
		if (left==-1) input_one= input_two;
		else if (input_one.length==1 && input_one[0]==0) input_one[target_index] = input_two[right];
		else {
		while(right>=0) {
			
			
				if(input_one[left]<=input_two[right]) input_one[target_index--] = input_two[right--];
			
			else if	(input_one[left]>input_two[right]) {
				
				int temp = input_one[target_index];
				input_one[target_index--] = input_one[left];
			//	input_one[left] = temp;
				
				if (left!=0) input_one[left--] = temp;
				else input_one[left] = temp;
			}
			
	
			}
		}
		
		return input_one;
	}
	
	
}
	

