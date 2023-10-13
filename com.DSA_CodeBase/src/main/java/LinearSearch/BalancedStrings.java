package LinearSearch;

import org.junit.Test;

public class BalancedStrings {
	
	
	/*
	 * 
	 * initialize sb with "";
	 * initialize R count and L count with 0
	 * 
	 * loop through the String if char at index R rcount++ else Lcount++
	 * append the char to sb
	 * if rcoutn and r count are equal increment output count
	 *  and make the sb = "";
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	private void countOfBalSubString(String input_bal_string) {
		// TODO Auto-generated method stub
		
			
		
		StringBuilder sb = new StringBuilder ("");
		char [] input_bal_string_c = input_bal_string.toCharArray();
		
		int Rcount = 0;
		int Lcount =0;
		
		int output = 0;
		
		for (int i=0; i<input_bal_string_c.length; i++) {
			
			
			if(input_bal_string_c[i]=='R') Rcount++;
			else Lcount++;
			sb.append(input_bal_string_c[i]);
			if (Lcount==Rcount) {
				
				output++;
				
				sb = new StringBuilder("");
				Rcount = 0;
				Lcount = 0;
				
			}
			
		}
		
		
		System.out.println(output);
		
	}
	
	
	
	@Test
	public void Test1() {
		
		
		
		String input_bal_string = "RLRRLLRLRL";
		
		countOfBalSubString(input_bal_string);
		
	}
	
	@Test
	public void Test2() {
		
		
		
		String input_bal_string = "RLR";
		
		countOfBalSubString(input_bal_string);
		
	}
	
	@Test
	public void Test3() {
		
		
		
		String input_bal_string = "LL";
		
		countOfBalSubString(input_bal_string);
		
	}
	
	
	@Test
	public void Test4() {
		
		
		
		String input_bal_string = "LRR";
		
		countOfBalSubString(input_bal_string);
		
	}


	

}
