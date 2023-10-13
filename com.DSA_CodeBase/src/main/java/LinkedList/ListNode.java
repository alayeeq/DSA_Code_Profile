package LinkedList;

public class ListNode {
	
	
	String data ;
	ListNode next ;
	
	public ListNode() {
		
		
		
	}
	
	public ListNode(String data) {
		
		this.data = data;
		this.next = null;
		
	}
	
	public ListNode(String data, ListNode next) {
		
		this.data = data;
		this.next = next;
		
	}
	
	

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder('[');
		
		ListNode temp = this;
		
		while(temp.next!=null) {
			
			sb.append(temp.data +',');
			
			temp = temp.next;
		}
		
		sb.append(temp.data+']');
		
		
		
		
		
		return sb.toString();
		
		
	}
	
	

}
