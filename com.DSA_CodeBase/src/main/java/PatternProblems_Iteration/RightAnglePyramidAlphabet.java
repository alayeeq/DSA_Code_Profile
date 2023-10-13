package PatternProblems_Iteration;

import org.junit.Test;

public class RightAnglePyramidAlphabet {


	@Test
	public void test1() {
		
		printRightPyramid();
		
		
	}

	private void printRightPyramid() {
		// TODO Auto-generated method stub
		
		
		for(int row = 65; row <70 ; row++) {
			
			
			for (int col = row ; col<=row+(row-65); col++)  {
				
				
				System.out.print((char) row);
				
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}
	
}
