package LinkedList;

import org.junit.Test;

public class MiddleOfLL {
	
	
	@Test
	public void Test1() {
		
		String [] input_list_Items = {"1","2","3","4","5"};
		
		ListNode node = new ListNode(input_list_Items[0]);
		ListNode temp = node;
		for (int i=1; i<input_list_Items.length ; i++) {
			
			temp.next = new ListNode(input_list_Items[i]);
			temp = temp.next;
			
		}
		
			
		
		
	System.out.println(middleNode(node)) ;
		
	}
public ListNode middleNode(ListNode head) {
        


        ListNode Temp =  head;
        ListNode Temp2 =  head;
        int count = 0;

        	while(Temp.next!=null) {
		
		count++;
		Temp=Temp.next;
		
		
	}
    int loop_limit= 0;
    int loop_limit_temp = 0;
    if(count%2==1)loop_limit=count/2+1;
	else loop_limit=count/2;

    while(loop_limit_temp<loop_limit) {
		
		Temp2 = Temp2.next;
		loop_limit_temp++;
		
	}
            
    return Temp2;

    }
	
}
