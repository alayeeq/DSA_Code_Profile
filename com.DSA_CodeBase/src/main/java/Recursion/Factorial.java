package Recursion;

import org.junit.Test;

public class Factorial {
	
	
	@Test
	public void test1() {
		int n = 5;
	System.out.println(	getFactroial(n));
		
		
	}

	private int getFactroial(int n) {
		// TODO Auto-generated method stub
		
		if(n==1) return n;
		else {
			
			return n * getFactroial(n-1);
		} 
		
		//return 0;
	}

}
