package imhungry;

import java.util.Scanner;

public class fries{
	Scanner sc = new Scanner(System.in);
	public static double  subtotal1 = 0.0;
	public static double buy(Scanner sc) {
		System.out.println("how many fries would you like to buy each is $1.30");
		int amt = sc.nextInt();
		 subtotal1 += amt * 1.30;
		 return subtotal1;



	}// end of buy function
}