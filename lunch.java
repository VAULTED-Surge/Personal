import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("how many hamburgers would you like?");
  System.out.println("fat(g) 9, Carbohydrates(g) 33, fiber(g) 1");
  int ham = sc.nextInt();
  System.out.println("how many salads would you like?");
  System.out.println("fat(g) 1, Carbohydrates(g) 11, fiber(g) 5");
  int sal = sc.nextInt();
  System.out.println("how many french fries would you like?");
  System.out.println("fat(g) 11, Carbohydrates(g) 36, fiber(g) 4");
  int fries = sc.nextInt();
  System.out.println("how many sodas would you like?");
  System.out.println("fat(g) 0, Carbohydrates(g) 38, fiber(g) 0");
  int soda = sc.nextInt();
  double cost = 0;
  cost = cost + (ham * 1.85);
  cost = cost + (sal * 2.00);
  cost = cost + (fries * 1.30);
  cost = cost + (soda * 0.95);
  System.out.println("your total is $" + cost);
  sc.close();
  }
}