import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  System.out.println("Enter fist number");
  int n1 = sc.nextInt();
  System.out.println("Enter second number");
  int n2 = sc2.nextInt();
  while (n2 > 0){
    int temp = n1 % n2;
    n1 = n2;
    n2 = temp;
    
  }
  System.out.println("GCD is " + n1);
  }
}