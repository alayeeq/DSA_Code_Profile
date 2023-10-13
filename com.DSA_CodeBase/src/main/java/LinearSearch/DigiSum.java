package LinearSearch;
import org.junit.Test;
public class DigiSum {
	/*
	 * leetCode 258
	 */
	
	@Test
	 public void Find_digit_sum () {
		
		int input = 5767;
		int output = 7;
		System.out.println(get_digitsum( input));
	}

	
	@Test
	 public void Find_digit_sum2 () {
		
		int input = 0;
		int output = 0;
		System.out.println(get_digitsum( input));
	}
	
	
	@Test
	 public void Find_digit_sum3 () {
		
		int input = Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		int output = 4;
		System.out.println(get_digitsum( input));
	}
	
	private int get_digitsum(int input) {
		// TODO Auto-generated method stub
		
	
		
	  int [] input_int_arry = 	con_int_arry (input);
	  if (input_int_arry.length == 1) return input;
	  
	  else {
	  int sum_all = 0;
	  while (input_int_arry.length >1) {
		  int sum = 0;
		  int new_sum = 0;
		  for (int i =0 ; i <input_int_arry.length ; i++) {
			  
			   new_sum = new_sum+   input_int_arry[i];
			 
			  
			  
		  }
		  sum  = sum+ new_sum;
		  input_int_arry = con_int_arry(sum);
		  sum_all = sum;
	  }
	  	
		return sum_all;
	  }
	}

	private int [] con_int_arry(int input) {
		// TODO Auto-generated method stub
		
		char [] input_c = String.valueOf(input).toCharArray();
		
		int [] input_i = new int [input_c.length] ;
		
		for (int i =0 ; i <input_c.length ; i++) {
			
			input_i[i]= 	Character.getNumericValue(input_c[i]);
		}
		
		return input_i;
		 
		
	}
	 

}
