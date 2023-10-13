package Trees;

import org.junit.Test;

public class CreateBST {
	
	
	//@Test
	public void createtree() {
		
		
		BST bst = new BST();
		
		int [] input = { 1,4,2,3,5,8};
		
		for (int i=0; i<input.length ;i++) {
			bst.insert(input[i]);
			
			
		}
		
		
		
		bst.display();
		System.out.println(bst.height(bst.root));
		System.out.println(bst.balanced(bst.root));
		
		System.out.println("end of Problem");
	}
	
	@Test
	public void createtreetwo() {
		
		
		BST bstt = new BST();
		
		int [] input = { 10,5,2,6,13,11,14};
		
		for (int i=0; i<input.length ;i++) {
			bstt.insert(input[i]);
			
			
		}
		
			
		
		bstt.display();
		System.out.println(bstt.height(bstt.root));
		System.out.println(bstt.balanced(bstt.root));
		System.out.println("end of initial display and balance");
		System.out.println("Here is the sorted output");
		bstt.inOrder(bstt.root);
		//bstt.preOrder(bstt.root);
		
	}
	
	

}
