package Hashing;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramProblem {
	
	
	@Test
	public void test1() {
		
		String 	A = "anagram";
		String B = "nagaram";
		
		System.out.println(isBAnagram(A,B));
		System.out.println(isBAnagramM2(A,B));
		
		
		System.out.println(isBAnagramM3(A,B));
		
	}

	private boolean isBAnagramM3(String s1, String s2) {
		// TODO Auto-generated method stub

		int [] arr1 = new int [256];
		
		int [] arr2 = new int [256];
		for (int i=0; i<s1.length() ; i++){
		
		
			arr1[s1.charAt(i)] = arr1[s1.charAt(i)]+1;
		
		}
		
		for (int j=0; j<s2.length() ; j++){
		
		
			arr2[s2.charAt(j)] = arr2[s2.charAt(j)]+1;
		
		}
		
		
			
		if(	Arrays.equals(arr1,arr2)) return true;
		else return false;
	}

	private boolean isBAnagramM2(String a, String b) {
		// TODO Auto-generated method stub
		
		char [] a_A = a.toCharArray();
		char [] b_B = b.toCharArray();
		
		Arrays.sort(a_A);
		Arrays.sort(b_B);
		if(Arrays.equals(a_A, b_B))return true;
		
		
		else return false;
	}

	private boolean isBAnagram(String a, String b) {
		// TODO Auto-generated method stub
		
		HashMap <Character , Integer> hmA = new HashMap<Character , Integer>();
		HashMap <Character , Integer> hmB = new HashMap<Character , Integer>();
		
		for (int i=0; i<a.length();i++) {
			
			hmA.put(a.charAt(i),hmA.getOrDefault(a.charAt(i), 0)+1);
			
		}
		
		for (int j=0; j<b.length();j++) {
			
			hmB.put(a.charAt(j),hmB.getOrDefault(a.charAt(j), 0)+1);
			
		}

		if(hmA.equals(hmB)) return true;
		else return false;
		
	}
	

}
