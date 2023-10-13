package Others;

import org.junit.Test;

import junit.framework.Assert;

public class SumNums {

	@Test
	public void test1() {

		String input = "a151bb9de11q";

		sumNums(input);

	}
	
	
	@Test public void Test1() {
		sumNums("s2am12pl2e");
		}
		@Test public void Test2() {
			sumNums("s2am12pl2e");	
			}
		@Test public void Test3() {
			sumNums("sample");	
			}
		@Test public void Test4() {
			sumNums("1567890");	
			}
		@Test public void Test5() {
			sumNums("abcdef3");	
			}
		@Test public void Test7() {
			sumNums("");	
			}
	
	
	
	
	
	

	private void sumNums(String input) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {

			StringBuilder sb = new StringBuilder();
			
			while (i<input.length() && Character.isDigit(input.charAt(i)))
			{
				
				sb.append(input.charAt(i));
					i++;
			}
			if (!sb.isEmpty()) {
				int temp_sum = Integer.valueOf(sb.toString());
				sum = sum + temp_sum;
				sb = new StringBuilder("");
			}
		}
		
		
		System.out.println(sum);
	}

}
