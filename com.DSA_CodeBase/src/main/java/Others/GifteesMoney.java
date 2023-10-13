package Others;

import org.junit.Test;

public class GifteesMoney {

	/*
	 * money and giftees
	 * 
	 * if money/(8*giftees) >=1 returns giftees
	 * 
	 * 
	 * else helper method (giftees -1 , money, original_giftees) temp_giftees =
	 * giftees -1; giftee_diff = original_giftees - temp_giftees float temp_chek =
	 * money/(8*temp_giftees) excess_money = money- (temp_giftees*8)
	 * 
	 * if temp_chek >=1 && ( excess_money ==4 && giftee_diff ==1) - checks if only
	 * $4 is remaining and person || temp_chek >=1 && (excess_money/(giftee_diff)
	 * <1)
	 * 
	 * { helper method (giftees -1 , money, original_giftees) }
	 * 
	 * else return giftees -1
	 * 
	 * }
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {

		int money = 100;
		int chidren = 13;

		// System.out.println(giftnmoney(money , chidren));
		System.out.println(giftnmoney_two(money, chidren));

	}

	@Test
	public void test2() {

		int money = 12;
		int chidren = 2;

		// System.out.println(giftnmoney(money , chidren));
		System.out.println(giftnmoney_two(money, chidren));

	}

	@Test
	public void test3() {

		int money = 24;
		int chidren = 4;

		// System.out.println(giftnmoney(money , chidren));
		System.out.println(giftnmoney_two(money, chidren));

	}

	@Test
	public void test4() {

		int money = 100;
		int chidren = 2;

		// System.out.println(giftnmoney(money , chidren));
		System.out.println(giftnmoney_two(money, chidren));

	}

	@Test
	public void test5() {

		int money = 100;
		int chidren = 12;

		// System.out.println(giftnmoney(money , chidren));
		System.out.println(giftnmoney_two(money, chidren));

	}

	private int giftnmoney_two(int money, int chidren) {
		// TODO Auto-generated method stub

		float Is_Original_total_money_enough = money / (8 * chidren);

		if (Is_Original_total_money_enough >= 1)
			return chidren;

		else
			return giftnmoney_two_helper(money, chidren, chidren - 1);

	}

	private int giftnmoney_two_helper(int money, int orginal_chidren, int children) {

		int giftee_diff = orginal_chidren - children;
		float temp_chek = money / (8 * children);
		int excess_money = money - (children * 8);

		if (temp_chek >= 1 && (excess_money == 4 && giftee_diff == 1)) // checks if only $4 is remaining and person
		{

			return 0;

		}

		else if (temp_chek >= 1 && (excess_money / (giftee_diff) < 1)) {
			return giftnmoney_two_helper(money, orginal_chidren, children - 1);
		}

		else
			return children;

	}

}
