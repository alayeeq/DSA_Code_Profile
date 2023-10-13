package Others;

import org.junit.Test;
import java.util.TreeMap;

public class BestSharePrice {
	
	
	/*
	 *    
	 * 
	 * 
	 * 
	 */
	
	
	
	@Test
	public void test1() {
		
		int [] arr = {4,6,3,2,7,1};
		
		findbestdaytoBuy ( arr);
		//findbestdaytoBuytwo ( arr);
		
	} 
	
	
	

	private void findbestdaytoBuytwo(int[] arr) {
		// TODO Auto-generated method stub
		
		
		TreeMap <Integer , Integer> tm = new TreeMap<Integer , Integer>();
		
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		int max_profit = 0;
		int max = 0;
		int max_index = -1;
		
		tm.put(arr[0], 0);
		for (int i=1 ; i< arr.length ; i++) {
			
			
			min = tm.firstKey();
			
			
			if (arr[i] - min > max_profit ) {
				
				max_profit = arr[i] - min ;
				max_index =i;
				min_index = tm.get(tm.firstKey());
			}
			
			tm.put(arr[i], i);
			
			
		}
		System.out.println("Best Day to Buy " +min_index);
		System.out.println("Best Day to sell " +max_index);
		
		
	}  




	private void findbestdaytoBuy(int[] arr) {
		// TODO Auto-generated method stub
		
		int min = 0;
		int min_index = -1;
		
		int max_profit = 0;
		
		int max_index = -1;
		int temp_min_index = 0;
		int temp_min_value = arr[0];
		
		for (int i=1; i<arr.length ; i++ ) {
			
			
			
			if(max_profit < arr[i]-temp_min_value) {
				
				
				
				 min = temp_min_value;
				 min_index = temp_min_index;
				 
				 max_profit = arr[i]-min;
				 max_index = i;
			}
			
			
			
			 if (arr[i]<temp_min_value) {
				 
				 temp_min_value = arr[i];
				 temp_min_index = i;
			 }
			 
			 
			
			
		}
		
		
		System.out.println("Best Day to Buy " +min_index);
		System.out.println("Best Day to sell " +max_index);
		
	}

}
