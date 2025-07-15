import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Cube, Sphere, or prism:");
    String shape = sc.nextLine();
    if (shape.equalsIgnoreCase("cube")){
      System.out.println("Enter side length:");
      int cube_side = sc.nextInt();
      System.out.println("Volume: " + cube_side * cube_side * cube_side);
    }
    if (shape.equalsIgnoreCase("sphere")){
      System.out.println("Enter radius:");
      int sphere_radius = sc.nextInt();
      System.out.println("Volume: " + (4/3) * Math.PI * sphere_radius * sphere_radius * sphere_radius);
    }
    if (shape.equalsIgnoreCase("prism")){
      System.out.println("Enter length:");
      int prism_length = sc.nextInt();
      System.out.println("Enter height:");
      int prism_height = sc.nextInt();
      System.out.println("Enter width:");
      int prism_width = sc.nextInt();
      System.out.println("Volume: " + prism_length * prism_height * prism_width);
    }
    sc.close();
  }
}