package Trees;

public class BST {
	
	
	class Node {
		
		Node left;
		Node right;
		int value ;
		int height;
		
		public Node(int value) {
			
			this.value = value;
		}
		
		
		
		
	}
	
		Node root;
	
	
		public void insert (int value) {
		
		
		
		  root = insert (root, value);
		
		}

		
		public int height(Node node) {
			if (node ==null) return -1;
			 return node.height;
			
		}

		public Node insert(Node node, int value) {
			// TODO Auto-generated method stub
			
			if (node == null) {
				node = new Node(value);
				//node.height = node.height+1;
				return node;
			}
			
		 	if (value<node.value) {
				
			 node.left=	insert(node.left , value);
				
			}
			
			 if (value>node.value) {
				
					
				node.right = insert(node.right, value);
			}
			 
			 node.height = Math.max(height(node.left) , height(node.right))+1;
			 return node;
			
		}
		
		public void display () {
			
			if (root==null) return;
			
			//System.out.println("System root value is " +root.value);
			
			display (root);
			
		}
		
		public boolean balanced (Node node) {
			if(node==null)return true;
		return 	Math.abs(height(node.left) - height(node.right))<=1 && balanced(node.left) && balanced(node.right)  ;
			
		
			
		}


		private void display(Node node) {
			// TODO Auto-generated method stub
			
			if (node==null) return;
			System.out.println(node.value);
			display(node.left);
			display(node.right);
			
		}
		
		
		public void preOrder(Node node) {
			
			if (node==null) return;
			System.out.println(node.value);
			preOrder(node.left);
			preOrder(node.right);
			
			
		}
		
		
		public void inOrder (Node node) {
			
			if (node == null) return;
			
			inOrder(node.left);
			System.out.println(node.value);
			inOrder(node.right);
			
			
		}
		
	}
	


