package Recursion;

import java.util.ArrayList;

import org.junit.Test;

public class AllWays {
	
	
	@Test
	public void test1() {
		
		int [][] arr = new int [3][3];
		int down = 0;
		int right = 0;
		String direction = "";
	//	System.out.println(allWays(arr, down , right));
		//allWaysprint(arr, down , right, direction);
		
		//System.out.println(allWaysprintret(arr, down , right, direction));
		System.out.println(allWaysprintretAll(arr, down , right, direction));
		//
		
		
	}

	private int allWays(int[][] arr , int down , int right) {
		// TODO Auto-generated method stub
		
		if(down==arr.length-1 && right == arr[0].length -1 ) {
			
			return 1;
			
		}
		
		if(down == arr.length || right == arr[0].length) {
			
			return 0;
		}
		
		int down_rec = allWays(arr , down+1 , right);
		int right_rec = allWays(arr , down , right+1);
		
		return down_rec + right_rec;
		
	}
	
	
	private void allWaysprint(int[][] arr , int down , int right , String direction) {
		// TODO Auto-generated method stub
		
		if(down==arr.length-1 && right == arr[0].length -1 ) {
			System.out.println(direction);
			return ;
			
			
		}
		
		if(down == arr.length || right == arr[0].length) {
			
			return ;
		}
		
		 allWaysprint(arr , down+1 , right , direction+"D");
		//System.out.println();
		 allWaysprint(arr , down , right+1 , direction+'R');
		//System.out.println();
		//return down_dir + right_dir;
		
	}
	
	
	private ArrayList <String> allWaysprintret(int[][] arr , int down , int right , String direction) {
		// TODO Auto-generated method stub
		
		ArrayList <String> ad = new ArrayList<String> ();
		if(down==arr.length-1 && right == arr[0].length -1 ) {
			System.out.println(direction);
			ArrayList <String> al = new ArrayList();
			al.add(direction);
			return al ;
			
			
		}
		
		if(down == arr.length || right == arr[0].length) {
			ArrayList <String> al = new ArrayList();
			return al;
		}
		
		ad.addAll( allWaysprintret(arr , down+1 , right , direction+"V"));
		//System.out.println();
		ad.addAll(allWaysprintret(arr , down , right+1 , direction+"H"));
		
		ad.addAll(allWaysprintret(arr , down+1 , right+1 , direction+"D"));
		//System.out.println();
		//return down_dir + right_dir;
		
		return ad;
	}
	
	
	private ArrayList <String> allWaysprintretAll(int[][] arr , int down , int right , String direction) {
		// TODO Auto-generated method stub
		
		ArrayList <String> ad = new ArrayList<String> ();
		if(down==arr.length-1 && right == arr[0].length -1 ) {
			System.out.println(direction);
			ArrayList <String> al = new ArrayList();
			al.add(direction);
			return al ;
			
				
		}
		
		if(down == arr.length || right == arr[0].length || down <0 || right <0) {
			ArrayList <String> al = new ArrayList();
			return al;
		}
		
		
		if(arr[down][right]==1) {
			
			ArrayList <String> al = new ArrayList();
			return al;
		}
		
		 arr[down][right] = 1;
		
		ad.addAll( allWaysprintretAll(arr , down+1 , right , direction+"D"));
		//System.out.println();
		ad.addAll(allWaysprintretAll(arr , down , right+1 , direction+"R"));
		
//		ad.addAll(allWaysprintretAll(arr , down-1 , right , direction+"U"));
	//	ad.addAll(allWaysprintretAll(arr , down , right-1 , direction+"L"));
		//System.out.println();
		//return down_dir + right_dir;
		arr[down][right] = 0;
		return ad;
	}

}
