package Hashing;

import org.junit.Test;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;


public class RingsAndRods {
	
	
	/*
	 * 
	 * Create a map with rod key and arraylist of colours
	 * iterate the string to fill the map
	 * iterate the map and check if array list contain  R, G and B if cout it 
	 * 
	 * return count
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	@Test
	public void Test1() {
		
		String input_rodswithrings = "R0G1B2R3G4B5R6G7B8R9";
		 numsofRodswithAllrings(input_rodswithrings);
		
		
	} 
	@Test
	public void Test1A() {
		
		String input_rodswithrings = "R0G0B0R1G1B1R2G2B2R3";
		 numsofRodswithAllrings(input_rodswithrings);
		
		
	}
	
	@Test
	public void Test2() {
		
		String input_rodswithrings = "R0G1B2K4";
		 numsofRodswithAllrings(input_rodswithrings);
		
		
	}
	
	@Test
	public void Test3() {
		
		String input_rodswithrings = "R0";
		 numsofRodswithAllrings(input_rodswithrings);
		
		
	}
	
	@Test
	public void Test4() {
		
		String input_rodswithrings = "";
		 numsofRodswithAllrings(input_rodswithrings);
		
		
	}


	private int numsofRodswithAllrings(String input_rodswithrings) {
		// TODO Auto-generated method stub
		
		HashMap <Character , ArrayList<Character>> HM = new HashMap <Character , ArrayList<Character>>();
		
		
		//ArrayList <Character> al = new ArrayList<Character> ();
		
		
	for (int i=input_rodswithrings.length()-1; i>=0; i-=2)
	{
		
		if(HM.containsKey(input_rodswithrings.charAt(i))) HM.get(input_rodswithrings.charAt(i)).add(input_rodswithrings.charAt(i-1));
		else {
			
			ArrayList <Character> al =	new ArrayList<Character> ();
				al.add(input_rodswithrings.charAt(i-1));
				HM.put(input_rodswithrings.charAt(i),al);
		}	
				
		
		
			//	HM.get(input_rodswithrings.charAt(i)).add(input_rodswithrings.charAt(i-1)));
		
		
		
		
		
	}	
	
	
	int count = 0;
	for (Character c : HM.keySet()) {
		
	
		
		
		
	if(	new HashSet(HM.get(c)).size()==3)
	{
	count++;
	}
		
	}
	
	return count;
	//System.out.println(HM);
	//System.out.println(count);
	
	
	
	}

}
