package LinkedList;

import org.junit.Test;

public class RevListwithints {
	
	
	
	@Test
	public void Test1() {
		
		String [] input_list_Items = {"1","2","3","4","5","6","7","8","9"};
		
		ListNode node = new ListNode(input_list_Items[0]);
		ListNode temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNode(input_list_Items[i]);
			temp = temp.next;
			
		}
		
		System.out.println(node);
		
		
		
		int left = 1;
		int right = input_list_Items.length-2;
		
		
		reverseBetween(node,  left,  right) ;
		
	}

	private void reverseBetween(ListNode node, int left, int right) {
		// TODO Auto-generated method stub
		
		
		ListNode Temp = new ListNode("0",node);
		 
		 
		 
		ListNode  TempBase = Temp.next;
		ListNode Trav_temp = Temp ;
		int temp = 1;
		while (temp <left) {
			
			Trav_temp = Trav_temp.next;
			
		}
		
			ListNode Right_Temp = node;
			
			
			for (int k =1  ; k<=right; k++) {
				
				for (int l=1; l<=right+1-k ; l++) {
					
					Right_Temp = Right_Temp.next;
					
				}
				Trav_temp.next = Right_Temp;
 				Trav_temp = Trav_temp.next;
				Right_Temp = new ListNode("0",node);;
				TempBase = Right_Temp.next;
				
			}
			
			System.out.println(Temp);
		
		
	}
	
	
	
	
	
	
	
	

}
