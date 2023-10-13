package Hashing;

import org.junit.Test;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Set;


public class MajorityElement {
	
	
	/*
	 * loop through the array 
	 * store all elements as HM key 
	 * store number occurence as values 
	 * 
	 * iterate throught HM and check if values is >= n/2 ;
	 * 
	 * 	if yes return the key 
	 * 
	 * 
	 */
	
	
	
	@Test
	public void Tesr1() {
		
		int [] input_array = {2,2,1,1,1,2,2};
		
		
		System.out.println(findMajority(input_array));
	}
	
	@Test
	public void Tesr2() {
		
		int [] input_array = {3,2,3};
		
		
		System.out.println(findMajority(input_array));
	}


	private Integer findMajority(int[] input_array) {
		// TODO Auto-generated method stub
	
		HashMap <Integer, Integer> HM = new HashMap<Integer, Integer>();
		
		
		for (int i=0; i<input_array.length ; i++) {
			
			HM.put(input_array[i], HM.getOrDefault(input_array[i], 0)+1);
			
			
			
			
		}
	
		
		/*
		 *         for (int j: hmap.keySet() ) {
                if(hmap.get(j)>tar) tar = j;
        }
		 * 
		 */
		
		
		//HM.values()
	//Set s = HM.keySet();
	//ArrayList<Integer> al = new ArrayList<>(s);
	
	for (Integer i: HM.keySet() ) 
		  
//	for (int i=0; i<input_array.length ; i++) {
		
	if (	HM.get(i) > input_array.length/2) return i;
		
	
	
		//System.out.println(HM);
		
		
	return null;	
	}

}
