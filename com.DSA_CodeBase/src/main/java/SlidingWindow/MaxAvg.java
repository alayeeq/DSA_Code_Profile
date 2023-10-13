package SlidingWindow;

import org.junit.Test;

public class MaxAvg {
	
	
	@Test
	public void Test1() {
		
		 
		int [] input = { 1,2,3,4,5,6,8,9};
		
		int limit = 3;
		
		findmaxavg(input, limit);
		
		
	}
	
	@Test
	public void Test2() {
		
		 
		int [] input = { 9,8,3,12,13,14,1,2,3,4,5,6,8,9};
		
		int limit = 3;
		
		findmaxavg(input, limit);
		
		
	}
	
	@Test
	public void Test3() {
		
		 
		int [] input = { 9,8};
		
		int limit = 2;
		
		findmaxavg(input, limit);
		
		
	}
	
	
	@Test
	public void Test4() {
		
		 
		int [] input = { -1};
		
		int limit = 1;
		
		findmaxavg(input, limit);
		
		
	}
	
	@Test
	public void Test5() {
		
		 
		int [] input = { 8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
		
		int limit = 93;
		
		findmaxavg(input, limit);
		
		
	}



	private double findmaxavg(int[] input, int limit) {
		// TODO Auto-generated method stub
	
		
		
		double max_avg =Double.NEGATIVE_INFINITY;
		int sum = 0;
		if(input.length==1) max_avg = (double) input[0];
		for (int i=0; i<limit ; i++) {
			
			
		sum = sum  +	input[i];
			
			
		}
		double avg = (double) sum/limit;
		if (avg>max_avg) max_avg = avg;
		
		for (int j=0; j<input.length-limit ; j++) {
			
			
			sum = sum -input[j] +input[j+limit];
			avg = (double) sum/limit;
			if (avg>max_avg) max_avg = avg;
		}
		
	//	System.out.println("Max sum = "+max);
		
		//float max_avg =(float) max/limit;
		System.out.println("Max avg = "+max_avg);
		
		
		return max_avg;
		
	}

}
