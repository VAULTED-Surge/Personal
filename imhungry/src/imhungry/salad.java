package imhungry;

import java.util.Scanner;

public class salad{
	Scanner sc = new Scanner(System.in);
	public static double  subtotal1 = 0.0;
	public static double buy(Scanner sc) {
		System.out.println("how many salads would you like to buy each is $2.00");
		int amt = sc.nextInt();
		 subtotal1 += amt * 2.00;
		 return subtotal1;
	}
}