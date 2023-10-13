package Recursion;

import org.junit.Test;

public class StringRemK {
	
	
	
	@Test
	public void test1() {
		
		
		String input = "deeedbbcccbd";
		
		int k = 3;
		
	System.out.println(	removeKString(input, k));
		
		
	}
	
	@Test
	public void test2() {
		
		
		String input = "ddeeeedbbccccbbd";
		
		int k = 4;
		
	System.out.println(	removeKString(input, k));
		
		
	}

	private String removeKString(String input, int k) {
		// TODO Auto-generated method stub
		
		if(input.length()==1) return input;
		
		int counter = 0;
		
		int next = 0;
		String TempOutput = "";
		String Output = "";
		String next_String ="";
		
		char first = input.charAt(0);
		
		while (counter<k) {
			
			if (counter<input.length() && input.charAt(counter)==first) {
				counter++;
				continue;
		}
			break;
			
		}
		
		if(counter==k) {
			
			next = k-1;
			 next_String =input.substring(next+1);
			TempOutput =   TempOutput + removeKString(next_String,k);
		}
		//
		else {
			 next_String =  input.substring(next+1);
		 TempOutput =   first + removeKString(next_String,k);
		}
		 char last = TempOutput.charAt(TempOutput.length()-1);
			int rev_counter = 	0;
		 while (rev_counter<k) {
				
			 if (rev_counter<TempOutput.length() && TempOutput.charAt(rev_counter)==TempOutput.charAt(0)) {
				 rev_counter++;
					continue;
				}
				break;
				
			}
			
			if(rev_counter==k) {
				
				Output = TempOutput.substring((k));
				
				
			}
			else Output = TempOutput;
			
			return Output;
		
	}

}
