package TwoPointer;
import java.util.Arrays;
import java.util.TreeMap;

import org.junit.Test;

public class GreatnessofArray {
	
	
	/*
	 * {1,1,1,2,3,3,5}
		{2,3,3,5,}
		
		
		{1,2,3,4}
		
		{2,3,4,1}
	 * 
	 * 
	 */
	
	
	@Test
	public void test1() {
		
		int [] arr = {1,3,5,2,1,3,1};
		
		
		
		
		System.out.println(greatnessOfArray(arr));
		
	}
	
	@Test
	public void test2() {
		
		int [] arr = {1,2,3,4};
		
		
		
		
		System.out.println(greatnessOfArray(arr));
		
	}
	

	private int greatnessOfArray(int[] arr) {
		// TODO Auto-generated method stub
		
		TreeMap <Integer, Integer> hm = new TreeMap<Integer, Integer>();
		
		for (int i=0; i<arr.length; i++) {
			
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			
		}
		
		Arrays.sort(arr);
		
		int left = 0;
		int right= 0;
		int count = 0;
		while (right<arr.length) {
			
			if (arr[right]>arr[left]) {
				
				count++;
				left++;
			}
			
			right++;
		}
		
		
		
		/*for (int j=0;j<arr.length-1;j++) {
			
			if (arr[j+1]>arr[j])count++;
			left++;
			
		}*/
		
		return count;
		
		
	}

}
