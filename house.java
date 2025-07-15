public class Main {

  public static void main(String[] args) {
    Main drawhouse = new Main();  

    drawhouse.roof();
    drawhouse.walls();
    drawhouse.walk();
  }

  public void roof() {
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /____\\");
  }

  public void walls() {
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("|______|");
  }

  public void walk() {
    System.out.println("   ***");
    System.out.println(" **********");
  }
}
