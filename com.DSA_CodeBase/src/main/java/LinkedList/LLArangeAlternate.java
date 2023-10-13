package LinkedList;

import org.junit.Test;

public class LLArangeAlternate {

	
	
	
	
	@Test
	public void TestA() {
		
		
		String [] input = {"1","2","3","4","5"};
		String [] input2 = {"1","2","3","4","5","6"};
		
		
		
			LinkedList LL = new LinkedList();
			
		
		for (int i=0; i<input.length; i++) {
			
			LL.add(input[i]); 
			
		}
		
		System.out.println(LL);
		
		
		
		LinkedList LL2 = new LinkedList();
		
		
	for (int i=0; i<input2.length; i++) {
		
		LL2.add(input2[i]); 
		
	}
	
	System.out.println(LL2);
		
		//System.out.println(LL.Start.data);
		
		LinkedList LLTemp = new LinkedList();
		LinkedList LLTemp2 = new LinkedList();
		LinkedList LLTemp3 = new LinkedList();
		LLTemp.Start = LL.Start;
		LLTemp2.Start = LL.Start;
		LLTemp3.Start = LL2.Start;
		
		int count = 0;
		int count_s = 0;
		int count_s2 = 0;
		
		while(LLTemp.Start!=null) {
			
			LLTemp.Start = LLTemp.Start.next;
			
			count++;
				
			
		}
		
		
		System.out.println(count);
		
	while(LLTemp2.Start!=null) {
		count_s++;
		
		try {
			LLTemp2.Start = LLTemp2.Start.next.next;
			
		}
		
		catch (NullPointerException e) {
			break;
			
		}
			
			
				
			
		}
	
	while(LLTemp3.Start!=null) {
		count_s2++;
		
		try {
			LLTemp3.Start = LLTemp3.Start.next.next;
			
		}
		
		catch (NullPointerException e) {
			break;
			
		}
			
			
				
			
		}
		
		
		
		
		System.out.println(count_s);
		System.out.println(count_s2);
		
		
	}
	
	
	

	@Test
	public void TestB() {
		
		String [] input = {"1","2","3","4","5"};
		String [] input2 = {"1","2","3","4","5","6"};
		
		
		
			LinkedList LL = new LinkedList();
			
		
		for (int i=0; i<input.length; i++) {
			
			LL.add(input[i]); 
			
		}
		
		System.out.println(LL);
		
		
		
		LinkedList LL2 = new LinkedList();
		
		
	for (int i=0; i<input2.length; i++) {
		
		LL2.add(input2[i]); 
		
	}
	
	System.out.println(LL2);
	
	
	LinkedList LLTemp = new LinkedList();
	LinkedList LLTemp2 = new LinkedList();
	LinkedList LLTemp3 = new LinkedList();
	LinkedList LLTemp4 = new LinkedList();
	LLTemp.Start = LL.Start;
	LLTemp2.Start = LL.Start;
	LLTemp3.Start = LL2.Start;
	LLTemp4.Start = LL2.Start;
	
	int count = 0;
	int count_s = 0;
	int count_s2 = 0;
	
	while(LLTemp.Start.next!=null) {
		
		count++;
		LLTemp.Start=LLTemp.Start.next;
		
		
	}
	int loop_limit= 0;
	if(count%2==1)loop_limit=count/2+1;
	else loop_limit=count/2;
	 
	int loop_limit_temp = 0;
	while(loop_limit_temp<loop_limit) {
		
		LLTemp2.Start = LLTemp2.Start.next;
		loop_limit_temp++;
		
	}
	
	System.out.println(LLTemp2);
	
	
	
	
	
while(LLTemp3.Start.next!=null) {
		
		count_s++;
		LLTemp3.Start=LLTemp3.Start.next;
		
		
	}
	
int loop_limit2= 0;
	if(count_s%2==1)loop_limit2=count_s/2+1;
	else loop_limit2=count_s/2;

	
	int loop_limit_temp2 = 0;
	while(loop_limit_temp2<loop_limit2) {
		
		LLTemp4.Start = LLTemp4.Start.next;
		loop_limit_temp2++;
		
	}
	
	System.out.println(LLTemp4);
		
	
		
		
		
	}
	
	
	
