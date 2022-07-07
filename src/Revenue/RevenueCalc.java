package Revenue;

import java.util.Scanner;

public class RevenueCalc {
  private int price;
  private int discount;
  private int unit;
  private double sale;
  private double dSale;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    RevenueCalc main = new RevenueCalc();

    main.go();
  }
  public void go(){
    dCalc();
    calc();
    System.out.println(sale);
    System.out.println(dSale);

  }

  public void dCalc(){
    System.out.print("Unit price: ");
    price = sc.nextInt();
    System.out.print("Unit amount: ");
    unit = sc.nextInt();

    if(unit > 99 && unit < 121){
      discount = 10;
    }
    else if(unit > 120){
      discount = 15;
    }
    else discount = 0;
  }

  public void calc(){
    sale = price * unit;

    if(discount !=0) {
      double saleP = sale / 100 * discount;

      dSale = sale - saleP;
    }

    else dSale = sale;

  }
}


