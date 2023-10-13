package LinearSearch;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MinimuAbsoluteDiff {
	
	
	@Test
	public void test1() {
		
		int [] arr = {4,2,1,3};	
		
	System.out.println(	minAbs(arr));
		
	}

	private List<List<Integer>> minAbs(int[] arr) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> output = new ArrayList <List<Integer>> ();
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i=0; i<arr.length-1 ;i++) {
			
			int temp = Math.abs( arr[i] - arr[i+1]);
			
			min = Math.min(min, temp);
			
		}
		
		int min_diff = min;
		
		
		for (int j=0; j<arr.length-1; j++) {
			
			if (Math.abs( arr[j] - arr[j+1])==min_diff) {
			
			List<Integer> temp = Arrays.asList(arr[j], arr[j+1]);
			
			output.add(temp);
			}
		}
		return output;
	}

}