	@Test
	public void TestC() {
		
		String [] input = {"1","2","3","4","5"};
		
		
		
		
			LinkedList LL = new LinkedList();
			
		
		for (int i=0; i<input.length; i++) {
			
			LL.add(input[i]); 
			
		}
		
		System.out.println(LL);
		
		//this list is created to traverse and find the length
		LinkedList LL_traverse_temp = new LinkedList();
		
		LL_traverse_temp.Start = LL.Start;
		
		
		int length_of_linkedList =1;
		
		while(LL_traverse_temp.Start.next!=null) {
			
			length_of_linkedList++;
			LL_traverse_temp.Start = LL_traverse_temp.Start.next;
			
		}
		
		//last node = LL_traverse_temp.Start;
		
		System.out.println(length_of_linkedList);
		int k =2;
		int number_of_rotations_to_make = k%length_of_linkedList;
		
		LinkedList LL_solution = new LinkedList();
		LL_solution.Start = LL.Start;
				int traversal_needed = length_of_linkedList-number_of_rotations_to_make;
				
				int temp_counter=1;
				while(temp_counter<traversal_needed) {
					
					temp_counter++;
					LL_solution.Start = LL_solution.Start.next;
					
				}
				
				
				//Temp_last_node = LL_solution.Start;
				
				LinkedList LL_Temp_head = new LinkedList();	
				LL_Temp_head.Start = LL_solution.Start.next;
				LL_solution.Start.next = null;
				
				
				LL_traverse_temp.Start.next =LL.Start;
				LL.Start =  LL_Temp_head.Start;
				
				System.out.println(LL);
				
		
	}
	
	
	@Test
	public void Test1() {
		
		
		String [] input = {"1", "2","3","a","b","c"};
		
		String [] output = {"1", "a", "2","b","3","c"};
		
		LinkedList LL = new LinkedList();
		LL.add("AB");
		LL.add("CD");
		LL.add("EF");
		
		System.out.println(LL);  
		//changeLinkedList()
		
	}  
	
	@Test
	public void Test2() {
		
		
		String [] input = {"1", "2","3","a","b","a","c","a"};
		
		String [] output = {"1", "a", "2","b","3","c"};
		
		LinkedList LL = new LinkedList();
		
		for (int i=0; i<input.length; i++) {
			
			LL.add(input[i]); 
			
		}
		
		
		System.out.println(LL);
		//changeLinkedList()
		
		LL.insert(3, "4");
		System.out.println(LL);
		
		LL.insert(0, "t");
		System.out.println(LL);
		
		LL.insert(8, "k");
		System.out.println(LL);
		
		LL.delete("a");
		System.out.println(LL);
		
		LL.delete("t");
		System.out.println(LL);
		
	}
	
	
	
	void changeLinkedList (LinkedList start ) { }
	
	
			

		

}
 class LinkedList {
	
	 
	 
	 class Node{
	 
	 
	 String data;
	 Node next;
	 
	 public Node(String data) {
		 
		 this.data = data;
		 this.next = null;
	 }
	 
	 }
	 
	 Node Start =null ;
	 int size = 0;
	 
	 void add (String data) {
		 Node  node = new Node(data);
		 if(this.Start ==null)
		 {
		 
		 this.Start = node;
		// this.Start.next = null;	
		 size++;
		 
		 }
		 else   {
			
			 Node current = Start;
			 while(current.next!=null) {
				 
				 current = current.next;
			 }
			 current.next = node;
			 
			 
			 size++;
			 
		 }
		
		 }
	 
	 
	 void insert( int index, String data ) {
		 
		 
		 
	
		 
		 Node node = new Node(data);
		 int Index_temp = 0;
		 
		 if (index >size || index<Index_temp) throw new IndexOutOfBoundsException("Index     " +index +" is out of bound") ;
			 
		 else if(index==0) {
			 
			 node.next = Start;
			 Start = node;
			 size++;
			 
		 }

	 
		 else {
			 
			 Node current = Start;
			 
			 if(index==size-1)while(Index_temp++ < index)  current = current.next;
			 else while(Index_temp++ < index-1)  current = current.next;
			 
			  node.next = current.next;
			  current.next = node;
			  size++;
			  
		 }
	 }
	 
	 
	 
	 void delete (String data_to_delete) {
		 
		 
		 if (Start == null) throw new NullPointerException("List is empty cannot delete "); 
		 
		
	 else if (Start.data == data_to_delete) {
			 
			 Start = Start.next;
			 size--;
			 
		 }
		 
		 else {
		 
		 Node current = Start ;
		 
			 
			 
			 
			 while (current.next !=null   )
			 {
				 
				 
				 if ( current.next.data == data_to_delete) {
					 current.next = current.next.next;
					 size--;
					 
				 }
				 else  current = current.next;
				 
				 
			 }
			 
			
			 
		 
		 
		 }
		 
		 
		 
	 }
	 
	 		
	 
	 @Override 
	 public String toString() {
		 
		 StringBuilder sb = new StringBuilder ();
		 sb.append('[');
		 Node current = Start;
		 while(current.next!=null) {
			 
			 sb.append(current.data +',');
			 current = current.next;
		 }
		// + Start.data +"," +"]-->"+ size ;
		 sb.append(current.data +"]-->" +size);
	
		 return sb.toString();
	 }
	 
	 }
	 
	


