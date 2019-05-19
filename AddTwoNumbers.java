import java.util.Scanner;
public class AddTwoNumbers {

  private static Scanner sc;

  public static void main(String[] args) {
    double total = 0;
    int nummer1,nummer2;

    sc = new Scanner(System.in);

      System.out.println("Geben Sie eine Nummer ein ");
      nummer1= sc.nextInt();

      System.out.println("Geben sie noch eine Nummer ein ");
      nummer2= sc.nextInt();

      System.out.println("AddTwoNumbers");
      total = nummer1 + nummer2;
      
      System.out.print("Der Summe von ("+ nummer1 + " + " + nummer2 + ") ist = " + total);
  }
}