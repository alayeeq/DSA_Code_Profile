package PatternProblems_Iteration;

import org.junit.Test;

public class SandGlassStarshape {

	
@Test
	
	public void Test1() {
		
		int number_of_rows = 5;
		
		printpyramid(number_of_rows);
		System.out.println();
	}

@Test

public void Test2() {
	
	int number_of_rows = 10;
	
	printpyramid(number_of_rows);
	System.out.println();
}


@Test

public void Test3() {
	
	int number_of_rows = 1;
	
	printpyramid(number_of_rows);
	System.out.println(); 
}



	private void printpyramid(int number_of_rows) {
		// TODO Auto-generated method stub
		
		
				int space_limit  = 0;
				int star_limit = 0;
		
		
		for (int row = 1 ; row <=2*    number_of_rows ; row ++) {
			
			
			if (row<=number_of_rows) 
			{
				star_limit =  number_of_rows- row+1;
				space_limit = number_of_rows-(number_of_rows -row);
			}
			
			if (row>number_of_rows) 
			{
				star_limit =   row -number_of_rows;
				space_limit =2* number_of_rows +1 -row; //(row-(number_of_rows+1) )
			}
			
			
			for (int spaces = 0; spaces <space_limit ; spaces++ ) {
				System.out.print(" ");
				
			}
			
			
			for (int column =0  ; column < star_limit ; column++) {
			
			System.out.print(" *");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
}
