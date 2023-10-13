package Stack;
import java.util.*;

import org.junit.Test;




public class BackSpaceStringCompare {
	
	/*
	 * leetcode 844
	 */

	@Test
	public void test1() {
		
		
		String s = "ab#c";
		String t = "ad#c";
		
		System.out.println(backspaceCompare(s,t));
	}
	
	

	@Test
	public void test2() {
		
		
		String s = "ab##";
		String t = "c#d#";
		
		System.out.println(backspaceCompare(s,t));
	}
	
	
	
	
	
	
	 public boolean backspaceCompare(String s, String t) {


			char [] s_c = s.toCharArray();
			char [] t_c = t.toCharArray();
			
			Stack<Character> stak1 = new Stack<Character>();
			Stack<Character> stak2 = new Stack<Character>();
			
			for (int i=0; i<s_c.length ;i++) {
				
				
				if(s_c[i]!='#') stak1.add(s_c[i]);
				else {
					if(!stak1.empty())stak1.pop();
				}
			}
			
			
			for (int j=0; j<t_c.length ;j++) {
					
	
				if(t_c[j]!='#') stak2.add(t_c[j]);
				else {
					
					if(!stak2.empty())stak2.pop();
				}
					
				}
			
			if (stak1.equals(stak2)) return true;
			else return false;
 }

}
