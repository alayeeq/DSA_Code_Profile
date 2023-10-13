package LinearSearch;

import org.junit.Test;

public class MaxProduct {

	
	@Test
	
	public void Test1() {
		
		int [] input_array = {2,7,1,5,4};
		
	System.out.println(	FindMaxProduct(input_array));
		
	}
	
	
	@Test
	
	public void Test2() {
		
		int [] input_array = {1,5,4,5};
		
	System.out.println(	FindMaxProduct(input_array));
		
	}
	
	@Test
	
	public void Test3() {
		
		int [] input_array = {3,4,5,2};
		
	System.out.println(	FindMaxProduct(input_array));
		
	}
	
  @Test
	
	public void Test4() {
		
		int [] input_array = {3,7};
		
	System.out.println(	FindMaxProduct(input_array));
		
	}


	private int FindMaxProduct(int[] input_array) {
		// TODO Auto-generated method stub
		
//{2,7,1,5,4};
		int max_index = -1;
		int sec_max_index = -1;
		int max = 0;
		int sec_max = 0;
			 
		
		for (int i = 0; i<input_array.length; i++ ) {
			
			
			/*if (i==0) {
					max = sec_max= input_array[i];
				
					max_index = sec_max_index= i; 
			}
			
			else {*/
			if (input_array[i]>max)
			{
				
				sec_max = max;
				max = input_array[i];
				
				max_index = i; 
			}
			
			else if (input_array[i]>sec_max){
				
				sec_max = input_array[i];
				
				sec_max_index = i; 
			}

				
			}
			
			
		
		
		//}
		
		//System.out.println(max);
		//System.out.println(max_index);
		//System.out.println(sec_max);
		//System.out.println(sec_max_index);
   
		int Product = (max-1)*(sec_max-1);
		return Product;
	}
	
	
	
}
