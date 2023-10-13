package PatternProblems_Iteration;

import org.junit.Test;

public class PyramidShape {
	
	
	/*
	 *  All diamond problems can be solved using Two for loops
	 *  	Outer loop is for rows and Inner loop is for columns
	 *  Only difference will be to formula to print which changes problems to problem 
	 */
	
	@Test
	
	public void Test1() {
		
		int number_of_rows = 5;
		
		printpyramid(number_of_rows);
	}

	private void printpyramid(int number_of_rows) {
		// TODO Auto-generated method stub
		
		
		
		
		
		for (int row = 1 ; row <= number_of_rows ; row ++) {
			
			
			
			for (int spaces = 0; spaces <number_of_rows-row ; spaces++ ) {
				System.out.print(" ");
				
			}
			
			
			for (int column =0  ; column < row ; column++) {
			
			System.out.print(" *");
			}
			
			System.out.println();
		}
		
		
		
	}
	

}
