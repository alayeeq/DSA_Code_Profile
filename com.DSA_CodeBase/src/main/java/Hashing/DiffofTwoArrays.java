package Hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.junit.Test;

public class DiffofTwoArrays {
	/*
	 * 
	 * [[-81,-35,-10,-28,-61,-45,-15,14,-80,63],[-1,2,69,-40,41,10,-43,-44,10,,]]
	 * [[-81,-35,-10,-28,-61,-45,-15,14,-80,63],[-1,2,69,-40,41,10,-43,-44]]
	 */
	
	
	@Test
	public void test1() {
		
		int [] num1 = {1,2,3,3};
		int [] num2 = {1,1,2,2};
		
		System.out.println(finddifforArray(num1,num2));
		
		System.out.println(finddifforArrayM2(num1,num2));
		
		
	}

	private List <ArrayList<Integer>>  finddifforArray(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		HashMap <Integer,Integer> s1 = new HashMap <Integer,Integer> ();
		HashMap <Integer,Integer> s2 = new HashMap <Integer,Integer> ();
		
		
		
		for (int a : num1) {
			
			s1.put(a,1);
		}
		for (int b : num2) {
			
			s2.put(b,1);
		}
		
		
		for (int c : s1.keySet()) {
			
			if(!s2.containsKey(c)) {
				ar1.add(c);
				
			}
		}
		
	for (int d : s2.keySet()) {
			
			if(!s1.containsKey(d)) {
				ar2.add(d);
				
			}
		}
		
		
		List <ArrayList<Integer>> output = new ArrayList <ArrayList<Integer>>  () ;
		
		output.add(ar1);
		output.add(ar2);
		
		return output;
	}
	
	
	private List <List<Integer>> finddifforArrayM2(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		HashMap <Integer,Integer> s1 = new HashMap <Integer,Integer> ();
		HashMap <Integer,Integer> s1_temp = new HashMap <Integer,Integer> ();
		HashMap <Integer,Integer> s2 = new HashMap <Integer,Integer> ();
		
		
		
	for (int a : num1) {
			
			s1.put(a,1);
			s1_temp.put(a,1);
		}
		
		
		for (int c : num2) {
			
			if(!s1.containsKey(c)) {

				s2.put(c,1);
				
				
				
					
					
				}
			else {
				s1_temp.remove(c);
			}
		}
		

	for (int t : s2.keySet()) {
			
			
				ar1.add(t);
				
			
		}

	for (int d : s1_temp.keySet()) {
			
			
				ar2.add(d);
				
			
		}
		
		
	List <List<Integer>> output = new ArrayList <List<Integer>>  () ;
		
		output.add(ar2);
		output.add(ar1);
		
		return output;
	}

}



