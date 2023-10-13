package SlidingWindow;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

import org.junit.Test;

public class LongestRepeatingChar {

	
	
	@Test
	public void test1() {
		
		
		String input = "ABCDAAKZY";
		int k = 3;
		
	//System.out.println(longestrepString(input , k));
	System.out.println(characterReplacement(input , k));
		
	
		
	}

	@Test
	public void test2() {
		
		
		String input = "ABAA";
		int k = 0;
		
	//System.out.println(longestrepString(input , k));
	System.out.println(characterReplacement(input , k));
		
		
		
	}
	@Test
	public void test3() {
		
		
		String input = "BAAA";
		int k = 0;
		
	//System.out.println(longestrepString(input , k));
	System.out.println(characterReplacement(input , k));
		
		
		
	}
	
	
	@Test
	public void test4() {
		
		
		String input = "ABBBAAAACALM";
		int k = 3;
		
	//System.out.println(longestrepString(input , k));
	System.out.println(characterReplacement(input , k));
		
	
		
	}
	
	private int longestrepString(String input , int k) {
		// TODO Auto-generated method stub
		
		
		TreeMap <Integer, Integer> tm = new TreeMap<Integer,Integer>();
		 
		
		int left = 0;
		int right= 0;
		int counter = k;
		int max_count = Integer.MIN_VALUE;
		int temp_max = 0; 
		char [] abc = input.toCharArray();
		
		while (right<abc.length) {
			
			
			if (abc[right]==abc[left]) {
				
				temp_max++;
				
				right++;
				max_count = Math.max(max_count , right-left);
				
			}
			
			else {
				
				
				
				right++;
				counter--;
				if(counter>=0) {
				temp_max++;
				max_count = Math.max(max_count , right-left);
				}
				
				if (counter<0) {
					
					char temp = abc[left];
//					left++;
					while (abc[left]==temp) {
						
						left++;
						temp_max--;
						
						
					}
					
					//left++;
					counter++;
					//temp_max--;
					
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		return max_count;
	}
	
	
	
	
	 public int characterReplacement(String s, int k) {
	        char[] arr = s.toCharArray();
	        int left = 0, right = 0, n = arr.length;
	        
	        //Define table
	        Map<Character, Integer> hm = new HashMap<Character, Integer>();
	        
	        //define maxLen and mostFreq
	        int maxLen = 0, mostFreq = 0;
	        
	        //find longest repeating character replacement
	        while(right < n){
	            //Expand the window
	            hm.put(arr[right], hm.getOrDefault(arr[right], 0) + 1);
	            mostFreq = Math.max(mostFreq, hm.get(arr[right]));
	            
	            //Shrink the window if we need to replace more than k char
	            if((right - left + 1) - mostFreq > k){
	                hm.put(arr[left], hm.get(arr[left]) - 1);
	                left++;
	            }
	            maxLen = Math.max(maxLen, right - left + 1);
	            right++;
	        }
	        return maxLen;
	    }
	
	
}
