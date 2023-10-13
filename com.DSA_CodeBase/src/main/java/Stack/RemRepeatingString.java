package Stack;

import org.junit.Test;
import java.util.Stack;

public class RemRepeatingString {

	@Test
	public void test2() {

		String input = "eeecccaaa";
		int k = 3;

		removeRepeat(input, k);
	}	
	//@Test
	public void test1() {

		String input = "deeedbbcccbdaa";
		int k = 3;

		removeRepeat(input, k);
	}

	private void removeRepeat(String input, int k) {
		// TODO Auto-generated method stub

		char[] abc = input.toCharArray();

		Stack<Character> st = new Stack();

		boolean cleared = false;

		int counter = 0;

		for (int i = 0; i < abc.length; i++) {

			if (st.isEmpty()) {

				st.add(abc[i]);
			} else {
				if (st.peek() == abc[i])
				{

					if (cleared) {
						for (int a = 0; a < k - 1; a++) {

							if (st.size() - 1 - a > 0 && st.get(st.size() - 1 - a) == abc[i])
								counter++;

							else
								cleared = false;
							break;
						}
					}
					st.add(abc[i]);
					counter++;

				}

				else {
					st.add(abc[i]);
					counter = 0;

				}

				if (counter == k - 1) {

					while (counter >= 0) {

						st.pop();
						counter--;
					}
					cleared = true;
					counter = 0;
				}

			}

		}

		System.out.println(st);
	}

}
