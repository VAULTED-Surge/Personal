// 7/26/2025
// lunch menu
// ap computer science
package lunch2;

import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {
		boolean done = false;
		double mastotal = 0;
		Scanner sc = new Scanner(System.in);
		
		
		MenuItem hamburger = new MenuItem ("Hamburger", 1.85, 200, 18, 2);
		MenuItem fries = new MenuItem ("Fries", .85, 400, 28, 2);
		MenuItem salad = new MenuItem ("Salad", 2.00, 11, 5, 5);
		MenuItem soda = new MenuItem ("soda", .95, 0, 38, 0);
		
		
		System.out.println(hamburger);
		System.out.println(fries);
		System.out.println(salad);
		System.out.println(soda);
		
while (done == false) {
	System.out.println("press 1 for burgers");
	System.out.println("press 2 for fries");
	System.out.println("press 3 for salads");
	System.out.println("press 4 for soda");
	System.out.println("press 5 for checkout");
	int choice = sc.nextInt();
		if (choice == 1) { 
			System.out.println("how many burgers would you like to buy"); 
			int bamt = sc.nextInt();
			
			mastotal += bamt * hamburger.getPrice();
			System.out.println("you bought"+ bamt + "burgers");
			
		}
		if (choice == 2) { 
			System.out.println("how many fries would you like to buy"); 
			int famt = sc.nextInt();
			
			mastotal += famt * fries.getPrice();
			System.out.println("you bought"+ famt + "fries");
			
		}
		
		if (choice == 3) { 
			System.out.println("how many salads would you like to buy"); 
			int samt = sc.nextInt();
			
			mastotal += samt * salad.getPrice();
			System.out.println("you bought"+ samt + "salads");
			
		}
		
		if (choice == 4) { 
			System.out.println("how many sodas would you like to buy"); 
			int pamt = sc.nextInt();
			
			mastotal += pamt * soda.getPrice();
			System.out.println("you bought"+ pamt + "sodes");
			
		}
		if (choice ==5 ) {
			done = true;
		}



}
		System.out.println("your total is " + mastotal);
		
		sc.close();
	
	}
}

// end of main function
// end of program

