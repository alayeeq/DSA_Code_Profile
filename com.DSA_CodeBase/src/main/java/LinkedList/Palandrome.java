package LinkedList;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;

public class Palandrome {
	
	
	
	@Test
	public void test1() {
		
	String [] input_list_Items = {"1","2","3","3","2","1"};
		
		ListNode node = new ListNode(input_list_Items[0]);
		
		ListNode temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNode(input_list_Items[i]);
			temp = temp.next;
			
		}
		
		System.out.println(node);
		
	System.out.println(	IsPalandrome(node));
		
		
		
	}
	
	
	@Test
	public void test2() {
		
	String [] input_list_Items = {"1","2","3","3","1","2"};
		
		ListNode node = new ListNode(input_list_Items[0]);
		char [] a = {'a','a','a','a'};
		//Character[] charObjectArray = ArrayUtils.toObject(a);
		
		
		
	
		//List <Character> ls = Arrays.asList(a);
		ListNode temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNode(input_list_Items[i]);
			temp = temp.next;
			
		}
		
		System.out.println(node);
		
	System.out.println(	IsPalandrome(node));
		
		
		
	}

	private String IsPalandrome(ListNode node) {
		// TODO Auto-generated method stub
		
		
		int slow =0;
		int fast = 0;
		
		ListNode temp_slow ;
		ListNode temp_fast ;
		temp_slow = node;
		temp_fast=node;
		
		
		while (temp_fast!=null) {
			
			temp_slow = temp_slow.next;
			temp_fast = temp_fast.next.next;
			
		}
		
		ListNode temp_pal ;
		temp_pal = temp_slow;
		
		
		ListNode rev_list = rev_list(temp_pal);
		
		ListNode list_test = node;
		while(rev_list!=null) {
			
			if ( rev_list.data!=list_test.data) return "Not a palendrome" ;
			rev_list = rev_list.next;
			list_test = list_test.next;
			
		}
		
		return "Is Palendrome";
		
		
	}

	private ListNode rev_list(ListNode temp_pal) {
		// TODO Auto-generated method stub
		
		ListNode prev = null;
		ListNode curr = temp_pal;
		ListNode next = curr.next;
		
		while(next!=null) {
			
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
			
			
		}
		
		
		
		return curr;
		
	}
	

}
