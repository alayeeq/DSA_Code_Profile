package DynamicProgramming;

import org.junit.Test;
import java.util.*;

public class FibMem {
	
	
	@Test
	public void test1() {
		
		
		int input = 30;
		
		System.out.println(fibser(input));
		
		
		
		
	}

	private int fibser(int input) {
		// TODO Auto-generated method stub
		
		HashMap <Integer , Integer> hm = new HashMap <Integer , Integer> ();
		
		hm.put(0, 0);
		hm.put(1, 1);
		
	 return	fibser (input, hm);
		
		
		
	}

	private int fibser(int input, HashMap<Integer, Integer> hm) {
		// TODO Auto-generated method stub
		
		if(hm.containsKey(input)) return hm.get(input);
		
		
		else {
			
			int temp = fibser(input-1) + fibser(input-2);
			hm.put(input, temp);
			return temp;
		}
		
		
		
	}
	
}
