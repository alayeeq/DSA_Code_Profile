package SlidingWindow;

import java.util.LinkedHashMap;

import org.junit.Test;

public class GoodStringnosubsize {
	
	
	@Test
	public void Test1()
	
	{
		 
		String s = "aababcabc";
		int substring_size =3;
		System.out.println("first test results are");
		System.out.println("count of good string are " +countGoodSubstrings (s));
		
		
	}
	
	@Test
	public void Test2()
	
	{
		 
		String s = "a";
		int substring_size =3;
		System.out.println("first test results are");
		System.out.println("count of good string are " +countGoodSubstrings (s));
		
		
	}
	
	
	 public int countGoodSubstrings(String s) {
	        
		 
			if(s.length()<3) 	{
				System.out.println("Invalid Input");
				return 0;
			}
			else {
		 
		 LinkedHashMap<Character, Integer> map =  new LinkedHashMap<Character, Integer>();
		
		
	int count =0;
		
		for (int j=0 ; j< 3 ; j++) {
			
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
		
			
		}
		
		if (map.keySet().size()==3)
		{
			count++;
		}
		
		for (int i=3; i <s.length() ; i++)
		{
			if (map.get(s.charAt(i-3))>1) {
				
				map.put(s.charAt(i-3),map.get(s.charAt(i-3))-1);
				
			}
			
			else if (map.get(s.charAt(i-3))==1) {
				map.remove(s.charAt(i-3));
				
			}
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			if (map.keySet().size()==3)
			{
				count++;
			}
			
		}
		return count;
			}
	
 }

}
