package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class SwapVowels {
	
	
	
	/*
	 * 
	 * initialize two pointers are two ends
	 * check if value of left and value of right is vowels
	 * 	swap and increment and decrement left and right
	 * if only left is vowel decrement right
	 * if only right is vowel increment left
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//@Test
	public void Test1() {
		
		
		String s = " Hello Everyone! Welcome to Testleaf";
		
		SwapAllvowels(s);
	}
	
	
	@Test
	public void Test2() {
		
		
		String s = "AbeDIkOu";
		
		char [] test_c = s.toCharArray();
		
		for (char k : test_c) {
			
		boolean test = 	IsVowel2(k);
		
		System.out.println(test);
			
		}
	}

	private void SwapAllvowels(String s) {
		// TODO Auto-generated method stub
		
		
		
		int left = 0;
		int right = s.length()-1;
		char [] inputs_c = s.toCharArray();
		
		while(left<right) {
			
	if(IsVowel(inputs_c[left]) &&IsVowel(inputs_c[right]) ) {
		
		
		char temp = inputs_c[left];
		inputs_c[left++] = inputs_c[right];
		inputs_c[right--] = temp;
		
		
	}
	
	else if (IsVowel(inputs_c[left])) {
		
		right --;
	}
			
	else   {
		
		left++;
	}
	
			
		}
		
		
		//syso
		
		String output = "";
		for (char k : inputs_c) {
			
			output = output+k;
		}
		System.out.println("Input sentence is " +s);
		System.out.println("Output sentence is " +output);
		System.out.println(Arrays.toString(inputs_c).replaceAll(",", ""));
	}

	private boolean IsVowel(char c) {
		// TODO Auto-generated method stub
		boolean output = false;
		
		//if ((int) c >64 && (int) c < 91 || (int) c >96 && (int) c < 123) output = true;
		
		if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I' || c =='O' || c =='U') output = true;
	
		
		
		return output;
		
		
	}
	
	private boolean IsVowel2(char c) {
		// TODO Auto-generated method stub
		boolean output = false;
		
		if ((int) c >64 && (int) c < 91 || (int) c >96 && (int) c < 123) output = true;
		
		//if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I' || c =='O' || c =='U') output = true;
	
		
		
		return output;
		
		
	}

}
