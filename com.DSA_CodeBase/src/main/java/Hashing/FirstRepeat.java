	package Hashing;

import org.junit.Test;
import java.util.HashMap;

public class FirstRepeat {
	
	
	@Test
	public void test1() {
		
		
		int [] arr = {1, 5, 3, 4, 3, 5, 6};
		
		System.out.println(firstRepeat (arr));
		
	}

	private int firstRepeat(int[] arr) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
		int small = Integer.MAX_VALUE;
		
		for (int i=0; i<arr.length ; i++) {
			
				if(hm.containsKey(arr[i])) {
			if(hm.get(arr[i])<small) small = hm.get(arr[i]);
				}
				
				else hm.put(arr[i], i);
			
			
			
			
			
		}
		
		return small+1;
	}

}
