package twoDArray;

import org.junit.Test;

public class MatrixDiagonalSum {
	
	
	@Test
	public void Test1() {
		
		int [][] input_sq_array = { 
									{1,2,3},
									{4,5,6},
									{7,8,9}
									};
				
		System.out.println(sumOfDiagoals(input_sq_array));
		System.out.println(sumOfDiagoalsM2(input_sq_array));
		
		
	}
	
	@Test
	public void Test2() {
		
		int [][] input_sq_array = { 
									{1,2,3,4},
									{4,5,6,7},
									{7,8,9,0},
									{1,1,1,1}
									};
				
		System.out.println(sumOfDiagoals(input_sq_array));
		System.out.println(sumOfDiagoalsM2(input_sq_array));
		
	}
	
	@Test
	public void Test3() {
		
		int [][] input_sq_array = { 
									{1}
									};
				
	System.out.println(sumOfDiagoals(input_sq_array));
	System.out.println(sumOfDiagoalsM2(input_sq_array));
		
		
	}

	private int sumOfDiagoals(int[][] input_sq_array) {
		// TODO Auto-generated method stub
		int First_diagonal_sum = 0;
		int Sec_diagonal_sum = 0;
				
		
		for (int row = 0; row <input_sq_array.length;row++) {
			
			for (int col =0 ; col <input_sq_array[row].length; col++) {
				
				if(row == col) First_diagonal_sum = First_diagonal_sum+ input_sq_array[row][col];
				
				else if (col ==input_sq_array[row].length-1 -row ) {
					
					//if (col!=row)
						Sec_diagonal_sum = Sec_diagonal_sum+ input_sq_array[row][col];
					
				}
				
				
			}
			
			
			
		}
		
		
		return First_diagonal_sum + Sec_diagonal_sum;
		
		
	}
	

	private int sumOfDiagoalsM2(int[][] input_sq_array) {
		// TODO Auto-generated method stub
		int First_diagonal_sum = 0;
		int Sec_diagonal_sum = 0;
				
		
		for (int row = 0; row <input_sq_array.length;row++) {
		
			
			First_diagonal_sum = First_diagonal_sum + input_sq_array [row][row];
			
			if (input_sq_array[row].length -1-row !=row)
			Sec_diagonal_sum = Sec_diagonal_sum + input_sq_array [row][input_sq_array[row].length -1-row];
			
		}
		
		
		return First_diagonal_sum + Sec_diagonal_sum;
	}
	
	
}
