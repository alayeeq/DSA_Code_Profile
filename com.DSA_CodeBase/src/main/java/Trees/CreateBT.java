package Trees;

import org.junit.Test;
import java.util.Scanner;

public class CreateBT {
	
	
	@Test
	public void testBT() {
	BinaryTree bt = new BinaryTree();
	Scanner sc = new Scanner(System.in);
	bt.populate(sc);
	
	bt.display();
			
			
	}

}
