package Trees;

import org.junit.Test;

import Trees.BST.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class SumofEachLevel {
	
	
	 		/*
	 		 *  step 1 
	 		 *  	get the node and add it to a list1 and its chidren to list two
	 		 * 		traverse all the childnode list and store all of it child node in list if they exist
	 		 * 		repeat this exerecie untill all the nodes are exhausted
	 		 * 		create another list of list of same length and load the corresponding value in the lists and print the list
	 		 * 
	 		 *    	 
	 		 * 
	 		 * 
	 		 */
	
	
	
	@Test
	public void ListByLevel() {
		
		
		BST bstt = new BST();
		
		int [] input = { 10,5,2,6,13,11,14};
		
		for (int i=0; i<input.length ;i++) {
			bstt.insert(input[i]);
			
			
		}
		
	System.out.println(	getList(bstt.root));
		
		
	}
	
	private List<List<Integer>> getList(Node root) {
				// TODO Auto-generated method stub
		
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		if (root == null) return output;
		Queue <BST.Node> qu = new LinkedList<BST.Node>();
		
		
		qu.offer(root);
		
		while(!qu.isEmpty()) {
		
			ArrayList <Integer> ls = new ArrayList<Integer>();
			int limit = qu.size();
		for (int i=0; i<limit;i++) {
			
			BST.Node temp = qu.poll();
			
			ls.add(temp.value);
			
			if(temp.left !=null) qu.offer(temp.left);
			if(temp.right !=null) qu.offer(temp.right);
			
		}
		
		output.add(ls);
		}
			
		return output;
			}

	//@Test
	public void createtreetwo() {
		
		
		BST bstt = new BST();
		
		int [] input = { 10,5,2,6,13,11,14};
		
		for (int i=0; i<input.length ;i++) {
			bstt.insert(input[i]);
			
			
		}
		
		ArrayList<ArrayList<BST.Node>> ovl = new  ArrayList<ArrayList<BST.Node>>();
		
		ovl = loadRootanditschidl (bstt.root);
		
		ArrayList<BST.Node> first_child_set = ovl.get(1);
		
		
		ovl.addAll(get_allLevelList(first_child_set));
		
		System.out.println("here is output of level ");
		
		for (ArrayList<BST.Node> abt :ovl ) {
			
			for (BST.Node nd : abt ) {
				
			System.out.println(	nd.value);
				
			}
			System.out.println("here is output of inner level ");
			
		}
		
		
	}

			private ArrayList<ArrayList<BST.Node>>  get_allLevelList(ArrayList<Node> first_child_set) {
				// TODO Auto-generated method stub
				
				ArrayList<ArrayList<BST.Node>> temp_all = new ArrayList<ArrayList<BST.Node>>();
				
				ArrayList<BST.Node> temp = new ArrayList<BST.Node> ();
				
				for (BST.Node node :first_child_set ) {
					
					if(node.left!=null)temp.add(node.left);
					
					if(node.right!=null)temp.add(node.right);
				}
				
			  if (temp.size()==0) return temp_all;	
			  temp_all.add(temp);
				temp_all.addAll(get_allLevelList(temp));
				
				return temp_all;
				
				
			}

			private ArrayList<ArrayList<BST.Node>> loadRootanditschidl(Node root) {
				// TODO Auto-generated method stub
				
				ArrayList<ArrayList<BST.Node>> ovl_temp = new  ArrayList<ArrayList<BST.Node>>();
				
				ArrayList<BST.Node> cl = new ArrayList<BST.Node> ();
				cl.add(root);
				
				ArrayList<BST.Node> cl_c = new ArrayList<BST.Node> ();
				if(root.left!=null)cl_c.add(root.left);
				
				if(root.right!=null)cl_c.add(root.right);
				
				ovl_temp.add(cl);
				ovl_temp.add(cl_c);
				
				
				return ovl_temp;
				
				
			}
	

}
