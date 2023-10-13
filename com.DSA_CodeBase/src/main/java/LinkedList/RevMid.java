package LinkedList;

import org.junit.Test;

public class RevMid {
	
	

	@Test
	public void Test1() {
		
		int [] input_list_Items = {1,2,3,4,5};
		
		ListNodeT node = new ListNodeT(input_list_Items[0]);
		ListNodeT temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNodeT(input_list_Items[i]);
			temp = temp.next;
			
		}
		
			int left =2;
			int right =4;
		
		
	System.out.println(reverseBetween(node, left, right)) ;
		
	}
	
	 public ListNodeT reverseBetween(ListNodeT node, int left, int right) {
	        

			
			if(node ==null || node.next==null || left==right) return node;
			
			ListNodeT curr = node;
		
			int counter = 0;
			ListNodeT temp2 = null;
			int temp = left;
			while (temp-->1) {
				
				if(temp+1 == left){

					counter++;

				}

				else{
						temp2 = curr;

				}
				
		

				curr = curr.next;
				


			}
				
			if(temp2==null && counter ==1)	{

				node.next=	revlist(curr, right-left);

			}
			
				else if(temp2==null && counter ==0)	{

				node=	revlist(curr, right-left);

			}
			
		else 
			temp2.next=	revlist(curr, right-left);
			
			
			return node;

	    }

		private ListNodeT revlist(ListNodeT node , int size) {
			// TODO Auto-generated method stub
			//System.out.println(node);
			ListNodeT prev = null;
			ListNodeT curr = node;
			ListNodeT next = node;
			ListNodeT temp ;
			
			while(curr!=null && size-->=0) {
				
		

				next = curr.next;			
				curr.next = prev;
				prev = curr;
				curr = next;
				
			}
			node.next = curr;
			node = prev;
			return node;
			
			
			
		}
	
	

}
