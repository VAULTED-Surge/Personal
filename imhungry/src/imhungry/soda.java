package imhungry;

import java.util.Scanner;

public class soda{
	Scanner sc = new Scanner(System.in);
	public static double  subtotal1 = 0.0;
	public static double buy(Scanner sc) {
		System.out.println("how many sodas would you like to buy each is $0.95");
		int amt = sc.nextInt();
		 subtotal1 += amt * 0.95;
		 return subtotal1;



	}// end of buy function
}