package TwoPointer;

import org.junit.Test;

public class BeautyOfK {

	
	/*
	 * convert int to Stringbuilder
	 * create a subString 0 to substring_size
	 * conver String to Integer
	 * check if substring_int is a divisor of int
	 * 	if yes count++
	 * 
	 * left =0
	 * right = k
	 * loop through k<input.length
	 * remove char(left) insertchar(right)
	 * repeat the check
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
			
			
	
	
	@Test
	public void Test1() {
		
		
		int input  = 430043;
		int substring_size = 2;
		
		countkbeauty (input , substring_size);
		
		
	}
	
	@Test
	public void Test2() {
		
		
		int input  = 430043;
		int substring_size = 3;
		
		countkbeauty (input , substring_size);
		
		
	}
	
	@Test
	public void Test3() {
		
		
		int input  = 240;
		int substring_size = 2;
		
		countkbeauty (input , substring_size);
		
		
	}


	private void countkbeauty(int input, int substring_size) {
		// TODO Auto-generated method stub
		
		int beautyofk = 0;
		String input_s =Integer.toString(input);
		
		StringBuilder sb_sub = new StringBuilder(input_s.substring(0,substring_size));
		
		int first_set = Integer.valueOf(sb_sub.toString());
		
		if (input%first_set ==0 )beautyofk = beautyofk+1;
		
		
		for (int left =0, right =substring_size ; right <input_s.length() ; right++) {
			
			sb_sub.deleteCharAt(left);
			sb_sub.insert(substring_size-1, input_s.charAt(right));
			int loop_set = Integer.valueOf(sb_sub.toString());
			if(loop_set!=0) {
			if (input%loop_set ==0 )beautyofk = beautyofk+1;
			}
			
		}
		
		
		System.out.println(beautyofk);
	}
	
	
}
