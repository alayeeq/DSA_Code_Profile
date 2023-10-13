package TwoPointer;

import org.junit.Test;

public class SOS {
	
	@Test
	public void Test1() {
		
		String s = "SOSSPSSQSSOR";
		//          01234567891011
		
		System.out.println(countalteredmessage(s));
		
	}

	private int countalteredmessage(String s) {
		// TODO Auto-generated method stub
		
		 int output =0;
		    char [] s_c = s.toCharArray();
		   
		    if (s_c.length==3) {
		    	for (int i=0; i<s_c.length ; i++) {
		    		
		    		if(i%2==0) {
		    			
		    			if(s_c[i]!='S') output++;
		    			
		    		}
		    		else {
		    			if(s_c[i]!='O') output++;
		    			
		    		}
		    	}
		    	
		    }
		    //
		    
		    else {
		    	int left = 0;
			    int right = left+3;
			    
			    for (;right <s_c.length-2; left=left+6, right = right+6 ) {
			    	
			    	for (int left_temp = left , right_temp = right ;left_temp <left+3 ;left_temp++, right_temp++ ) {
			    		
			    		if(left_temp%2==0 && right_temp%2==1 ) {
				            if(s_c[left_temp]!='S' && s_c[right_temp]!='S' ) output = output+2;
				            else if (s_c[left_temp]!='S' || s_c[right_temp]!='S') output++;
				            
				        }
			    		
			    		else  if(left_temp%2==1 && right_temp%2==0) {
				            if(s_c[left_temp]!='O' && s_c[right_temp]!='O') output = output+2;
				            else if(s_c[left_temp]!='O' || s_c[right_temp]!='O') output++;
				            
				        }
			    		
			    	}
			    	
			    	
			    }
		    	
		    }
		    
		    /*
		    int left = 0;
		    int right = s_c.length-1;
		    
		    while (left<=right){
		        
		        if(left==0 && right==s_c.length-1) {
		             if(s_c[left]!='S' && s_c[right]!='S' ) output = output+2;
		            else if (s_c[left]!='S' || s_c[right]!='S') output++;
		            
		        }
		        
		        else if(left==right) {
		            if(s_c[left]!='O') output++;
		            
		        }
		        
		        else if(left%2==0 && right%2==1 ) {
		            if(s_c[left]!='S' && s_c[right]!='S' ) output = output+2;
		            else if (s_c[left]!='S' || s_c[right]!='S') output++;
		            
		        }
		        else  if(left%2==1 && right%2==0) {
		            if(s_c[left]!='O' && s_c[right]!='O') output = output+2;
		            else if(s_c[left]!='O' || s_c[right]!='O') output++;
		            
		        }
		           
		        left++;
		        right--;
		        
		    }
		    */
		  /*  for (char a : s_c){
		        
		        if(a != 'S' && a!= 'O') output++;
		    }*/
		        return output;
	}

}
