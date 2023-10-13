package Others;

import org.junit.Test;

public class MaxProductSubArray {

	
	@Test
	public void test1() {
		
		int [] arr = {2,3,-2,4};
		
		System.out.println(maxProduct(arr));
		
	}

    public int maxProduct(int[] nums) {


        
        int max_prod = Integer.MIN_VALUE;

        int zero_counter = 0;

        if (nums.length ==1) return nums[0];
   //  max_prod = Math.max( findAllNumsneg (nums) ,max_prod);

           
      


            

            int prod = 1;

            for (int i=0; i<nums.length ; i++){

                prod = prod * nums[i];
              //  if (prod<0) prod = prod;
              //  if (prod==0) prod = 1;
              if((i+1)< nums.length){
              if(prod==0 ){ prod =1;
              zero_counter++;
              continue;
              }
              }
                 if (prod>max_prod) max_prod = prod;


            }

          //  System.out.println (max_prod);
                prod = 1;
                int temp_prod_max = Integer.MIN_VALUE;


             for (int i=nums.length-1; i>=0 ; i--){

                prod = prod * nums[i];
              //  if (prod<0) prod = prod;
              //  if (prod==0) prod = 1;
              if((i-1)>=0){
              if(prod==0   ){ prod =1;
              zero_counter++;
              continue;
              }//
              }
                 if (prod>temp_prod_max) temp_prod_max = prod;


            }
         //   System.out.println (temp_prod_max);

        max_prod =    Math.max(max_prod,temp_prod_max );
        if (max_prod<0 && zero_counter>0 ) return 0;
          else  return max_prod;

        
    }

        public int findAllNumsneg(int [] abc){
                int max = Integer.MIN_VALUE;
                  for (int j=0; j<abc.length ; j++ ){

                   max =   Math.max(max, abc[j]);

                 }

                return max;
        
    }
	
	
}

