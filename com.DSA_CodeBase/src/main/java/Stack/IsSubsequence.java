package Stack;
import java.util.*;

import org.junit.Test;

public class IsSubsequence {
	
	
	/*
	 * leet code 392
	 * 
	 */
	@Test
	public void test1() {
		
		String s = "abc";
		String t = "ahbgdc";
		
		System.out.println(isSubsequence(s,t));
		
	}
	
	
	 public boolean isSubsequence(String input, String target) {
	        

			if (input.length()<=0  ) return true;	
			else if (target.length()<=0 ) return false;	
			
			else {
			
			
				Stack<Character> st = new Stack();
				
				for (int i=input.length()-1; i>=0; i--) {
					
					st.push(input.charAt(i));
				}
				
				System.out.println(st);
				System.out.println(st.peek());
				
				
				for (int j=0; j<target.length(); j++) {
					
					
					
					if(st.peek()==target.charAt(j)) st.pop();
					if(st.size()==0) return true;
				}
				System.out.println(st);
				
				
				 return false;
			}
			}
	 
	 

}
