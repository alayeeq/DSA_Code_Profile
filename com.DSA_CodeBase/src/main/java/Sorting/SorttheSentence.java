package Sorting;

import java.util.Arrays;

import org.junit.Test;

public class SorttheSentence {
	
	
	/*
	 * 
	 * split the sentence with space regex into string array
	 * iterate through String elements and bubble sort by getting the value of last index of each String
	 *   iterate through the sorted array and replace number with a space and concatente
	 *   
	 * 
	 * 
	 */
	
	@Test
	public void Test1() {
		
		String input_sentence = "is2 sentence4 This1 a3";
		
		sortsentence (input_sentence);
		
		
	}

	private void sortsentence(String input_sentence) {
		// TODO Auto-generated method stub
		
		String [] input_s = input_sentence.split(" ");
	
		for (int i =input_s.length-1 ; i>=0; i--	) {
			
			for (int j=0; j<i; j++) {
				
			
				if((int)input_s[j].charAt(input_s[j].length()-1)>(int)input_s[j+1].charAt(input_s[j+1].length()-1))
				{	
					String temp = input_s[j];
					input_s[j] = input_s[j+1];
					input_s[j+1] = temp;
				}
				
			}
			
		}
		
		String output = "";
		
		for (String so :input_s ) {
		
			output = output + so.replaceAll("\\d+", " ");
		}
		
		System.out.println(output.trim());
		
	}

}
