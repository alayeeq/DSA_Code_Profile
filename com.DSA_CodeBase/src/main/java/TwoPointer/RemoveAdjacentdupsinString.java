package TwoPointer;

import org.junit.Test;
import java.util.*;

public class RemoveAdjacentdupsinString {
	
	
	/*
	 * 
	 * leetcode 1047
	 */
	
	
	@Test
	public void test1() {
		
		String s = "abbaca";
		
		System.out.println(removeDuplicates(s));
		
	}
	
	

	public String removeDuplicates(String s) {


        char [] c = s.toCharArray();

        if (c.length==1) return s;
else{
    ArrayList<Character> al = new ArrayList<Character>();
        for (char k : c){
            al.add(k);

        }
        int left = 0;
        int right = 1;

        while (right<al.size()) {

                if(al.get(left)==al.get(right)){
                    al.remove(left);
                    al.remove(left);
                    if(left!=0){
                    left--;
                    right--;
                    }

                }

                else{
                    left++;
                    right++;

                }


}
      String output = "";
      for (char z : al){
          output = output + z;

      }

      return output;

    }
}
	
	
}
