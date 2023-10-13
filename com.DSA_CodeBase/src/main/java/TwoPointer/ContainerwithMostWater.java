package TwoPointer;

import org.junit.Test;

public class ContainerwithMostWater {

	
	@Test
	public void Test1() {
		
		int [] input = {1,8,6,2,5,4,8,3,7};
		System.out.println(mostWater(input));
	}
	
	@Test
	public void Test2() {
		
		int [] input = {1,8,6,2,100,200,4,8,3,7};
		System.out.println(mostWater(input));
	}
	
	@Test
	public void Test3() {
		
		int [] input = {1,8,60,2,100,4,8,3,7};
		System.out.println(mostWater(input));
	}

	private int mostWater(int[] input) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = input.length-1;
		
		int most_wat = Integer.MIN_VALUE;
		
		while(left<right) {
			
		int min_value =	Math.min(input[left], input[right]);
		int temp_most_wat = min_value*(right-left);
		most_wat = Math.max(temp_most_wat, most_wat);
			
		if(input[left]<input[right]) left++;
		else right--;
			
		}
		return most_wat;
		
	}
	
}


/*
 *        int i =0;
        int j = height.length-1;
        int max=0;
        int iH;
        int jH;

        while(i<j){
            iH = height[i];
            jH = height[j];
    
            int area = (j-i) * (iH<jH ? iH : jH);
            max = max<area ? area : max;
            if(iH<jH){
                while(i<j && height[i]<=iH){
                    i++;
                }
            }
            else{
                while(i<j && height[j]<=jH){
                    j--;
                }
            }
        }

        return max;
 * 
 */
