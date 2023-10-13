package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class RevPrefixWord {
	
	/*
	 * 
	 * leetcode 2000
	 */
	
	
	@Test
	public void Test1() {
		
		String input  = "abcdefd";
		
		char Target_Prefix_end = 'd';
		
	//System.out.println(	revPredixM1 (input, Target_Prefix_end));
	System.out.println(	revPredixM2 (input, Target_Prefix_end));
	//revPredixM2 (input, Target_Prefix_end);
		
		
	}



	private String revPredixM1(String input, char target_Prefix_end) {
		// TODO Auto-generated method stub
		/*
		 * convert the String to char array
		 * Find the first occurence of the character
		 * if not found return input
		 * if found store it
		 * 
		 * create opposit two pointers between 0 and stored target (Inclusive)
		 * swap left atrnd right
		 * and exit the loop
		 * conv char array to String  * 
		 * 
		 * 
		 */
		
		int target_index= -1;
		
		
		
		char [] input_c = input.toCharArray();
		
		for (int i=0; i<input_c.length; i++) {
			
			if(input_c[i]==target_Prefix_end) 
			{
				target_index = i;
				break;
			}
			
			
			
			
		}
		
		if(target_index ==-1) return input;
		
		else {
			
			
			int left =0;
			int right = target_index;
			
			
			for (; left<right; left++, right--) {
				
				char temp = input_c[left];
				
				 input_c[left] =  input_c[right];
				 input_c[right] = temp;
			}
			
			return new String(input_c);
			//return Arrays.toString(input_c);
		}
		
		
		
	}
	
	
	
	private String revPredixM2(String input, char target_Prefix_end) {
		// TODO Auto-generated method stub
		//input.charAt(target_Prefix_end)
		int target_index = -1;
		StringBuilder sb = new StringBuilder (input);
		for (int i=0; i<input.length(); i++) {
			
			if(sb.charAt(i)==target_Prefix_end) {
				
				
				target_index = i;
				break;
				
			}
			
			
			
		}
		
		if (target_index==-1) return input;
		
		else {
			
			//String sub_string = sb.substring(0,target_index+1);
			
			

			int left =0;
			int right = target_index;
			
			
			for (; left<right; left++, right--) {
				
				char temp =  input.charAt(left);
				
				sb.setCharAt(left, input.charAt(right));
				sb.setCharAt(right, temp);
				
				}
			
			return sb.toString();
			
		}
		
		
	}
	
	
	
	
	
	

}
