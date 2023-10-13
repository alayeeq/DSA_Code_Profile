package TwoPointer;

import org.junit.Test;

public class ReverseEachWordofString {
	
	
	
	
	/*  String x = "Welcome to Test Leaf";
	 * output = "emocleW ot tseT faeL";
	 * 
	 * split the string with spaces regex and convert string []
	 * create a method that reverse the string using two pointer swap
	 * iterate the string []  and reverse each string and store to the same index 
	 * create and out string and append all indices 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void Test1() {
		
		
		
		String input = "Welcome to TestLeaf";
		
	//	System.out.println(reverseAllwords(input));
		//System.out.println(1);
		//String s = "a"+1;
		
		System.out.println(reverseAllwordsM2(input));
		
	}

	private String reverseAllwordsM2(String input) {
		// TODO Auto-generated method stub
		
		
		char [] input_c = input.toCharArray();
		
		int left=0;
		int right = 1;
		
		
		while(right < input_c.length) {
			
			while (input_c[right]!=' ')
				if(right <input_c.length-1) right++;
				else break;
			
			int temp = right;
			
			if (input_c[right]==' ')  right = right-1;
			//else right = right;
			while (left<right) {
				
				char temp2 = input_c[right];
				input_c[right--] = input_c[left];
				input_c[left++] = temp2;
				
				
			}
			
			left =temp+1;
			right = left+1;
			
			
		}
		
		
		
		
		
		return new String(input_c) ;
	}

	private String reverseAllwords(String input) {
		// TODO Auto-generated method stub
		
		
		String [] input_split = input.split(" ");
		String output = "";
		for (String s : input_split) {
			
			output =output+ Reverse_word(s)+ " ";
			
		}
		
		return output;
		
	}

	private String Reverse_word(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(s);
		int left = 0;
		int right = sb.length()-1;

			while (left<right) {
				
				char temp = sb.charAt(left);
				
				sb.setCharAt(left, sb.charAt(right));
				
				sb.setCharAt(right, temp);
				
				left++;
				right--;
			}
		
			
		return	sb.toString();
		
		
	}

	
	
	
	
	
}
