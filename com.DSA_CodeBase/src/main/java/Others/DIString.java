package Others;

import java.util.Arrays;

import org.junit.Test;

public class DIString {

	
	@Test
	public void Test1() {
		String input = "IDID";
		
		
		//findStringMatch(input);
		findStringMatch_SB(input);
		
	}
	
	
	@Test
	public void Test2() {
		String input = "III";
		
		
		//findStringMatch(input);
		findStringMatch_SB(input);
	}
	
	@Test
	public void Test3() {
		String input = "DDI";
		
		
		//findStringMatch(input);
		findStringMatch_SB(input);
		
	}

	private void findStringMatch(String input) {
		// TODO Auto-generated method stub
		
		
		int [] output = new int[input.length()+1];
		
		int I_mem = -1;
		int D_mem= input.length()+1;
		
		for (int i=0; i<input.length()+1; i++) {
			
			
			if (i==input.length()) {
				
				
				if(input.charAt(i-1)=='I') {
					I_mem = I_mem+1;
					output[i]= I_mem;
					
				}
				
				else if(input.charAt(i-1)=='D') {
					D_mem = D_mem-1;
					output[i]= D_mem;
					
				}
				
				
			}
			
			else if(input.charAt(i)=='I') {
				I_mem = I_mem+1;
				output[i]= I_mem;
				
			}
			
			else if(input.charAt(i)=='D') {
				D_mem = D_mem-1;
				output[i]= D_mem;
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(output));
	}
	
	
	private void findStringMatch_SB(String input) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder (input);
		
		int [] output = new int[sb.length()+1];
		
		int I_mem = -1;
		int D_mem= sb.length()+1;
		
		for (int i=0; i<sb.length()+1; i++) {
			
			
			if (i==sb.length()) {
				
				
				if(sb.charAt(i-1)=='I') {
					I_mem = I_mem+1;
					output[i]= I_mem;
					
				}
				
				else if(sb.charAt(i-1)=='D') {
					D_mem = D_mem-1;
					output[i]= D_mem;
					
				}
				
				
			}
			
			else if(sb.charAt(i)=='I') {
				I_mem = I_mem+1;
				output[i]= I_mem;
				
			}
			
			else if(sb.charAt(i)=='D') {
				D_mem = D_mem-1;
				output[i]= D_mem;
				
			}
			
			
		}
		
	//	output
		
		System.out.println (Arrays.toString(output));
	}
	
	
	
}
