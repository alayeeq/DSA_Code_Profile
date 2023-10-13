package TwoPointer;

import org.junit.Test;

public class RevOnlyLetters {
	
	
	
	@Test
	public void Test1() {
		
		
		String to_be_rev = "APP's2";
		
		System.out.println(revOnlyletters (to_be_rev));
		
		
	}

	private String revOnlyletters(String to_be_rev) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder (to_be_rev);
		int left = 0;
		int right = sb.length()-1;
		
		
		while (left < right) {
			
			if (isEnglish(sb.charAt(left)) &&isEnglish(sb.charAt(right)) ) {
				
				char temp = sb.charAt(left);
				sb.setCharAt(left++, sb.charAt(right));
				sb.setCharAt(right--, temp);
				
				
				
				
			}
			
			else if (!isEnglish(sb.charAt(left)) &&!isEnglish(sb.charAt(right)) ) {
				
				left++;
				right--;
			}
			
	else if (!isEnglish(sb.charAt(left))  ) {
				
				left++;
				
			}
			
	else right--;
			
			
				
				
				
				
			
			
			
			
		}
		return sb.toString();
		
	}

	private boolean isEnglish(char charAt) {
		// TODO Auto-generated method stub
		
		if (charAt > 64 && charAt <91 || charAt > 96 && charAt <123 )  return true;
		
		
		return false;
	}
	
	
	
	
	
	
	

}
