package BinarySearch;

import org.junit.Test;

public class SmallestletterGreaterthanTarget {
	
	
	@Test
	public void test1() {
		
		char [] letters = {'c','f','j'};
		char target = 'a';
		
		System.out.println(nextGreatestLetter(letters, target));
		
	}
	
	
	
	
	
    public char nextGreatestLetter(char[] letters, char target) {

        if((target+'0')>=(letters[letters.length-1]+'0')) return letters[0];

        else {

            for (int i=0 ; i<letters.length; i++ ){

                    if ((letters[i]+'0')> (target+'0')) return letters[i];

            }

        }

return 'a';
    
}

}
