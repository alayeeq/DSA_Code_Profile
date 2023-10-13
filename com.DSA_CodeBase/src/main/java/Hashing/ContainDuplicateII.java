package Hashing;

import org.junit.Test;
import java.util.HashMap;
import java.util.LinkedList ;
import java.util.ArrayList;
import java.util.List;

public class ContainDuplicateII {
	
	
	/*
	 * add value and in HashMap as key and indices as arraylist element
	 * 	check for every iteration if key exist
	 * 		if key exist check if last indices and this indices abs diff is <= target 
	 * 		 if yes set boolean to true
				else add the current index 
				
		    else add the key and indices to array list 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void Test1() {
		
		int [] input_array = {1,2,3,1,2,3};
		int target = 2;
		
		finddups(input_array , target);
		
		LinkedList<String> ls = new LinkedList<String>();
		
		
	}
	
	
	@Test
	public void Test2() {
		
		int [] input_array = {1,0,1,1};
		int target = 1;
		
		finddups(input_array , target);
		
		
	}
	
	@Test
	public void Test3() {
		
		int [] input_array = {1,2,3,1};
		int target = 3;
		
		finddups(input_array , target);
		
		
	}

	private void finddups(int[] input_array, int target) {
		
		// TODO Auto-generated method stub
		
		
		HashMap <Integer, List<Integer>> HM = new HashMap <Integer, List<Integer>>();
		
		List<Integer> al = new ArrayList<Integer>();
		
		boolean output = false;
		for (int i=0; i<input_array.length ; i++) {
			
			if (HM.containsKey(input_array[i])) {
				
			 
				
			if(i - HM.get(input_array[i]).get(HM.get(input_array[i]).size()-1) <=target) {
				
				output= true ;
				break;
			}
			else HM.get(input_array[i]).add(i);
			}
			
			
			
			else {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				HM.put(input_array[i], temp);
			}
			//get(input_array[i])
			
			
		}
		
		System.out.println(output);
	}
	
	


}
