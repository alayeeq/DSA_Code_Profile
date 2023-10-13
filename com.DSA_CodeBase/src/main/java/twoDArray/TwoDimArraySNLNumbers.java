package twoDArray;

import org.junit.Test;

public class TwoDimArraySNLNumbers {
	
	
	
	@Test
	public void test1() {
		
		int [] [] input = {
							{4,3,1},
							{4,5,2},
							{5,3,9}
				
						};
		
		
		findSmallNLarge (input);
		
		
		
	}

	private void findSmallNLarge(int [][] input) {
		// TODO Auto-generated method stub
		
		int small = Integer.MAX_VALUE;		
		int large = Integer.MIN_VALUE;
		for (int row =0; row <input.length; row++) {
			
			for (int col = 0; col <input[row].length ; col++) {
				
				if (input[row][col]>large) large = input[row][col];
				
				if (input[row][col]<small) small = input[row][col];
				
			}
			
			
		}
		
		System.out.println( "small =" + small +" ,large =" +large);
		
		
		
	}

}
