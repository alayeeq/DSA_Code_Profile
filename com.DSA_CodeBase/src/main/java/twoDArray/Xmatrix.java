package twoDArray;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Xmatrix {
	
	
	
	@Test
	
	public void Testsort() {
		
		
		int [] input = {4,3,2,1};
		
		List<Integer> ls = new ArrayList<Integer>();
		
		for (int a : input) {
			
			
			ls.add(a);
		}
		
		System.out.println(ls);
		Collections.sort(ls);
		
		System.out.println(ls);
		
		
		
		
	}
	
	@Test
	
	public void Test1() {
		
		
		int [][] arr = { {1,0,1},
					 	 {0,1,0},
					 	 {1,0,1}
		};
						
		System.out.println(isXmatrix(arr));
		
	}
	
	
	private boolean isXmatrix(int[][] arr) {
		// TODO Auto-generated method stub
		
		
		
		for (int row = 0; row <arr.length ; row++) {
			
			for (int col = 0; col <arr[row].length ; col++)
			{
				
			if(row==col )	{
				 if (arr[row][col]!=0) continue;
				 else return false;
			}
			else if (col==arr[row].length-1-row  ) {
				
				if (arr[row][col]!=0) continue;
				else return false;
			}
			
			else if(arr[row][col]!=0) return false;
			
			}
		}
		
		
		return true;
	}


	@Test
	
	public void Test2() {
		
		
		int [][] arr = { {1,0,0,1},
					 	 {0,1,1,0},
					 	 {0,1,1,0},
					 	 {1,0,0,3}
		};
						
			
		System.out.println(isXmatrix(arr));
	}
	
	
	@Test
	
	public void Test3() {
		
		
		int [][] arr = { {1,1,0,1},
					 	 {0,1,1,0},
					 	 {0,1,1,0},
					 	 {1,0,0,1}
		};
						
			
		System.out.println(isXmatrix(arr));
	}
	
	@Test
	
	public void Test4() {
		
		
		int [][] arr = { {1,0,1},
					 	 {0,1,0},
					 	 {0,0,1}
		};
						
			
		System.out.println(isXmatrix(arr));
	}
	
	
	
	

}
