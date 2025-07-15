import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  Scanner num = new Scanner(System.in);
  System.out.println("Enter number: ");
  int num1 = num.nextInt();
  num.close();
  int counter = 1;
  String str = String.valueOf(num1);
  List<Character> list = new ArrayList<>();
  for (char x : str.toCharArray()) {
  list.add(x);
  }

    for (char c : list){
    System.out.println( counter + "  digit is " + c);
    counter = counter + 1;
    }
  }
  
    
  }


