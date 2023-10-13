package Hashing;

import org.junit.Test;
import java.util.LinkedHashMap;

public class MaxFirstOccurence {
	
	
	@Test
	public void test1() {
		
		int [] arr = {1, 5, 3, 4, 3, 5, 6, 3, 4, 4};
		
		System.out.println(findMaxrepeat(arr));
		
	}
	
	@Test
	public void test2() {
		
		int [] arr = {7, 7, 3, 4, 3, 7, 6, 3, 4, 4};
		
		System.out.println(findMaxrepeat(arr));
		
	}


	private int findMaxrepeat(int[] arr) {
		// TODO Auto-generated method stub
		
		LinkedHashMap <Integer, Integer> lhm = new LinkedHashMap();
		
		
		for (int i=0; i<arr.length ; i++) {
			
		lhm.put(arr[i], lhm.getOrDefault(arr[i], 0)+1)	;
			
			
		}
		int min_index = 0;
		int max_occ=Integer.MIN_VALUE;
		
		
		for (Integer i : lhm.keySet()) {
			
			if(lhm.get(i)>max_occ) {
				max_occ = lhm.get(i);
				min_index = i;
				
			}
		
		for (int j=0; j<arr.length; j++) {
			
			if (arr[j]==min_index) {
				min_index =j;
			break;
			}
			
		}
			
			
			
		}
		
		
		return min_index+1;
	}

}

/* Optimized solution
 * private static int firstRepeating(int[] nums) {
		int max=0;
		int key=0;
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			int val=hm.getOrDefault(nums[i], 0)+1;
			hm.put(nums[i], val);
			//get the max val and key
			if(val>max) {max=val;key=nums[i];}
			
		}
		System.out.println(hm);
		System.out.println(max);
		System.out.println(key);
		int i;
		for(i=0;i<nums.length;i++) {
			if(nums[i]==key)
				break;
		}
		return i+1;
	}
 * 
 * 
 * 
 */