package LinearSearch;

import java.util.Comparator;

import org.junit.Test;

public class PowerOfTwo {
	/*
	 * 
	 * Leetcode 231
	 */


	
	Comparable<String> c;
	Comparator <String> c2;
	
	
	@Test
	    public void Test1() {
		
		
		int input = 8;
		
		
		System.out.println(isPowerof2(input));
		
		
	}
	
	@Test
    public void Test2() {
	
	
	int input = 20;
	
	
	System.out.println(isPowerof2(input));
	
	
}
	
	@Test
    public void Test3() {
	
	
	int input = 1;
	
	
	System.out.println(isPowerof2(input));
	
	
}
	
	@Test
    public void Test4() {
	
	
	int input = 3;
	
	
	System.out.println(isPowerof2(input));
	
	
}
	
	@Test
    public void Test5() {
	
	
	int input = 256;
	
	
	System.out.println(isPowerof2(input));
	
	
}


	private boolean isPowerof2(int input) {
		// TODO Auto-generated method stub
		
		boolean answer = true;
		
		if(input==1) answer = true;
		
		int n = input ;
		while (n !=1) {
			
			if (n%2 ==1)  answer = false;
			
			n = n/2;
			
			
		}
		
		
		return answer;
		
	}
	
	
}
