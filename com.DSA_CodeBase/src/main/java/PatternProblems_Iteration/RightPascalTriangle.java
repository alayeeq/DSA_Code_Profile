package PatternProblems_Iteration;

import org.junit.Test;

public class RightPascalTriangle {
	
	
	@Test
	
	public void Test1() {
		
		int number_of_rows = 5;
		System.out.println("Output when number of rows is " + number_of_rows);
		printRightPascalTriangle(number_of_rows);
		
		
	}
	
	@Test
	
	public void Test2() {
		
		int number_of_rows = 10;
		
		System.out.println("Output when number of rows is " + number_of_rows);
		printRightPascalTriangle(number_of_rows);
		
		
	}
	
	
	@Test
	
	public void Test3() {
		
		int number_of_rows = 1;
		System.out.println("Output when number of rows is " + number_of_rows);
		printRightPascalTriangle(number_of_rows);
		
		
	}

	private void printRightPascalTriangle(int number_of_rows) {
		// TODO Auto-generated method stub
		
		int c =  0;
		
		for (int row = 1 ; row <2*number_of_rows ; row ++) {
			
			 if (row >number_of_rows) c = number_of_rows -(row -number_of_rows);
			 
			 else c = row;
			 
			 for (int column = 0 ; column <c ; column ++) {
				 
				 System.out.print("*");
			 }
			 
			 System.out.println();
			
		}
		
		
		
		
	}
	
	

}
