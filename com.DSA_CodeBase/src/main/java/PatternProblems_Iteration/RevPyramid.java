package PatternProblems_Iteration;

import org.junit.Test;

public class RevPyramid {
	
	
	@Test
	public void invPyramid() {
		
		
		for (int row =6; row >= 1 ; row --) {
			
			for (int space =0; space <6-row; space++) {
				
				System.out.print(" ");
				
			}
			
			for (int col =1 ; col<=row ; col++) {
				
				System.out.print(" *");
				
			}
			
			for (int space =0; space <=5-row; space++) {
				
				System.out.print(" ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
	

}
