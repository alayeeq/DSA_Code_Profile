package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class SqurareofSortedArray {
	
	
	/*
	 * -4,-1,0,3,10
	 * 
	 * two pointer left at 0 index and right at lenght-1
	 * 
	 * create Target array of same length as input
	 * a target point start at lenght of target_array 
	 * 
	 * while left < right
	 * check which abs of which index is greater
	 * square it and add to target index and move the greater pointer in source array 
	 * and reduce the target pointer in targer array 
	 * repeate the same 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void test1() {
		
		
		int [] arr = {-4,-1,0,3,10};
		
	System.out.println(	sqOfSortedArray(arr));
	}

	private String sqOfSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int [] target = new int [arr.length];
		
		int left = 0;
		int right = arr.length-1;
		int t = target.length-1;
		
		while(left<=right) {
			
			if(left==right) {
				
				target[t--]= arr[left] * arr[left];
				left++;
			}
			
			else if(Math.abs(arr[left])>Math.abs(arr[right])) {
				
				target[t--]= arr[left] * arr[left];
				left++;
			}
				else {
					
					target[t--]= arr[right] * arr[right];
					right--;
					
				}
				
			}
			
			return Arrays.toString(target);
			
		}
		
	}

/*
	another approach by mentor calvin

int[] output = new int[nums.length];
int right = 0;
while(nums[right]<0 && right<nums.length-1){
    right++;
}
int left = right - 1;
int k = 0;
while(left>=0 && right<nums.length){
    if((nums[left]*nums[left])>(nums[right]*nums[right])){
        output[k++] = nums[right]*nums[right];
        right++;
    }else{
        output[k++] = nums[left]*nums[left];
        left--;
    }
while(right<nums.length){
    output[k++] = nums[right]*nums[right];
    right++;
}
return output;
*/

