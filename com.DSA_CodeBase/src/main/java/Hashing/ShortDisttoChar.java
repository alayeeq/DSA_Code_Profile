package Hashing;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class ShortDisttoChar {
	
	
	@Test
	public void Test1() {
		
		String input = "loveleetcode";
		char c = 'e';
		
		System.out.println(Arrays.toString(shortDist(input,c)));
		
		
	}

	private int[] shortDist(String input, char c) {
		
		
		// TODO Auto-generated method stub
		
		char [] input_c = input.toCharArray();
		int [] output = new int [input_c.length];
		
		HashSet <Integer> hs = new HashSet <Integer>();
		
		for (int i=0 ; i<input_c.length ; i++) {
			if (input_c[i]==c) 
				hs.add(i);
				
							
		}
		
		for (int z=0; z<input_c.length ; z++) {
			
			
			for (int y=0; y<input_c.length ; y++) {
				
				if(hs.contains(z+y) ||hs.contains(z-y)) {
					
					output[z] = y;
					break;
				}
				
				
			}
			
		}
		
		// try iterating for index array
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE-1);
		System.out.println(Integer.MAX_VALUE+1);
			
		
	
		return output;
}
}
