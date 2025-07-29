// 7/26/2025
// lunch menu
// ap computer science
package imhungry;



import java.util.Scanner;

public class lunch {

public static void main(String[] args) {

double mastotal = 0;
Scanner sc = new Scanner(System.in);
System.out.println("welcome to the menu");
System.out.println("1. to purchase burger");
System.out.println("2. to purchase fries");
System.out.println("3. to purchase soda");
System.out.println("4. to purchase salad");
System.out.println("press 5 to checkout");
boolean done = false;
while (done == false) {
System.out.print("enter here next option here: ");
int choice = sc.nextInt();
switch (choice) {
case 1 -> mastotal += burger.buy(sc);
case 2 -> mastotal += fries.buy(sc);
case 3 -> mastotal += soda.buy(sc);
case 4 -> mastotal += salad.buy(sc);
case 5 -> done = true;
}// end of switch
}// end of loop







System.out.println("your total is " + mastotal);
sc.close();
}


}
// end of main function
  // end of program

