package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {

	/*
	 * LeetCode - 27
	 * 
	 */
	
	
	@Test
	public  void Test1() {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,1,5,7,1,1,2,1};
		int target = 1;
		System.out.println(Arrays.toString( ReturnRemovedArray( a ,  target)));

	}
	
	@Test
	public  void Test2() {
		// TODO Auto-generated method stub
		
		int [] a = {1,3,5,2,3,-3,5,-5,3,0};
		int target = 3;
		 System.out.println(Arrays.toString( ReturnRemovedArray( a ,  target)));

	}
	
	@Test
	public  void Test3() {
		// TODO Auto-generated method stub
		
		int [] a = {1,1,1,1,1,1};
		int target = 3;
		 System.out.println(Arrays.toString( ReturnRemovedArray( a ,  target)));

	}
	
	@Test
	public  void Test4() {
		// TODO Auto-generated method stub
		
		int [] a = {3,3,3,3,3,3,3};
		int target = 3;
		 System.out.println(Arrays.toString( ReturnRemovedArray( a ,  target)));

	}



	private  int[] ReturnRemovedArray(int[] a, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right =0;
		for ( right =0; right <a.length ; right++) {
			
			if (a[left]!=target) {

				left++;
			}
			
			else if (a[left]==target) {
				
				if (a[right] == target ) {
					
					
				}
				
				else if (a[right] != target) {
					
					int temp = a[right];
					a[right] = a[left];
					a[left++] = temp;
					
					
					
				}
			}
			
		}
		
		return Arrays.copyOf(a, left);
		 
		
	}
	

}
