package LinkedList;

import org.junit.Test;

public class RemDuplicatesfromList {
	
	
	@Test
	public void Test1() {
		
		int [] input_list_Items = {1,2,3,3,3,4,5};
		
		ListNodeT node = new ListNodeT(input_list_Items[0]);
		ListNodeT temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNodeT(input_list_Items[i]);
			temp = temp.next;
			
		}
		
			
		
		
	System.out.println(deleteDuplicates(node)) ;
		
	}
	
	
	
	
	  public ListNodeT deleteDuplicates(ListNodeT head) {


          if(head==null || head.next ==null) return head;

          ListNodeT curr = head.next;  

    while(curr!= null ) {
          if( curr.val == head.val) {
                head = curr;
                curr = head.next;
                continue;


          }
          else  break;
            
            

    }
          
      if (curr==null) return head;
        while(curr.next !=null ) {
			
			if(curr.val ==curr.next.val) {
				
				curr.next = curr.next.next;
				
			}
			
			else curr =curr.next;
			
		}
        
        return head;
    }

}



 class ListNodeT {
	
	
	int val ;
	ListNodeT next ;
	
	public ListNodeT() {
		
		
		
	}
	
	public ListNodeT(int val) {
		
		this.val = val;
		this.next = null;
		
	}
	
	public ListNodeT(int val, ListNodeT next) {
		
		this.val = val;
		this.next = next;
		
	}
	
	

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder('[');
		
		ListNodeT temp = this;
		
		while(temp.next!=null) {
			
			sb.append( Integer.toString(  temp.val) +',');
			
			temp = temp.next;
		}
		
		sb.append(Integer.toString( temp.val)+']');
		
		
		
		
		
		return sb.toString();
		
		
	}
	
	

}

