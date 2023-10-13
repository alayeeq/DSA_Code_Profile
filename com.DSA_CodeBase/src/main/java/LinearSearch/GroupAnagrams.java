package LinearSearch;

import org.junit.Test;
import java.util.*;

public class GroupAnagrams {
	
	/*
	 * 
	 */
	
	@Test
	public void test1() {
		
		
		 String [] arr = {"eat","tea","tan","ate","nat","bat"};
		 
		 System.out.println(groupAnagrams(arr));
		 
	}
	
	private List<ArrayList<String>> groupAnagrams(String[] arr) {
		// TODO Auto-generated method stub
		
		HashMap <HashMap<Character, Integer> , ArrayList<String>> hm = new HashMap ();
		List<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		
		for (int i =0; i<arr.length ; i++) {
			
		  HashMap<Character, Integer> tmap= 	new HashMap<Character, Integer>();
		  
		  for (int j=0; j<arr[i].length(); j++) {
			  
			  
			  tmap.put(arr[i].charAt(j), (tmap.getOrDefault(arr[i].charAt(j),0)+1));
			  
		  }
		  ArrayList<String> temp_al = hm.getOrDefault(tmap, new ArrayList<String>());
		  temp_al.add(arr[i]);
		  hm.put(tmap,temp_al );
		  
		  
		  
			
			
		}
		
		for ( HashMap<Character, Integer> hmt : hm.keySet()) {
			
			output.add(hm.get(hmt));
		}
		
		
		return output;
	}

}
