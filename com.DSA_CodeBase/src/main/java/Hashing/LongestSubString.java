package Hashing;

import org.junit.Test;
import java.util.HashMap;

public class LongestSubString {
	
	
	
	@Test
	public void Test1() {
		
		
		String input = "aaabb";
		
		int target = 3;
		
	System.out.println(findLongest( input , target));
	}
	
	
	@Test
	public void Test2() {
		
		
		String input = "ababbc";
		
		int target = 2;
		
	System.out.println(findLongest( input , target));
	}

	private int findLongest(String input, int target) {
		// TODO Auto-generated method stub
		int output=0;
		HashMap <Character , Integer> HM = new HashMap<Character , Integer>();
		
		for (int i=0; i<input.length(); i++) {
			
			HM.put(input.charAt(i), HM.getOrDefault(input.charAt(i), 0)+1);
			if(i!=0)
			if((i+1)%target==0) {
				
				int current_target = (i+1)/target;
				int temp_total = 0;
				if(HM.keySet().size()<=current_target) {
					
					int count_temp =0;
				for (Character k : HM.keySet()) {
					
					
					if(HM.get(k)<target) break;
					
					count_temp++;
					if (count_temp==HM.keySet().size()) {
						
						output = i+1;
					}
					
					
				}
				
				
				
				
				
			}
			}
			
		}
		return output;
		
	}

}
