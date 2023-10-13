package Recursion;

import org.junit.Test;
import java.util.*;

public class MinSteps {

	
	@Test
	public void test1() {
		
		int [] arr = {2,3,4,3,3};
		
	System.out.println( findOperations(arr));
	
		
		
		
	}

	private int findOperations(int[] arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;
		
		int counter = 0;
		for (int i=0; i<arr.length ; i++) {
			
			min = Math.min(min, arr[i]);
			
			al.add(arr[i]);
			
			
			
		}
		
		
		
	return  counter=	findOperations(al, min, ++counter);
		
		
		
	}

	private int findOperations(ArrayList<Integer> al, int min, int counter) {
		// TODO Auto-generated method stub
		
		int temp_min = Integer.MAX_VALUE;
		int zero_counter = 0;
		int limit = al.size();
		for (int i=0; i<limit; i++) {
			
			int reduced_i = al.get(i-zero_counter) -min;
			
			if (reduced_i==0) {
				
				
				al.remove(i-zero_counter);
				zero_counter++;
			}
			
			if(reduced_i>0) {
				temp_min= Math.min(temp_min, reduced_i);
				al.set(i-zero_counter, reduced_i);
				
			}
			
			
			
		}
		
		if(al.size()==0) return counter;
		
		else return findOperations(al,temp_min , ++counter);
	}
	
}
