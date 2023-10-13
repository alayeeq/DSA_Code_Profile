/**
 * 
 */
package SlidingWindow;

import org.junit.Test;

/**
 * @author DELL
 * 
 * get the input string 
 * get the target_sequence
 * convert it to char array 
 * iterate through target sequence and find number of Bs store in int max
 * start from 0 till lenght of string -target_seq
 * sub  
 *
 */
public class MinWhiteOperation {
	
	
	@Test
	public void Test1() {
		
		
		String input = "WBBWWBBWBW";
		int target_length = 7;
		
		minwhiteoperation(input, target_length) ;
		
		
	}
	
	
	@Test
	public void Test2() {
		
		
		String input = "WBWBW";
		int target_length = 2;
		
		minwhiteoperation(input, target_length) ;
		
		
	}

	private int minwhiteoperation(String input, int target_length) {
		// TODO Auto-generated method stub
		
		
		int Bs =0;
		int W=0;
		int max_Bs=0;
		
		for (int i=0; i<target_length ; i++) {
			
			if(input.charAt(i)=='B') Bs=Bs+1;
			
			
			
		}
		if(Bs>max_Bs) max_Bs =Bs;
		
		
		for (int j=0; j<input.length()-target_length ; j++) {
			
			if(input.charAt(j)=='B') Bs=Bs-1;
			if(input.charAt(j+target_length)=='B') Bs=Bs+1;
			
			if(Bs>max_Bs) max_Bs =Bs;
		}
		
		
		int min_operation = target_length-max_Bs;
		
		System.out.println(min_operation);
		return min_operation;
		
	}
	
	
	

}
