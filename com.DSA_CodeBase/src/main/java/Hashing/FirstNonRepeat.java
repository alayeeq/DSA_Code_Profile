package Hashing;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class FirstNonRepeat {

	
	@Test
	public void test1() {
		
		String s = "lets code";
		
		System.out.println(firstRepeat(s));
		
	}
	
	@Test
	public void test2() {
		
		String s = "love to code. lets code";
		
		System.out.println(firstRepeat(s));
		
	}
	
	@Test
	public void test3() {
		
		String s = "ooove to code. lets code";
		
		System.out.println(firstRepeat(s));
		
	}
	
	@Test
	public void test4() {
		
		String s = "leetcode";
		
		System.out.println(firstRepeat(s));
		
	}
	


	private int firstRepeat(String s) {
		
		
		LinkedHashMap <Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
		
		
		
		char [] s_c = s.toCharArray();
		
		for (int i = 0; i<s_c.length ; i++) {
			
			lhm.put(s_c[i], lhm.getOrDefault(s_c[i], 0)+1 );
			
			if(!hm.containsKey(s_c[i])) {
				
				hm.put(s_c[i], i);
				
			}
				
		}
		
		char min_repeat_char ='0'; 
		
			for (char k : lhm.keySet()) {
				
				if(lhm.get(k)==1) {
					
					min_repeat_char = k;
					break;
					
				}
				
			}
			
			
			return hm.get(min_repeat_char);
			
		
		// TODO Auto-generated method stub
		//return null;
	}
	
	
	
	
	
}

/*
 * private static int nonRepeat(String s) {
        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hmap.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
 * 
 * 
 */
