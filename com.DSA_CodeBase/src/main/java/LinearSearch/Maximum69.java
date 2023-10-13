package LinearSearch;

import org.junit.Test;

/*
 * leetcode 1323
 * 
 */

public class Maximum69 {
	
	
	@Test
	public void test1() {
		
		int input = 9669;
	System.out.println(maximum69Number(input));
		
		
	}

	public int maximum69Number (int num) {

        String input = Integer.toString(num);

        char [] a = input.toCharArray();

        for (int i =0; i<input.length() ;i++){

            if(a[i]=='6') {

                a[i] = '9';
                break;
            }  

        }

        return Integer.valueOf(new String(a));

    }

}
