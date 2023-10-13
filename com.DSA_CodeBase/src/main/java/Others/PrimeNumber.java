package Others;

import org.junit.Test;

public class PrimeNumber {
	
	
	
	/*
	 * start from 2 check if % is zero upto square root
	 * 
	 * i*i<= n
	 * 
	 * n/i
	 * 
	 * 
	 * 
	 * 
	 */

	
	@Test
	public void test1() {
		  
		int input = 7;
		
		System.out.println(isPrime(input));
		
		
	}
	
	@Test
	public void test2() {
		  
		int input = 8;
		
		System.out.println(isPrime(input));
		
		
	}

	private boolean isPrime(int input) {
		// TODO Auto-generated method stub
		
		
		
		for (int i=2; i<input ;i++) {
			
			
			
			if (i*i >input ) {
				
				break;
			}
			
			else 
			{
				if (input%i==0) return false;
				
				
			}
			
			
		}
		
		
		
		return true;
	}
	
	
}
