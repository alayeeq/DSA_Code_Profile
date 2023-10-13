package SlidingWindow;

import org.junit.Test;

public class NeedleInHayStack {
	
	
	@Test
	public void test1() {
		
		String haystack = "sadbutsad";
		String needle ="sad";
		
	System.out.println(	retFirstOccurence(haystack , needle));
		
	}

	private int retFirstOccurence(String haystack, String needle) {
		// TODO Auto-generated method stub
		
		//StringBuilder sb = new StringBuilder(haystack);
		
		int limit = needle.length();
		
		;
		
		if (haystack.substring(0,limit).equals(needle)) {
			
			return 0;
		}
		
		else {
			
			for (int i=1; i<haystack.length()-limit ; i++) {
				
				if (haystack.substring(i,i+limit).equals(needle)) {
					
					return i;
				
			}
			
		}
		
		return -1;
	}
	
	
	}
}
