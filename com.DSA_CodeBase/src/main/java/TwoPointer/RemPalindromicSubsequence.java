package TwoPointer;

import org.junit.Test;

public class RemPalindromicSubsequence {
	
	
	@Test
	public void Test1() {
		
		 String input = "ababa";
		System.out.println( remPalSS(input));
		 
		 
		
		
	}
	
	@Test
	public void Test2() {
		
		 String input = "abb";
		System.out.println( remPalSS(input));
		 
		 
		
		
	}
	
	@Test
	public void Test3() {
		
		 String input = "baabb";
		System.out.println( remPalSS(input));
		 
		 
		
		
	}
		
	

	private int remPalSS(String input) {
		// TODO Auto-generated method stub
		/*int output = 0;
		for (int i=0; i<input.length()-1 ; i++) {
			String temp = input.substring(i);
			output =i;
			if(isPal(temp)) break;
			
			
		}*/
		
		if (isPal(input)) return 1;
		
		else return 2;
		
		
		
		
		
	}
	
	public boolean isPal(String i) {
		int left = 0;
		int right =i.length()-1;
		while (left<right) {
			
			if(i.charAt(left++)==i.charAt(right--)) ;
			else return false;
			
		}
		return true;
		
	}

}
