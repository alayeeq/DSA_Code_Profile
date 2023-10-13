package SlidingWindow;

import org.junit.Test;
import java.util.HashMap;

public class AddSumNegSW {

	
	@Test
	public void Test1() {
		
		Integer [] input_array = {10,15,-5,15,-10,5};
		
		Integer Target_sum = 5;
		
		
	SumMatchwithTarget(input_array, Target_sum);
	
	
		
	}

	private void SumMatchwithTarget(Integer[] input_array, Integer target_sum) {
		// TODO Auto-generated method stub
		
		HashMap <Integer, Integer> HM = new HashMap<Integer, Integer>();
		Integer sum = 0;
		Integer i=0;
		Integer first =null ;
		sum = sum+input_array[i];
		HM.put(sum, i);
		if (sum ==target_sum) System.out.println(i +"," +i);
		
		
		for ( i=1; i<input_array.length ; i++) {
			
			sum = sum+input_array[i];
		 if(HM.containsKey(sum-target_sum)) {
			 
		first	=  HM.get(sum-target_sum);
			 System.out.println(first+1 +","+i);
			 break;
		 }
			 
		 else HM.put(sum, i);
			
			
			
		}
		
		
	}
	
	
}
