package Hashing;

import org.junit.Test;
import java.util.HashSet;

public class ArithmaticTriplets {
	
	/*
	 * leet code 2367
	 * 
	 * 
	 */
	
	
	@Test
	public void Test1() {
		
		int [] input = {0,1,4,6,7,10};
		int diff = 3;
		
		System.out.println(findArithTrip(input , diff));
		
	}

	private int findArithTrip(int[] input, int diff) {
		// TODO Auto-generated method stub
		
		HashSet <Integer> hs = new HashSet<Integer>();
		int count = 0;
		
		for (int i=0; i<input.length ; i++ ) {
			
			hs.add(input[i]);
		}
		
		for (int j=0; j<input.length ; j++ ) {
			
			if(hs.contains(input[j]+3) && hs.contains(input[j]+6)) count++;
		}
		
		return count;
	}
	
	

}
