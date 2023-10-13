package LinearSearch;

import org.junit.Test;

public class DefrangeIP {
	
	
	/*
	 * 
	 * iterate through the String using CharAt function 
	 * create a StringBuilder ;
	 * append the sb with charAt String
	 * 	if charAt value is . then append [.] to the Sb
	 * retrun sb.toString
	 * 
	 * 
	 */
	
	
	@Test
	public void Test1() {
		
		
		String Input_IP =  "1.1.1.1";
		deFrangeIP(Input_IP);
		
	}
	
	
	@Test
	public void Test2() {
		
		
		String Input_IP =  "255.100.50.0";
		deFrangeIP(Input_IP);
		
	}

	private String deFrangeIP(String input_IP) {
		// TODO Auto-generated method stub
		
		
		
		StringBuilder sb = new StringBuilder("");
		
		for (int i=0; i<input_IP.length(); i++) {
			
			char temp = input_IP.charAt(i);
			if (temp == '.') sb.append("[.]");
			else sb.append(temp);
			
			
			
		}
		
		return sb.toString();
		//System.out.println(sb);
		
		
		
		
		
	}

}
