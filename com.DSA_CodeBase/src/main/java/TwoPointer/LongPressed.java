package TwoPointer;

import org.junit.Test;

public class LongPressed {
	
	
	@Test
	
	public void Test1() {
		
		
		String name = "alex" ;
		String typed_name = "aaleex";
		
		System.out.println(isLongPressed(name, typed_name));
		
	}
	
	
	
	@Test
	
	public void Test2() {
		
		
		String name = "alex" ;
		String typed_name = "aaleexeex";
		
		System.out.println(isLongPressed(name, typed_name));
		
	}
	
	
	@Test
	
	public void Test3() {
		
		
		String name = "bdad" ;
		String typed_name = "bbbd";
		
		System.out.println(isLongPressed(name, typed_name));
		
	}

	private boolean isLongPressed(String name, String typed_name) {
		// TODO Auto-generated method stub
		boolean output = true;
		
		/*
		if(name.charAt(0)!=typed_name.charAt(0)|| name.charAt(name.length()-1)!=typed_name.charAt(typed_name.length()-1) ) {
			output = false;
			return output;
		}
		*/
		int j=0;
		for (int i=0; i<=name.length(); i++) {
			
				if (i<=name.length()-1 && j>=typed_name.length() ) 
					
				{
					output = false;
					return output;
					
				}
				
						
				for (; j<typed_name.length() ; j++   ) {
					
					
					if(i>=name.length()) {
						
						if( typed_name.charAt(j)==name.charAt(i-1) )  continue;
						else {
							output = false;
							return output;
							
						}
						
					}
					
					else {	
				
				if(typed_name.charAt(j)==name.charAt(i)) {
					j++;
					
					break;
				}
				else if( typed_name.charAt(j)==name.charAt(i-1) )  continue;
				
				else {
					output = false;
					return output;
					
				}
				
				}
				
			}
			
			
			
		}
		
		
		return output;
	}

}
