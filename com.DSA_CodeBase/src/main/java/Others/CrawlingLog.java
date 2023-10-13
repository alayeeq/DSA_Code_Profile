package Others;

import org.junit.Test;

public class CrawlingLog {
	
	
	@Test
	public void test1() {
		
		
		String [] logs = {"d1/","d2/","../","d21/","./"};
	System.out.println(minOperations(logs));
	}
	
	
    public int minOperations(String[] logs) {
        

        int output = 0;

        for (String s : logs){

                if(s.equals("../"))
                
                {
                 if (output>0) output--;
                }
                else if(s.equals("./")) ;
                else output++;


        }

        return output;
    }

}
