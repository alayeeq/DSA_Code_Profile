package Recursion;

import org.junit.Test;

public class FindCapChar {
	
	
	@Test
	public void test1() {
		
	String input = "geeksforgeeKs";
	int index = 0;
	
	System.out.println(findFirstCap(input, index));
	}

	private char findFirstCap(String input, int index) {
		// TODO Auto-generated method stub
		if (input.length()==0) return '0' -'0';
		
		if (input.charAt(index)> 64 && input.charAt(index)< 91) return input.charAt(index);
		
		else return findFirstCap(input, index+1);
		
		
	}

}
