package Queue;

import org.junit.Test;

public class DequeueExampleDLL {

	
	
	/*
	 * 
	 *     1 -> 2-> 3-> 4 -> 5
	 *     S                 E
	 *     
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	//@Test
	public void Test1() {
		
		
		int [] input = {5,4,3,7,-6};
		QueueDoublyLL queue = new QueueDoublyLL ();
		for (int i=0; i< input.length ; i++) {
			queue.addFirst(input[i]);
			
		}
		
		System.out.println(queue);
		
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		
		
		for (int i=0; i< input.length ; i++) {
			queue.addLast(input[i]);
			
		}
		
		System.out.println(queue);
		
		
		System.out.println(queue.removeLast());
		System.out.println(queue);
		
		System.out.println("End of Test case 1 ");
	}
	
	
	
	@Test
	public void Test2() {
		
		
		int [] input = {5,4,3,7,-6};
		QueueDoublyLL queue = new QueueDoublyLL ();
		for (int i=0; i< input.length ; i++) {
			queue.addFirst(input[i]);
			
		}
		
		System.out.println(queue);
		
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		//System.out.println(queue.removeFirst());
		//System.out.println(queue);
		
		
		for (int i=0; i< input.length ; i++) {
			queue.addLast(input[i]);
			
		}
		
		System.out.println(queue);
		
		
		System.out.println(queue.removeLast());
		System.out.println(queue);
		System.out.println(queue.removeLast());
		System.out.println(queue);
		System.out.println(queue.removeLast());
		System.out.println(queue);
		System.out.println(queue.removeLast());
		System.out.println(queue);
		System.out.println(queue.removeLast());
		System.out.println(queue);
		//System.out.println(queue.removeLast());
		//System.out.println(queue);
		
		System.out.println("End of Test case 2 ");
	}
	
	
	@Test
	public void Test3() {
		
		
		int [] input = {5,4,3,7,-6};
		QueueDoublyLL queue = new QueueDoublyLL ();
		for (int i=0; i< input.length ; i++) {
			queue.addFirst(input[i]);
			
		}
		
		System.out.println(queue);
		
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		//System.out.println(queue.removeFirst());
		//System.out.println(queue);
		
		
		for (int i=0; i< input.length ; i++) {
			queue.addLast(input[i]);
			
		}
		
		System.out.println(queue);
		
		
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		
		System.out.println("End of Test case 2 ");
	}

	
	
}



class QueueDoublyLL {
	
	
	
	class Node{
		
		
		int data ;
		Node next;
		Node previous;
		
		public Node(int data) {
			
			this.data = data;
			this.next = null;
			this.previous = null;
		}
		
	}
		Node Start =null;
		Node End = null;
		int size = 0;
		
		
		
		
		public void addFirst (int data) {
			
			Node node = new Node(data);
			
			if(Start==null) {
				
				Start = node;
				End = node;
				size++;
				
			}
			
			else {
				
				Start.previous = node;
				node.next = Start;
				Start = node;
				size++;
			}
			
		}
		
		public int removeFirst() {
			
			Node current = Start;
			
			if(Start == null ) throw new NullPointerException("Quere is Emplty nothing to remove");
			
			
			else if (Start == End){
				Start = null;
				End = null;
				size--;
				
				
			}
			else {
				
				Start = Start.next ;
				size--;
				
			}
			
			return current.data;
		}
		
		
		
			public void addLast(int data)  {
			
				
				Node node = new Node(data);
			
				if(Start == null) {
					
					Start = node;
					End = node;
					size++;
					
				}
				
				else {
					
					End.next = node;
					node.previous = End;
					End = node;
					size++;
				}
				
			
		}
		
		
		public int removeLast()  {
			
			
			Node current = End;
			if (Start ==null) {
				
				throw new NullPointerException("Empty queue nothing to remove");
				
			}
			
			else if(Start == End) {
				
				End = null;
				Start = null;
				size--;
				
			}
			else {
				
				
				End=End.previous;
				End.next = null;
				size--;
				
				
			}
			
			return current.data;
		}
		
		
		
		@Override
		public String toString() {
			
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("[");
			
			Node current = Start;
			
			if(current == null ) {
				
				sb.append("]-->"+size);
				return sb.toString();
			}
			else {
			while (current.next!=null) {
				
				sb.append(current.data +",");
				current = current.next;
				
			}
			
			sb.append(current.data+"]-->"+size);
			
			
			return sb.toString();
			}
			
		}
		
		
		
		
		
	
	
	
	
}