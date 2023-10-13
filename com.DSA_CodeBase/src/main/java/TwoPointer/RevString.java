package TwoPointer;

import org.junit.Test;

public class RevString {
	
	
	
	@Test
	public void test1() {
		
		String input = "Apple";
		
		System.out.println(revString(input));
		
		
	}
	
	
	@Test
	public void test2() {
		
		String input = "Circumference";
		
		System.out.println(revString(input));
		
		
	}
	
	@Test
	public void test3() {
		
		String input = "Boat";
		
		System.out.println(revString(input));
		
		
	}

	private String revString(String input) {
		// TODO Auto-generated method stub
		
		
		
		char [] abc = input.toCharArray() ;
		
		int left =0;
		int right = abc.length-1;
		
		while (left<right) {
			
			char temp = abc[left];
			
			abc[left++] = abc[right];
			abc[right--] = temp;
			
		}
		
		
		
		
		return new String(abc);
	}

}
