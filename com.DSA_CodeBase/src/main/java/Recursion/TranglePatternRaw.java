package Recursion;

import org.junit.Test;

public class TranglePatternRaw {

	
	@Test
	public void test1() {
		
		int Row = 4;
		
		printTglePatRaw(Row);
		
	}

	private void printTglePatRaw(int row) {
		// TODO Auto-generated method stub
		
		if(row==0)return;
		int col = 0;
		
		printTglePatRaw(row,col);
		
	}

	private void printTglePatRaw(int row, int col) {
		// TODO Auto-generated method stub
		
		if(row==0) return;
		
		if(col<row) {
			
			printTglePatRaw(row,col+1);
			System.out.print("*");
			
			
		}
		
		else {
			printTglePatRaw(row-1,0);
			System.out.println();
			
		}
		
		
	}
}
