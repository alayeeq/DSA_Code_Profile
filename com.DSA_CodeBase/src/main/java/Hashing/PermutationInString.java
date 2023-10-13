package Hashing;

import org.junit.Test;
import java.util.*;

public class PermutationInString {
	
	
	@Test
	public void test1() {
		
		String s1 = "ab";
		String s2 = "eidbaooo";
		
	System.out.println(checkInclusion(s1,s2));
	}
	
	
	 public boolean checkInclusion(String s1, String s2) {
	    	String small = "";
			String big = "";
		if(s1.length()<=s2.length())
			{
				 small = s1;
				 big = s2;
			}
			
			else return false;
			
			if(small.length()==1) {
				
				for (char k : big.toCharArray()) {
					
					if (k==small.charAt(0))
						return true;
				}
				
				return false;
				
			}
			
			else {
			int target = small.length();
			
			HashMap<Character , Integer> hm1 = new HashMap<Character , Integer> ();
			
			for (char c : small.toCharArray()){
				
				hm1.put(c, hm1.getOrDefault(c, 0)+1);
				
			}
			char [] big_c = big.toCharArray();
			HashMap<Character , Integer> hm2 = new HashMap<Character , Integer> ();
			for (int b = 0; b<small.length(); b++ ) {
				
				
				hm2.put(big_c[b], hm2.getOrDefault(big_c[b], 0)+1);
				
			}
			
			if (hm1.equals(hm2)) return true;
			
			for (int c= small.length() ; c<big_c.length ; c++ ) {
				
		if (hm2.get(big_c[c-small.length()])>1) {
					
					hm2.put(big_c[c-small.length()],hm2.get(big_c[c-small.length()])-1);
					
				}
				
				else if  (hm2.get(big_c[c-small.length()])==1)  {
					hm2.remove(big_c[c-small.length()]);
					
				}
				
			hm2.put(big_c[c], hm2.getOrDefault(big_c[c], 0)+1);
					
					
			if (hm1.equals(hm2)) return true;	
			}
					
				
					
			return false;
		}
	    }

}
