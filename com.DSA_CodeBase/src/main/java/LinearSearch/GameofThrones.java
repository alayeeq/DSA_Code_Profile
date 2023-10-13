package LinearSearch;

import org.junit.Test;

public class GameofThrones {
	
	/*
	 * https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true
	 */
	
	@Test
	public void Test1() {
		
		String input = "aaabbbb";
		System.out.println(gameOfThrones(input));
	}
	
	
	@Test
	public void Test2() {
		
		String input = "cdcdcdcdeeeef";
		System.out.println(gameOfThrones(input));
	}
	
	
	@Test
	public void Test3() {
		
		String input = "cdefghmnopqrstuvw";
		System.out.println(gameOfThrones(input));
	}
	
	
	
	
	public static String gameOfThrones(String s) {
	    // Write your code here
	    
	    
	    
	        if(s.length()==1) return "YES";
	        else if(s.length()==2){
	            
	            if(s.charAt(0)==s.charAt(1)) return "YES";
	            else return "NO";
	            
	        }
	    
	    else {
	        int [] alp_array = new int [123];
	        
	        char [] s_c = s.toCharArray();
	        
	        for (int i=0; i<s_c.length ; i++){
	            
	            alp_array[s_c[i]]++;
	            
	        }
	        int limit =0;
	        for (int j=alp_array.length-1; j>96 ;j--){
	            
	            if(alp_array[j]%2!=0) limit++;
	            
	            if (limit>1) return "NO";
	            
	        }
	            return "YES";
	    }
	    }


}
