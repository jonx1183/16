package Interest;

import java.util.Scanner;

public class Interest {

  private double deposit;
  private double interest;
  private double tax;
  private double afterInterest;
  private double afterTax;
  private double yearlyInterest;
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Interest main = new Interest();

    main.go();
  }

  public void go(){
    calculator();

  }

  public void calculator(){
    System.out.print("Enter amount to deposit: ");
    deposit = sc.nextDouble();
    System.out.print("Enter interest rate: ");
    interest = sc.nextDouble();
    System.out.print("Enter tax rate: ");
    tax = sc.nextDouble();

    afterInterest = deposit / 100 * interest;

    afterTax = afterInterest / 100 * tax;

    yearlyInterest = afterInterest - afterTax;

    System.out.println(yearlyInterest);

  }
}
