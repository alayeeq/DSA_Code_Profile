package Recursion;

import org.junit.Test;

public class RevNum {
	
	
	@Test
	public void test1() {
		
		int num = 75312;
		//System.out.println(revInt(Integer.toString(num)));
		System.out.println(revInt2(num));
		
		
	}

	





	public int revInt2(int num) {
		
		if(num==0) return 0;
		else {
		int digits =(int) Math.log10(num)+1;
		
		return num%10 * (int) Math.pow(10, digits-1) + revInt2(num/10);
		}
		// TODO Auto-generated method stub
		//return null;
	}







	public String revInt(String num) {
		// TODO Auto-generated method stub
		
		if(Integer.valueOf(num)==0) return "";
		
		else {
			
			int temp = Integer.valueOf(num); 
			return temp%10 + revInt(Integer.toString(temp/10));
		}
		
		
	}

}
