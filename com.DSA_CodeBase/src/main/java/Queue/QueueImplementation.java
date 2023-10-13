package Queue;

import org.junit.Test;

public class QueueImplementation {

	/*
	 *     1 ->2 ->3 -> 4 -> 5
	 *     S                 E
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void Test1() throws Exception {
		
		//int [] input = { 1,2};
		int [] input = { 1,2,3,4,5};
		QueueLinkedList queue = new QueueLinkedList();
		
		for (int i =0; i< input.length; i++) {
			
			queue.Enqueue(input[i]);
			
		}
		
		System.out.println(queue);
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		System.out.println(queue.Dequeue());
		System.out.println(queue);
		
		
		
		
	}
	
	
	
	
	
	
}

class QueueLinkedList {
	
	
	class Node {
		
		private int data ;
		private Node next ;
		
		
		public Node (int data) {
			
			this.data = data;
			this.next = null;
			
		}
	}
		private Node Start = null;
		private Node End = null;
		private int size = 0;
		
		
		
		public void Enqueue(int data) {
			
			
			Node node = new Node(data);
			if (Start==null ) {
				
				Start = node;
				End = node;
				size++;
				
			}
			else {
			End.next = node ;
			End = node;
			size++;
			}
		
			
			
		}
		
		
		public int Dequeue () throws Exception {
			
			
			if (Start ==null) throw new NullPointerException("Deque is invalid when queue is emplty");
			
			else if (Start ==End) {
				Node current = Start;
				
				
				
				int output = current.data;
				Start = null;
				End = null;
				size--;
				return output;
				
			}
			else {
			Node current = Start;
			
			
			
			int output = current.data;
			Start = Start.next;
			size--;
			return output;
			}
		}
		
		
		
		@Override
		public String toString() {
			
			
			StringBuilder sb = new StringBuilder();
				
				
			sb.append ('[');
			
			Node current = Start;
			
			if (current == null ) { 
				
				sb.append("]"+ "-->" +size);
				return sb.toString();
			}
			else {
			while(current.next !=null)	{
				
				
				sb.append(	current.data +",");
				current = current.next;
			}
			
			sb.append(current.data +"]"+ "-->" +size);
			
			
			
			return sb.toString();
			}
		}
		
		
		
		
	}
	
	
	

