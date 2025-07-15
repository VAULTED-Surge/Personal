import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Main hotorcold = new Main();
    Random rand = new Random();
    int num = rand.nextInt(21);

    boolean correct = false;
    Scanner sc = new Scanner(System.in);

    while (correct == false) {
      System.out.println("Guess a number between 0 and 20:");
      int guess = sc.nextInt();

      if (guess == num) {
        System.out.println("Correct!");
        correct = true;
      } else {
        hotorcold.hotorcold(guess, num); 
      }
    }

    sc.close();
  }
    public void hotorcold(int guess, int num) {
    if (guess > num) {
      System.out.println("Cold");
    } else {
      System.out.println("Hot");
    }
  }
}