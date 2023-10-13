package Others;

import org.junit.Test;

public class GoodSubString {
	
	
	
	@Test
	
	public void Test1() {
		
		String input = "xyzzaz";
		
		System.out.println(countGoodSubstrings(input));
		
		
	}
	
	
	 public int countGoodSubstrings(String s) {
	        

	        
	        StringBuilder sb = new StringBuilder(s);

	    int count=0;
	        for (int i =0; i<s.length()-2;i++){
	        	
	        	
	           String k = s.substring(i, i+3);
	            if(k.charAt(0)!=k.charAt(1))
	            	if (k.charAt(0)!=k.charAt(2))
	            	if (k.charAt(1)!=k.charAt(2))
	            	count++;

	        }

	        return count;

	    }

}
