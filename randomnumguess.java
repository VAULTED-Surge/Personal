import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(21);

    boolean correct = false;
    while (correct == false){
      Scanner sc = new Scanner(System.in);
      System.out.println("Guess a number between 0 and 20");
      int guess = sc.nextInt();
      if (guess == num){
        System.out.println("Correct!");
        correct = true;
      }
    }
  }
}