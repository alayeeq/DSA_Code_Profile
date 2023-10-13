package Stack;
import java.util.*;

import org.junit.Test;


public class MakeStringGreat {
	
	
	@Test
	public void test1() {
		
		String input = "leEeetcode";
	
		System.out.println(makeGood(input));
	}
	
	
	 public String makeGood(String s) {
	        

		 Stack<Character> st = new Stack();

	        char [] input = s.toCharArray();

	        for (int i=0; i<input.length ; i++){

	            if (i==0 || st.size()==0) 
	            {
	            st.add(input[i]);
	            }
	           else if(i>0 && input[i]+ 32== st.get(st.size()-1) || i>0 && input[i]-32== st.get(st.size()-1)  )
	           {
	             st.pop();
	           }
	              else {
	              st.add(input[i]);
	              }

	        }
	      

	        char[] output = new char[st.size()];
	        for (int z=0; z<st.size() ; z++){
	            
	            output [z] = st.get(z);

	        }

	        return new String(output);
	    }
	 
	 

}
