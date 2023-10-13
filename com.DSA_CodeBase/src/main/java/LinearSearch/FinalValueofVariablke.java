package LinearSearch;

import org.junit.Test;

public class FinalValueofVariablke {
	
	
	
	/*
	 *    initialize x to 0
	 *    loop through the string [] 
	 *    if element is X++ or ++X incremnt x
	 *    else if X-- or --X decreemnt x
	 *    
	 *    return x 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	
	public void Test1() {
		
		
		String [] Operations = {"X++", "++X" , "--X", "X--"}; 
		
		System.out.println(findFinalValue (Operations));
		
	}
	
	@Test
	
	public void Test2() {
		
		
		String [] Operations = {}; 
		
		System.out.println(findFinalValue (Operations));
		
	}
	
	@Test
	
	public void Test3() {
		
		
		String [] Operations = {"X++", "++X" , "++"}; 
		
		System.out.println(findFinalValue (Operations));
		
	}
	
	@Test
	
	public void Test4() {
		
		
		String [] Operations = {"--X","X++","X++"}; 
		
		//System.out.println(findFinalValue (Operations));
		
		int x = '+'+'+'+'X';
		int y ='X'+ '-'+'-';
		
	//	System.out.println(x);
	//	System.out.println(y);
		
		
		
		System.out.println(findFinalValueM2 (Operations));
		
		
		
	}
	
	
	private int findFinalValueM2(String[] operations) {
		// TODO Auto-generated method stub
		
		int p = '+'+'+'+'X';
		int n ='X'+ '-'+'-';
		

		if (operations.length<1) throw new NullPointerException("not a valid input");
		
		int x = 0;
				
				for (int i=0; i<operations.length; i++) {
					
					if (getAscii(operations[i])==p ) x++;
					else if (getAscii(operations[i])==n ) x--;
						
					
				}
		
		
			return x;
	}

	public int getAscii (String s) {
		
		int x=0;
		if (s.length()==3) {
		for ( int k =0; k<s.length() ;k++) {
			
			x = x+s.charAt(k);
			
			
			
		}
		
		}
		return x;
		
		
	}
	

	private int findFinalValue(String[] operations) {
		// TODO Auto-generated method stub
		
		
		if (operations.length<1) throw new NullPointerException("not a valid input");
		
		int x = 0;
				
				for (int i=0; i<operations.length; i++) {
					
					if (operations[i]=="++X" ||operations[i]== "X++") x++;
					else if (operations[i]=="--X" ||operations[i]== "X--") x--;
						
					
				}
		
		
			return x;
		 
		
	}
	

}
