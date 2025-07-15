import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner birth = new Scanner(System.in);
  System.out.println("Enter your birth year: ");
  int year = birth.nextInt();
  birth.close();
  int age = 2025 - year;
  System.out.println("You are " + age + " years old.");
  int months = age * 12;
  System.out.println("You are " + months + " months old.");
  int days = age * 365;
  int sleep = days * 8;
  System.out.println("You have slept for " + sleep + " hours.");
  System.out.println("You have been alive for " + days + " days.");
  }


}