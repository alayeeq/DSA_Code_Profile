package Others;

import org.junit.Test;

public class CountofMatches {
	
	/*
	 * leetcode 1688
	 */
	
	@Test
	
	public void Test1() {
		
		int Original_number_of_teams = 14;
		
	System.out.println(	numberofmatches(Original_number_of_teams));
		
		
		
	}
	
	
	@Test
	
	public void Test2() {
		
		int Original_number_of_teams = 7;
		
	System.out.println(	numberofmatches(Original_number_of_teams));
		
		
		
	}
	
	@Test
	
	public void Test3() {
		
		int Original_number_of_teams = 1;
		
	System.out.println(	numberofmatches(Original_number_of_teams));
		
		
		
	}

	private int numberofmatches(int original_number_of_teams) {
		// TODO Auto-generated method stub
		
		int Matches_counter = 0;
		int current_teams = original_number_of_teams;
		
		while(current_teams >1) {
			
			if (current_teams%2 ==1) {
				
				current_teams = (original_number_of_teams/2) +1;
				Matches_counter = Matches_counter +(original_number_of_teams/2);
				
			}
			
			else {
				current_teams = (original_number_of_teams/2) ;
				Matches_counter = Matches_counter +(original_number_of_teams/2);
				
			}
			
			original_number_of_teams =current_teams;
			
		}
	
		return Matches_counter;
		
	}
	

}
