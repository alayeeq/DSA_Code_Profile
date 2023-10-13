package Stack;
import java.util.*;

import org.junit.Test;



public class BaseBallGame {
	
	
	@Test
	public void test1() {
		
		
		String [] operations = {"5","2","C","D","+"};
		
		
		System.out.println(calPoints(operations));
		
	}
	
	
	@Test
	public void test2() {
		
		
		String [] operations = {"5","-2","4","C","D","9","+","+"};
		
		
		System.out.println(calPoints(operations));
		
	}
	
	
	
    public int calPoints(String[] operations) {


        ArrayList<Integer> al = new ArrayList<Integer> ();

        for (int i=0; i<operations.length; i++){

            if(operations[i].equals("C")){

                al.remove(al.size()-1);

            }

              else if(operations[i].equals("D")){
                   al.add(al.get(al.size()-1)*2);
            }

            
              else if(operations[i].equals("+")){
                   al.add(al.get(al.size()-1)+al.get(al.size()-2));
                
            }
            else{

                al.add(Integer.valueOf(operations[i]));
                

            }

        }
     
        int output =0;
        for (Integer j : al){

            output = output+j;

        }

        return output;

    }

}
