package TwoPointer;

import org.junit.Test;

public class IsPalindrome {
	
	
	@Test
	
	public void Test1() {
		
		String input = "ABCCBA";
		
		
		System.out.println(isPalandrome(input));
		System.out.println(isPalandromeM2(input));
		
	}
	
	
	@Test
	
	public void Test2() {
		
		String input = "ABCBA";
		
		
		System.out.println(isPalandrome(input));
		System.out.println(isPalandromeM2(input));
	}
	
	@Test
	
	public void Test3() {
		
		String input = "ABCAA";
		
		
		System.out.println(isPalandrome(input));
		System.out.println(isPalandromeM2(input));
		
	}
	
	@Test
	
	public void Test4() {
		
		String input = "ABCBBA";
		
		
		System.out.println(isPalandrome(input));
		System.out.println(isPalandromeM2(input));
		
	}



	private boolean isPalandrome(String input) {
		// TODO Auto-generated method stub
		
		boolean output = true;
		int left;
		int right;
																																				
		
		if(input.length()%2 ==0) {
			
			left = input.length()/2-1;
			right = left+1;
			
		}
		
		else left = right = input.length()/2;
		
		
		while(left>0 || right<input.length()-1)
		
		{

			if(input.charAt(left--)!=input.charAt(right++) ) {
				
				output = false;
				break;
			}
			
			
		}
		
		
		
		
	return output;	
	}
	
	
	
	
	private boolean isPalandromeM2(String input) {
		// TODO Auto-generated method stub
		
		
		int left;
		int right;
																																				
		
		if(input.length()%2 ==0) {
			
			left = input.length()/2-1;
			right = left+1;
			
		}
		
		else left = right = input.length()/2;
		
		
		while(left>0 || right<input.length()-1)
		
		{

			if(input.charAt(left--)!=input.charAt(right++) ) return false;
				
			
			
			
		}
		
		
		
		
	return true;	
	}
	
	

}
