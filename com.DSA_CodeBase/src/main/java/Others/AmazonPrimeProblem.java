package Others;

import org.junit.Test;

public class AmazonPrimeProblem {

	@Test
	public void test1() {

		int[] comedyBegin = { 1, 2, 3 };
		int[] comedyDur = { 1, 1, 1 };
		int[] dramaBegin = { 1, 2, 3 };
		int[] dramaDur = { 6, 8, 1 };

		System.out.println(findBestEndTime(comedyBegin, comedyDur, dramaBegin, dramaDur));
	}

	@Test
	public void test2() {

		int[] comedyBegin = { 13, 14, 15 };
		int[] comedyDur = { 1, 1, 1 };
		int[] dramaBegin = { 13, 14, 15 };
		int[] dramaDur = { 6, 8, 1 };

		System.out.println(findBestEndTime(comedyBegin, comedyDur, dramaBegin, dramaDur));
	}

	@Test
	public void test3() {

		int[] comedyBegin = { 4, 5, 6 };
		int[] comedyDur = { 1, 1, 1 };
		int[] dramaBegin = { 1, 2, 3 };
		int[] dramaDur = { 7, 8, 7 };

		System.out.println(findBestEndTime(comedyBegin, comedyDur, dramaBegin, dramaDur));
	}

	@Test
	public void test4() {

		int[] comedyBegin = { 13, 14, 15 };
		int[] comedyDur = { 1, 1, 1 };
		int[] dramaBegin = { 10, 11, 12 };
		int[] dramaDur = { 7, 8, 1 };

		System.out.println(findBestEndTime(comedyBegin, comedyDur, dramaBegin, dramaDur));
	}

	public int findBestEndTime(int[] comedyBegin, int[] comedyDur, int[] dramaBegin, int[] dramaDur) {
		return Math.min(comBDrama(comedyBegin, comedyDur, dramaBegin, dramaDur),
				dramaBCom(comedyBegin, comedyDur, dramaBegin, dramaDur));
	}

	private int comBDrama(int[] comedyBegin, int[] comedyDur, int[] dramaBegin, int[] dramaDur) {
		int eoc = 100000000;
		for (int i = 0; i < comedyBegin.length; i++) {
			int end = comedyBegin[i] + comedyDur[i];
			if (end < eoc)
				eoc = end;
		}
		int eod = 100000000;
		for (int i = 0; i < dramaBegin.length; i++) {
			/*if (dramaBegin[i] >= eoc) {
				int end = dramaBegin[i] + dramaDur[i];
				if (end < eod)
					eod = end;
			}*/
			
			int begin = Math.max(dramaBegin[i], eoc);
			eod = Math.min(eod, begin + dramaDur[i]);
			
		}
		return eod;
	}

	private int dramaBCom(int[] comedyBegin, int[] comedyDur, int[] dramaBegin, int[] dramaDur) {
		int eod = 100000000;
		for (int i = 0; i < dramaBegin.length; i++) {
			int end = dramaBegin[i] + dramaDur[i];
			if (end < eod)
				eod = end;
		}
		int eoc = 100000000;
		for (int i = 0; i < comedyBegin.length; i++) {
			/*if (dramaBegin[i] >= eoc) {
				int end = comedyBegin[i] + comedyDur[i];
				if (end < eoc)
					eoc = end;
			}*/
			
			int begin = Math.max(comedyBegin[i], eod);
			eoc = Math.min(eoc, begin + comedyDur[i]);
			
		}
		return eoc;

	}

}
