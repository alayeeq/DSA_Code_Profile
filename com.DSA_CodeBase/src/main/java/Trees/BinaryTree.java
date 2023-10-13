package Trees;

import java.util.Scanner;

public class BinaryTree {

	class Node {

		Node left;
		Node right;
		int value;

		public Node(int value) {

			this.value = value;

		}

	}

	Node root;

	public void populate(Scanner sc) {

		System.out.println("Enter the root node");
		int temp_value = sc.nextInt();
		root = new Node(temp_value);

		populate(sc, root);

	}

	private void populate(Scanner sc, Node node) {
		// TODO Auto-generated method stub

		System.out.println("do you want to insert a value to the left of " + node.value);
		boolean ans = sc.nextBoolean();

		if (ans) {

			System.out.println("Enter the left value");
			int temp = sc.nextInt();

			node.left = new Node(temp);
			populate(sc, node.left);

		}

		System.out.println("do you want to insert a value to the right of" + node.value);
		boolean ans_rigth = sc.nextBoolean();

		if (ans_rigth) {

			System.out.println("Enter the rigth value");
			int temp = sc.nextInt();

			node.right = new Node(temp);
			populate(sc, node.right);

		}
	}
	
	
	public void display() {
		
		if(root==null) System.out.println(root);
		
		else System.out.print(root.value);
		display(root);
		
		
		
		
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		
		if (node ==null ) return ;
		System.out.println(node.value);
		display(node.left);
		
		display(node.right);
		
	}
	

}
