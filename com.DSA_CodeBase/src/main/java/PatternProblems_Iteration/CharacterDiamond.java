package PatternProblems_Iteration;

import org.junit.Test;

public class CharacterDiamond {
	
	
	
	@Test
	 public void Test1() {
		
		char Character_upto = 'F';
		
		print_char_diamonnd(Character_upto);
		
		
	}
	
	
	@Test
	 public void Test2() {
		
		char Character_upto = 'Z';
		
		print_char_diamonnd(Character_upto);
		
		
	}

	private void print_char_diamonnd(char character_upto) {
		// TODO Auto-generated method stub
		
		
		char Start_char = 'A';
		char End_char = character_upto;
		int space_limit =0;
		int column_limit = 0;
		int row_limit = 0;
		int center_spact_limit = 0;
		
		
		
		
		
		for (int start = (int)Start_char; start <=(int)End_char+((int)End_char-(int)Start_char) ; start++ ) {
			
			
			
			
			if (start <=(int)Start_char || start == (int)End_char+((int)End_char-(int)Start_char)) column_limit = 1;
			else column_limit = 2;
			
			if(start <=(int)End_char) {
				
				space_limit = (int)End_char - start;
				center_spact_limit =  start -((int)Start_char-1);
			}
			else
				
				{
				space_limit = start -(int)End_char ;			
				center_spact_limit = (int)End_char+((int)End_char-(int)Start_char+1) - start;
				}	
				//	space_limit =2* number_of_rows +1 -row; 
			for (int spaces = 0; spaces <space_limit; spaces++) {
				
				System.out.print(" ");
				
			}
			
			
			for (int columns = 0; columns <column_limit; columns++) {
				
				
				if (start <=(int)End_char) System.out.print(""+(char)start);
				else System.out.print(""+(char)(End_char -(start - End_char)));
				
				
				for (int spaces = 1; spaces <=center_spact_limit-1; spaces++) {
					
					System.out.print("  ");
				
			}
			

				
			}
			
			System.out.println();
			}
			
			
		
			
		}
		
		
	}
	


