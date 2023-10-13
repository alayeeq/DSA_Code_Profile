package PatternProblems_Iteration;

import org.junit.Test;

public class RightAnglePyramidInv {
	
	
	
	@Test
	public void test1() {
		
		printRightPyramidInv();
		
		
	}

	private void printRightPyramidInv() {
		// TODO Auto-generated method stub
		
		
		for(int row = 5; row >=1 ; row--) {
			
			
			for (int col = 1 ; col<=row; col++)  {
				
				
				System.out.print("*");
				
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}


}
