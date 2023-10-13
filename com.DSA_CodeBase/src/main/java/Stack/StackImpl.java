package Stack;

import org.junit.Test;

public class StackImpl {

	/*
	 * push
	 * pop
	 * peek
	 * find
	 * size
	 * 
	 */
	@Test
	
	public void Test1() {
		
		StackT stack = new StackT ();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.pop();
			
	System.out.println(stack.peek());
	System.out.println(stack.find('b'));
	System.out.println(stack.find('c'));
	System.out.println(stack.size());
		
		
	}
	

	
	@Test
	public void Test2() {
		
		StackT stack = new StackT ();
		
		String s = "[[{}]()]";
		
		for (int i =0; i<s.length(); i++) {
			
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(') stack.push(s.charAt(i));
			else if (s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)==')') stack.pop();
			
		}
		
		System.out.println(stack.size());
	}
	
	
	@Test
	public void Test3() {
		
		StackT stack = new StackT ();
		
		String s = "3[a2[bc]]";
		
		
		int counter = 0;
		for (int i =0; i<s.length(); i++) {
			
			System.out.println(s.charAt(i)!=']');
			System.out.println(s.charAt(i));
			if(s.charAt(i)!=']' )
				{stack.push(s.charAt(i));
			System.out.println(stack);
				}
			else if (s.charAt(i)==']' ) {
				StringBuilder sb = new StringBuilder("");
				while (stack.peek()!='[') {
				sb= sb.append(stack.pop());
				
				}
				stack.pop();
			sb.reverse();
			
			counter = stack.pop()- '0';
			for (int z =0; z<counter-1 ; z++) {
				
				sb = sb.append(sb);
			}
			  
			for (int y=0 ; y<sb.length();y++) {
				
				stack.push(sb.charAt(y));
				
			}
			
		}
		}
		System.out.println(stack);
	}
	
	
	
}

class StackT {
	
	
	private int size = 50;
	
	private Character [] Stack = new Character [size];
	
	private int top = 0;

	public boolean push(char c) {
		// TODO Auto-generated method stub
		
		if (top<size) {
			
			Stack[top] = c;
			top++;
			return true;
		}
		
		else {
			
			return false;
		}
		
	}

	public int size() {
		// TODO Auto-generated method stub
	
		return top;
	}

	public int find(char c) {
		// TODO Auto-generated method stub
		
		for (int i =0; i<top ;i++) {
			
			if(Stack[i]==c) return i+1;
				
				
		}
		 return -1;
		
	}

	public Character pop() {
		// TODO Auto-generated method stub
		Character first = Stack[top-1];
		//Stack[top-1] = null;
		top--;
		return first;
		
	}
	

	public Character peek() {
		// TODO Auto-generated method stub
		if (top==0) return  null;
		else return Stack[top-1];
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i =0; i<top ;i++) {
			
		sb=	sb.append(Stack[i]);				
		sb=	sb.append(',');		
		}
		sb.append(']');
		 return sb.toString();
		
	}
	
	
	
	
}
