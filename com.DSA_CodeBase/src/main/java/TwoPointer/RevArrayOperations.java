package TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class RevArrayOperations {
	
	
	
	
	
	
	
	
	
	@Test
	public void Test1() {
		
		int [] input = {9,8,7,6,5,4,3,2,1,0};
		int [][] operations = {{0,9} , {4,5}};
		
		
		
		System.out.println(Arrays.toString(performOperations(input,operations)));
		
		
	}
	
	
    public  int []  performOperations(int [] input, int [][] operations) {


        //outer loop for the operations array 
        int [] input_temp = input;
        for (int i=0; i<operations.length;i++){
            
         input_temp =    reverseInd (input_temp ,operations[i] );
            
            
            
        }
                


        return input_temp;


}
	
	
	
	  public int [] reverseInd( int [] input , int [] operation) {
	        
	        
          for (int left=operation[0] , right= operation[1]; left<right; left++ , right--){
              
              
              int temp = input [left];
              input [left] = input [right];
              input [right] = temp;
              
              
          }
      
      
      return input;
  }
	

}
