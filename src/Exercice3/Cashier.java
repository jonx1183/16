package Exercice3;
import java.util.Scanner;
public class Cashier {

  private int milkBoxes;
  private double price;
  private double total;
  private double given;
  private double rest;
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Cashier main = new Cashier();

    main.go();
  }

  public void go(){
    System.out.println(cashRegister());
    System.out.println(rest());
  }

  public double cashRegister(){
    System.out.print("How many items?: ");
    milkBoxes = sc.nextInt();
    System.out.print("What is the price pr. item?: ");
    price = sc.nextDouble();

    total = price * milkBoxes;

    return total;
  }

  public double rest(){
    System.out.print("How much does the costumer give?: ");
    given = sc.nextDouble();

    if(given > total){
      rest = given - total;
    }
    else rest = 0.00;

    return rest;
  }
}
