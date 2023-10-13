package BinarySearch;

import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;

import org.junit.Test;

public class SearchInsertPosition {

	@Test
	public void test1() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 2;

		System.out.println(searchPos(nums, target));

	}

	@Test
	public void test2() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		Stack <Character> st = new Stack <Character>();
		//st.get
		System.out.println(searchPos(nums, target));

	}

	@Test
	public void test3() {

		int[] nums = { 1, 3, 5, 6 };
		int target = -1;

		System.out.println(searchPos(nums, target));

	}
	
	@Test
	public void test4() {

		int[] nums = { 1, 3 };
		int target = 2;

		System.out.println(searchPos(nums, target));

	}
	
	@Test
	public void test5() {

		int[] nums = { 1};
		int target = 0;

		System.out.println(searchPos(nums, target));

	}
	
	@Test
	public void test6() {

		int[] nums = { 1,3};
		int target = 4;

		System.out.println(searchPos(nums, target));

	}

	private int searchPos(int[] nums, int target) {
		// TODO Auto-generated method stub
		  int start = 0;
	         int end = nums.length-1;

	         while(start<=end){
	              int mid = start + (end - start)/2;

	              if(nums[mid]==target){
	                  return mid;
	              }
	              else if(target<nums[mid]){
	                  end = mid-1;
	              }else{
	                  start = mid+1;
	              }
	         }
	         return start;
	}
	
	
	
}
