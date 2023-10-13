package LinearSearch;

import org.junit.Test;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

public class SortThePeople {
	
	@Test
	
	public void Test1() {
		
		
		
		int [] Height = {180,165,170};
		String [] names = {"Mary","John","Emma"};
		
	System.out.println(Arrays.toString(sortbyHeigh(Height,names)));	
		
	}

	private String[] sortbyHeigh(int[] Height, String[] hight2) {
		// TODO Auto-generated method stub
		
		TreeMap <Integer, String> TM = new TreeMap<Integer,String>();
		
		

		
		//LHM.get(0);
		for (int i =0 ; i<Height.length;i++ ) {
			
		
			TM.put(Height[i],hight2[i] );
			
			
			
		}
		LinkedHashMap <Integer, String> LHM = new LinkedHashMap<Integer, String>(TM);
	
		Set s =TM.descendingKeySet();
		List<String> al = new ArrayList<String>(s);
		al.get(0);
		 String [] output = new String[hight2.length];
		for (int i =0 ; i<Height.length;i++ ) {
		
			output[i] = TM.get(al.get(i));
			
			output[i] = LHM.get(i);
			
			
			
		}
			
			return output;
		}
		
		
	}


