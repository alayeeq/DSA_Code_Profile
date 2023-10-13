package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class RevKChars {

	
	
	@Test
	public void test1() {
		
		String s = "bacdfeg";
		int k = 2;
		
	System.out.println(	revK(s,k));
		
	}
	
	@Test
	public void test2() {
		
		String s = "abcd";
		int k = 2;
		
		System.out.println(	revK(s,k));
		
	}
	
	@Test
	public void test3() {
		
		String s = "bacdfegi";
		int k = 3;
		
		System.out.println(	revK(s,k));
		
	}


	private String revK(String s, int k) {
		// TODO Auto-generated method stub
		
		char [] s_c = s.toCharArray();
		
		for (int i=0; i<s.length(); i=i+k+k) {
			
			
			if (i+k>s.length()) {
				
				int left =i;
				int right = s.length()-1;
				//int j = i;
				while (left<right) {
					
					char temp = s_c[left];
					s_c [left++] = s_c [right];
					s_c [right--] = temp;
				}
				
			}
			
			else {
			
			
			int left =i;
			int right = i+k-1;
			//int j = i;
			while (left<right) {
				
				char temp = s_c[left];
				s_c [left++] = s_c [right];
				s_c [right--] = temp;
			}
			
		}
		}
		
		new StringBuilder();
		
		return new String (s_c);
		
		
		//System.out.println(Arrays.toString(s_c));
		
	}
	
	
	
}
