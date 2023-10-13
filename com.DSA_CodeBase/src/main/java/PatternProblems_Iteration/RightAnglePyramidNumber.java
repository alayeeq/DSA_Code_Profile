package PatternProblems_Iteration;

import org.junit.Test;

public class RightAnglePyramidNumber {

	
	@Test
	public void test1() {
		
		printRightPyramid();
		
		
	}

	private void printRightPyramid() {
		// TODO Auto-generated method stub
		
		
		for(int row = 1; row <=5 ; row++) {
			
			
			for (int col = 1 ; col<=row; col++)  {
				
				
				System.out.print(col);
				
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}
	
	
}
