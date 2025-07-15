import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your grade");
  int grade = sc.nextInt();
  if (grade > 89){
    System.out.println("A");
  }
  if (grade > 79 && grade < 90){
    System.out.println("B");
  }
  if (grade > 69 && grade < 80){
      System.out.println("C");
  }
  if (grade > 59 && grade < 70){
      System.out.println("D");
  }
  if (grade < 60){
      System.out.println("F");
  }

  sc.close();


  }
}