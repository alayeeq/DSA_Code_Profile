package LinearSearch;

import org.junit.Test;

public class MergeStringAlternatively {

	
	/*
	 * leetcode 1768
	 */
	
	@Test
	public void Test1()
	{
		
		String input_string1 = "abc";
		String input_string2 = "pqr";
		
		mergeStrings(input_string1,input_string2);
		
		
	}
	
	@Test
	public void Test2()
	{
		
		String input_string1 = "Mohammed";
		String input_string2 = "Asif";
		
		mergeStrings(input_string1,input_string2);
		
		
	}
	
	@Test
	public void Test3()
	{
		
		String input_string1 = "Zoya";
		String input_string2 = "Kulsum";
		
		mergeStrings(input_string1,input_string2);
		
		
	}

	private void mergeStrings(String input_string1, String input_string2) {
		// TODO Auto-generated method stub
		
		StringBuilder output_String = new StringBuilder();
		//String output_String = ""; 
		
		for (int i =0 ; i<input_string1.length()+input_string2.length()-1; i++) {
			
			if (i<input_string1.length()) {
				
				
				output_String = output_String.append(input_string1.charAt(i));
			}
			if (i<input_string2.length()) {
				
				output_String = output_String.append(input_string2.charAt(i));
				
			}
			
			
		}
		
		System.out.println(output_String.toString());
		
	}
	
	
	
}
