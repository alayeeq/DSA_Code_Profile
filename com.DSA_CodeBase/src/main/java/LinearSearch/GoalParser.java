package LinearSearch;

import org.junit.Test;

public class GoalParser {

	
	@Test
	
	public void test1() {
		
		
		String input = "G()(al)";
		
		System.out.println(interpret(input));
	}
	
	  public String interpret(String command) {

	        StringBuilder sb = new StringBuilder("");;
	        for (int i=0; i<command.length(); i++){

	                if(command.charAt(i)==')') {

	                        if(command.charAt(i-1)=='(') sb.append("o");
	                        else sb.append("al");


	                } 
	                
	                else if (command.charAt(i)=='G') sb.append("G");
	            


	        }

	        return sb.toString();

	    }
	
}
