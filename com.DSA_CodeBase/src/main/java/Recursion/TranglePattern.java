package Recursion;

import org.junit.Test;

public class TranglePattern {
	
	
	
	@Test
	public void test1() {
		
		int Row = 4;
		
		printTglePat(Row);
		
	}

	private void printTglePat(int row) {
		// TODO Auto-generated method stub
		if (row ==0) return;
		int col = 0;
		printTglePat(row,col);
		
		
		
	}

	private void printTglePat(int row, int col) {
		// TODO Auto-generated method stub
		
		if (row==0) return;
		
		if (col<row) {
			
			System.out.print("*");
			printTglePat(row,col+1);
			
		}
		
		else {
			
			System.out.println();
			printTglePat(row-1, 0);
		}
		
	}

}
